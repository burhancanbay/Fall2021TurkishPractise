package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    	    Scanner scan = new Scanner(System.in);
	      
    	    int enBuyuk=0;
	        int tekrar=0;
	        
    	    while (tekrar<5) {
    	    	 System.out.print("sayi giriniz : ");
    		        int sayi=scan.nextInt();
    		       if (sayi>enBuyuk) {
					enBuyuk=sayi;
				     }
    		       tekrar++;
    	   }
    	    System.out.println("en buyuk sayi : "+enBuyuk);
    	    
    	    scan.close();
}
}

