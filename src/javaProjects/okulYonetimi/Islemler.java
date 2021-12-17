package javaProjects.okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.

	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
		Kayıtlarda şu bilgiler olabilmelidir.

		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
		Aşağıdaki gibi bir menü gösterilsin.

	====================================
	 Ö�?RENCİ VE Ö�?RETMEN YÖNETİM PANELİ
	====================================
	 1- Ö�?RENCİ İ�?LEMLERİ
	 2- Ö�?RETMEN İ�?LEMLERİ
	 Q- ÇIKI�?

	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	============= İ�?LEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKI�?

	SEÇİMİNİZ:

	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
		Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.

 */

public class Islemler {

	static List<Kisi> ogrenciList = new ArrayList<Kisi>();
	static List<Kisi> ogretmenList = new ArrayList<Kisi>();
	static Scanner scan = new Scanner(System.in);
	static String kisiTuru;

	public static void anaMenu() {
		System.out.println("====================================\n" + "     Ö�?RENCİ VE Ö�?RETMEN YÖNETİM PANELİ\n"
				+ "    ====================================\n" + "     1- Ö�?RENCİ İ�?LEMLERİ\n"
				+ "     2- Ö�?RETMEN İ�?LEMLERİ\n" + "     Q- ÇIKI�?\n" + "");

		System.out.println("Isleminizi seciniz : ");
		String secim = scan.next().toUpperCase();

		switch (secim) {
		case "1":
			kisiTuru = "ogrenci";
			islemMenusu();
			break;
		case "2":
			kisiTuru = "ogretmen";
			islemMenusu();
			break;
		case "3":
			cikis();
			break;

		default:
			System.out.println("hatali giris yaptiniz");
			anaMenu();
			break;
			
		}

	}

	private static void cikis() {
		// TODO Auto-generated method stub

	}

	private static void islemMenusu() {
		System.out.println("3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.\r\n"
				+ "============= İ�?LEMLER =============\r\n" + "     1-EKLEME\r\n" + "     2-ARAMA\r\n"
				+ "     3-LİSTELEME\r\n" + "     4-SİLME\r\n" + "     5-ANA MENÜ\r\n" + "     0-ÇIKI�?");

		System.out.println("Islem tercihinizi giriniz : ");
		int tercih = scan.nextInt();

		switch (tercih) {
		case 0:
			anaMenu();
			break;
		case 1:
			ekleme();
			islemMenusu();
			break;
		case 2:
			arama();
			islemMenusu();
			break;
		case 3:
			listeleme();
			islemMenusu();
			break;
		case 4:
			silme();
			islemMenusu();
			break;
		

		default:
			System.out.println("hatali giris yaptiniz");
			break;
		}

	}

	

	private static void silme() {
		
		System.out.println("*********   "+kisiTuru+" silme sayfasi  *********");
		boolean kontrol=true;
		
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("silinecek ogrenci kimlik no giriniz : ");
			String silOgrcKimlik=scan.next();
			
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(silOgrcKimlik)) {
					ogrenciList.remove(k);
					System.out.println("silinen ogrenci"+k);
					kontrol=false;
				} 
			}
			if (kontrol) {
				System.out.println("Aradiginiz ogrenci bulunamadi");
			}
		} else {
			System.out.println("aradiginiz ogretmen kimlik no giriniz : ");
			String silOgrtKimlik=scan.next();
			
			for (Kisi k : ogretmenList) {
				if (k.getKimlikNo().contains(silOgrtKimlik)) {
					ogretmenList.remove(k);
					kontrol=false;
				} 
			}
			if (kontrol) {
				System.out.println("Aradiginiz ogretmen bulunamadi");
			}
		}
		

	}

	private static void listeleme() {
		
		 System.out.println("******   "+kisiTuru+" Listeleme sayfası  ******");
	        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
	     
			for (Kisi k : ogrenciList) {
	            System.out.println(k.toString());
	        }
	        }else {
	            for (Kisi k : ogretmenList) {
	            System.out.println(k.toString());   
	            
	            
	            }
	        }
	}

	private static void arama() {
		
		System.out.println("*********   "+kisiTuru+" arama sayfasi  *********");
		boolean kontrol=true;
		
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("aradiginiz ogrenci kimlik no giriniz : ");
			String araOgrcKimlik=scan.next();
			
			
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(araOgrcKimlik)) {
					  System.out.println("aradiginiz ogrenci : " + k.getAdSoyad());
					kontrol=false;
				
				} 
			}
			if (kontrol) {
				System.out.println("Aradiginiz ogrenci bulunamadi");
			}
		} else {
			System.out.println("aradiginiz ogretmen kimlik no giriniz : ");
			String araOgrtKimlik=scan.next();
			
			for (Kisi k : ogretmenList) {
				if (k.getKimlikNo().contains(araOgrtKimlik)) {
					  System.out.println("aradiginiz ogretmen : " + k.getAdSoyad());
					kontrol=false;
				} 
			}
			if (kontrol) {
				System.out.println("Aradiginiz ogretmen bulunamadi");
			}
			
		}
		
	}

	private static void ekleme() {
		
		System.out.println("*********   "+kisiTuru+" ekleme sayfasi  *********");
		System.out.println("Ad soyad giriniz");
		
		String adSoyad=scan.next();
		
		System.out.println("Kimlik no giriniz");
		String kimlikNo=scan.next();
		
		System.out.println("Yas giriniz");
		int yas=scan.nextInt();
		
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("ogrenci no giriniz");
			String numara=scan.next();
			System.out.println("Sinifi giriniz");
			String sinif=scan.next();
			
			Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
			ogrenciList.add(ogrenci);
			System.out.println(ogrenciList.toString()+" eklendi");
		} else {
			System.out.println("sicil no giriniz");
			String sicilNo=scan.next();
			
			System.out.println("Bolum giriniz");
			String bolum=scan.next();
			
			Ogretmen ogrt=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
			ogretmenList.add(ogrt);
			System.out.println(ogretmenList.toString()+" eklendi");
		}
		
		

	}

}
