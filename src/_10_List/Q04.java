package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

    	List<Integer>listNotlar=new ArrayList<>();
    	Scanner scan=new Scanner(System.in);
    	String devam;
    	int toplam=0;
    	double ort=0;
    	int ortGecenSayisi=0;
    	do {
    		System.out.print("Not giriniz : ");
    		int ogrNot=scan.nextInt();
    		listNotlar.add(ogrNot);
    		System.out.println("devam : E/H");
    		devam=scan.next();
    		
    	} while (devam.equalsIgnoreCase("E"));
    	for (int i = 0; i < listNotlar.size(); i++) {
			toplam+=listNotlar.get(i);
		}
    	ort=toplam/listNotlar.size();
    	for (int i = 0; i < listNotlar.size(); i++) {
			if (listNotlar.get(i)>ort) {
				ortGecenSayisi++;
			}
		}
    	System.out.println("Girilen notlarin ortalamasi : "+ort);
    	System.out.println("Ortalamayi gecen ogrenci sayisi : "+ortGecenSayisi);
    	
    	scan.close();
    }
}
