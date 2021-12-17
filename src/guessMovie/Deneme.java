package guessMovie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
		/*
		 * 1. Bir tane film isim listesi olusturun
		 * 2. Kullanicadan liste uzunlugunda bir sayi isteyip, o siradaki filmi cagirin..
		 * 3. filmin ismindeki harfleri "-" olacak sekilde ceviririp kullaniciya gösterin.
		 * 4. Kullanicidan bir harf tahmin etmesini isteyin
		 * 5. Bu harfin isimde olup olmadigini kontrol edin.
		 * 6. Girilen harf dogruysa ismin tamaminda bu harfi gösterin.
		 * 7. Toplam kac yanlis harf tahmin edildigini gösterin ve sinir asildiysa kaybettin yazdirin.
		 * 8. Eger hepsi dogru tahmin edildiyse kazandin yazdirin.
		 */
		
		List<String>filmListesi=new ArrayList<>();
		filmListesi.add("esaretin bedeli");
		filmListesi.add("vizontele");
		filmListesi.add("sabanoglu saban");
		filmListesi.add("mandira filozofu");
		filmListesi.add("beyaz melek");
		filmListesi.add("babam ve oglum");
		filmListesi.add("matrix");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("1'den "+filmListesi.size()+"'a kadar bir sayi giriniz : ");
		int filmSirasi=scan.nextInt();
		String filmAdi=filmListesi.get(filmSirasi-1);
		String gizliAdi=filmAdi.replaceAll("\\S","-");
		System.out.println("Film Listesinin "+filmSirasi+"'ncu sirasindaki film : "+gizliAdi);
		
		int sayac=0;
		while (!filmAdi.equalsIgnoreCase(gizliAdi)) {
			
	    System.out.print("Lutfen bir harf tahmin ediniz : ");
		char harf=scan.next().charAt(0);
		String hrf=Character.toString(harf);
				
		if (!filmAdi.contains(hrf)) {
			sayac++;
		}
		if (sayac==3) {
			System.out.println(sayac+" defa hatali girdiniz...\nMaalesef Kaybettiniz...");
			break;
		}
		System.out.println(sayac+ " defa hatali girdiniz...Kalan hakkiniz : "+(3-sayac));
		
		List<Integer>index=new ArrayList<>();
		for (int i = 0; i < filmAdi.length(); i++) {
			if (filmAdi.charAt(i)==harf) {
				index.add(i);
				}
		}
		for (int j = 0; j < index.size(); j++) {
			gizliAdi=gizliAdi.substring(0,index.get(j))+filmAdi.substring(index.get(j),index.get(j)+1)+gizliAdi.substring(index.get(j)+1);
		}
		System.out.println(gizliAdi);
		if (gizliAdi.equalsIgnoreCase(filmAdi)) {
			System.out.println("Tebrikler...Kazandiniz...");
		}
		}
	
	}

}
