package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println("dort islemden birini seciniz ");
		System.out.println("toplama icin-> 1\ncikarma icin-> 2\ncarpma icin-> 3\nbolme icin-> 4'e basiniz");
		int islemTipi=scan.nextInt();
		
		if (islemTipi==1) {
			System.out.println("Islem sonucu : "+(sayi1+sayi2));
		} else if (islemTipi==2) {
			System.out.println("Islem sonucu : "+(sayi1-sayi2));
		} else if (islemTipi==3) {
			System.out.println("Islem sonucu : "+sayi1*sayi2);
		} else if (islemTipi==4) {
			System.out.println("Islem sonucu : "+sayi1/sayi2);
		} else {
            System.out.println("Lutfen 1 ve 4 arasinda bir sayi giriniz");
		

		}
scan.close();

		
		
		
	}

}
