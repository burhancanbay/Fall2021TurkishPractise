package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */

    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("bir tamsayi giriniz : ");
    	  int sayi=scan.nextInt();
    	  int faktoriyel=1;
    	  int sayi1=sayi;
    	  do {
			faktoriyel*=sayi1;
			sayi1--;
		} while (sayi1>=1);

    	  System.out.println(sayi+"!= "+faktoriyel);
    	  scan.close();
    }
}


