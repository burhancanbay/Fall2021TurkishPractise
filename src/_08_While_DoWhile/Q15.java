package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		 * Problem Tanımı Verilen iki sayının kombinasyonunu bulan kodu yazınız.
		 * Hatırlatma C(n,r) = n! / (r!(n-r)!)
		 * 
		 * Ekran Çıktısı Birinci sayıyı giriniz: 15 Ikinci sayıyı giriniz: 4
		 * Kombinasyon: 1365
		 * 
		 * Birinci sayıyı giriniz: 5 Ikinci sayıyı giriniz: 3 Kombinasyon: 10
		 * 
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("1.tamsayiyi giriniz : ");
		int n = scan.nextInt();
		System.out.print("2.tamsayiyi giriniz : ");
		int r = scan.nextInt();
		int sayi1 = n;
		int sayi2 = r;
		int sayi3 = n-r;
		
		int fak1 = 1;
		int fak2 = 1;
		int fak3 = 1;
		int sonuc = 1;

		do {
			fak1 *= sayi1;
			sayi1--;
		} while (sayi1 >= 1);

		
		do {
			fak2 *= sayi2;
			sayi2--;
		} while (sayi2 >= 1);

		
		do {
			fak3 *= sayi3;
			sayi3--;
		} while (sayi3 >= 1);

		sonuc = fak1 / (fak2 * fak3);

		System.out.println("C(" + n + "," + r + ")" + "=" + sonuc);
		scan.close();
	}
}
