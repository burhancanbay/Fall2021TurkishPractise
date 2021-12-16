package _08_While_DoWhile;

import java.util.Scanner;

public class C15 {

	public static void main(String[] args) {
		// kullanicinin girdigi sayinin faktoriyelini hesaplayan bir kod yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("bir tamsayi giriniz : ");
		int sayi = scan.nextInt();
		int fak = 1;
		do {
			fak *= sayi;
			sayi--;
		} while (sayi >= 1);
		System.out.println(fak);
		scan.close();
	}

}
