package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    //Bir top belirli bir  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {


    	  Scanner scan = new Scanner(System.in);
    	  System.out.print("Yukseklik giriniz : ");
    	  double h=scan.nextDouble();
    	  double yol=0;
    	  int sicrama=0;
    	  
    	  while (h>=1) {
		
			yol+=h;
			h*=0.75;
			yol+=h;
			sicrama++;
		}
    	  System.out.println("topun aldigi toplam yol : "+yol);
    	  System.out.println("sicrama sayisi : "+sicrama);
    	  
    	  scan.close();
    }
}
