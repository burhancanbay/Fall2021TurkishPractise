package atm;

import java.util.Scanner;

public class atm {

	static String sifrem = "1234";
	static String kartNumaram = "123456";
	static double bakiye;

	public static void main(String[] args) {
		/*
		 * ATM Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi
		 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda boşluk ile
		 * girerse de eger doğruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
		 * kullanicinin yapabileceği işlemleri ekrana yazdirin, Bakiye sorgula, para
		 * yatirma, para çekme, para gönderme, sifre değiştirme ve cikis. Para çekme ve
		 * para gonderme işleminde mevcut bakiyeden buyuk para çekilemez, Para gönderme
		 * işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger
		 * değilse menü ekranina geri donsun. Sifre değiştirme işleminde mevcut şifreyi
		 * teyit ettikten sonra, sifre değişiklik işlemini yapmali,
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("JAVA BANKA HOSGELDINIZ");

		String kart = "";
		String sifre = "";

		do {
			System.out.println("Kart numaranizi giriniz");
			kart = scan.nextLine();

			System.out.println("Lutfen sifrenizi giriniz");
			sifre = scan.nextLine();

			if (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram)) {
				System.out.println("Hatali giris yaptiniz");

			}
		} while (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram));

		ekran();
	}

	private static void ekran() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sifreniz dogrulandi");

		char secim = ' ';
		do {
			System.out.println(
					"Lutfen yapmak istediginiz islemi giriniz\nA->Bakiye sorgulama\nB->Para cekme\nC->Para yatirma"
							+ "\nD->Para gonderme\nE->Sifre degistirme\nF->Cikis");
			secim = scan.next().toUpperCase().charAt(0);
			switch (secim) {
			case 'A':
				bakiyesorgula();
				break;
			case 'B':
				paraCekme();
				break;
			case 'C':
				paraYatirma();
				break;
			case 'D':
				paraGonderme();
				break;
			case 'E':
				sifreDegistir();
				break;
			case 'F':
				System.out.println("Cikis basarili");
				break;

			default:
				System.out.println("Lutfen gecerli bir islem seciniz");
				break;
			}
		} while (secim != 'F');

	}

	private static void sifreDegistir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen mevcut sifrenizi giriniz");
		String MevcutSifre = scan.nextLine();

		if (MevcutSifre.equals(sifrem)) {
			System.out.println("Yeni sifreyi giriniz");
			sifrem = scan.nextLine();
			System.out.println("Sifreniz degistirildi");
		} else {
			System.out.println("Sifreniz uyusmuyor");
		}

	}

	private static void paraGonderme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen para gondereceginiz IBAN numarasini giriniz");
		String IBAN = scan.nextLine().toUpperCase();

		if (IBAN.startsWith("TR") && IBAN.replaceAll("\\s", "").length() == 26) {
			System.out.println("Gonderilecek tutari giriniz");
			double gonderilecekTutar = scan.nextDouble();
			if (gonderilecekTutar <= bakiye) {
				bakiye -= gonderilecekTutar;
				System.out.println("Paraniz gonderildi\nMevcutbakiyeniz : " + bakiye);
			} else {
				System.out.println("Bakiyeniz yetersiz");
			}
		} else {
			System.out.println("Gecersiz IBAN girdiniz.");
		}

	}

	private static void paraYatirma() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yatirmak istediginiz tutari giriniz.");
		double yatirilanTutar = scan.nextDouble();

		bakiye += yatirilanTutar;
		System.out.println("Islem Basarili.\nMevcut bakiyeniz : " + bakiye);

	}

	private static void paraCekme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cekmek istediginiz tutari giriniz.");
		double cekilenTutar = scan.nextDouble();
		if (cekilenTutar <= bakiye) {
			bakiye -= cekilenTutar;
			System.out.println("Islem basarili.\nMevcut bakiyeniz : " + bakiye);
		} else {
			System.out.println("Bakiye yetersiz");
		}

	}

	private static void bakiyesorgula() {

		System.out.println("Bakiyeniz : " + bakiye + " TL");

	}

}
