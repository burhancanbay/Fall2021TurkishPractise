package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // --------GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

    	Scanner scan = new Scanner(System.in);
		System.out.print("bir tamsayi giriniz : ");
		int sayi = scan.nextInt();
    	int toplam=0;
    	
    	
	while (sayi>0) {

		toplam+=sayi%10;
		sayi/=10;
	}
		
		System.out.println("Girdiginiz sayinin rakamlari toplami : "+toplam);
		
		scan.close();
    }

}
