package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8

    	Scanner scan=new Scanner(System.in);
		  System.out.print("Uslu bir sayi icin taban giriniz : ");
		  int taban=scan.nextInt();
		  System.out.print("Uslu bir sayi icin us giriniz : ");
		  int us=scan.nextInt();
		  int sayac=1;
		  int sonuc=1;
		  do {
			 
             sonuc*=taban;
		     sayac++;
					
		} while (sayac<=us);
		  System.out.println(taban+" uzeri "+us+" = "+sonuc);

		  scan.close();
    }


}
