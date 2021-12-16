package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullaniciya    "Vize sinav sonucunuzu giriniz :"
        2.vize notu double degerinde girilecek.

        3. Kullaniciya  "Vize sinavi yuzdesini giriniz". ->> double olmali ->> 0,40 etkiliyor   !!Yuzde kac etkiledigini Sisteme siz giriyorsunuz.!!

        4.Kullaniciya    "Final sinav sonucunuzu giriniz.

        5. final notu double degerinde olmali. (orn: 65,5)

        6.Kullaniciya    "Final sinavi yuzdesini giriniz"-->> double olmali ->> 0,60 etkiliyor.

        7. Vize final ortalamasini bulmak icin, vize nin yuzde40 i, finalin yuzde60 i alinmali ve cikan sonuclar toplanmalidir.

        8. ckan sonucu (dersin not ortalamasini)   double toplam  ' a esitleyebilirsiniz.

        todo  :  Kosul kismi
 			eger ortalamasi 90(90 dahil) 'dan buyuk ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasinda ise  
 			BA, 70(70 dahil)   ile 80 arasinda ise 
 			BB, 60(60dahil) ile 70 arasinda ise 
 			CB, 50(50 dahil) ile 60 arasinda ise 
 			CC, 40(40 dahil) ile 50 arasinda ise 
 			DC, 30(30 dahil) ile 40 arasinda ise 
 			DD, 30 'dan dusuk ise FF  gelmeli.
 			
         */
    	
		Scanner scan=new Scanner(System.in);
		System.out.print("Vize s�nav sonucunuzu giriniz :");
		double vize=scan.nextDouble();
		System.out.print("Vize s�navi yuzdesini giriniz :");
		double vizeYuzdesi=scan.nextDouble();
		
		System.out.print("Final s�nav sonucunuzu giriniz :");
        double finall=scan.nextDouble();
        System.out.print("Final s�nav� y�zdesini giriniz :");
        double finallYuzdesi=scan.nextDouble();
        
        double ort=(vize*vizeYuzdesi+finall*finallYuzdesi)/100;
        System.out.println("Ortalamaniz : "+ort);
        
        if (ort>=90) {
			System.out.print("Notunuz : AA");
		} else if (ort>=80) {
			System.out.print("Notunuz : BA");
		} else if (ort>=70) {
			System.out.print("Notunuz : BB");
		} else if (ort>=60) {
			System.out.print("Notunuz : CB");
		} else if (ort>=50) {
			System.out.print("Notunuz : CC");
		} else if (ort>=40) {
			System.out.print("Notunuz : DC");
		} else if (ort>=30) {
			System.out.print("Notunuz : DD");
		} else {
			System.out.print("Notunuz : FF");
		} 
scan.close();
    }
}
