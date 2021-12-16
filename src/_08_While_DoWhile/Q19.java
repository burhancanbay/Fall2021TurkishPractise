package _08_While_DoWhile;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		/*
		 * Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana
		 * yazdırınız. girilen sayı dahil
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir tamsayi giriniz : ");
		int sayi = scan.nextInt();
		int sayac = 1;
		while (sayi >= sayac) {
			if (sayac % 2 == 1) {
				System.out.print(sayac+" ");
			}
			sayac++;
		}
		scan.close();
	}
}
