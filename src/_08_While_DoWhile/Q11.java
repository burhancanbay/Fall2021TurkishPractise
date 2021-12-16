package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

	/*
	 * Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tamkare ise
	 * true değilse false yazdırınız.
	 * 
	 * Not: sqrt gibi fonksiyonları kullanmayın.
	 * 
	 * Example 1: Input: 16 Output: true Not: bu sayı tamkare çünkü 4*4 = 16
	 * 
	 * Example 2: Input: 25 Output: true Note: bu sayı tamkare çünkü 5*5=25
	 * 
	 * 
	 * Example 3: Input: 14 Output: false
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi giriniz  : ");
		int sayi = scan.nextInt();
		int kokSayi = 1;
		while (kokSayi < sayi) {
			if (sayi == kokSayi*kokSayi) {
				System.out.println("Girdiginiz sayi tamkaredir");
			break;
			} 
			kokSayi++;
	}
		if (sayi!=kokSayi*kokSayi) {
			System.out.println("Girdiginiz sayi tamkare degildir");
		}
		scan.close();
}
}
