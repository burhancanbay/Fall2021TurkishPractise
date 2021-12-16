package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Urun adedini ve liste fiyatini giriniz");
		int adet=input.nextInt();
		double fiyat=input.nextDouble();
		System.out.println("Musteri kartiniz varsa 'E' ye yoksa 'H' ye basiniz");
		char kart=input.next().toUpperCase().charAt(0);
		double tutar=adet*fiyat;
				
		System.out.println(kart=='E' ? (adet>10 ? tutar*0.8 : tutar*0.85) : 
			(kart=='H'? adet>10 ?tutar*0.85 : tutar*0.9 : "Lutfen 'E veya 'H'den birini giriniz"));
		
		input.close();
	}

}
