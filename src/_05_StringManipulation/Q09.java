package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				kullanicidan alinan cift uzunlukta bir string'in ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
    	Scanner scan=new Scanner(System.in);
    	System.out.print("bir string giriniz : ");
    	String str=scan.nextLine();
    	
    	if (str.length()%2==0) {
			System.out.println("Girilen stringin ilk yarisi : "+str.substring(0,str.length()/2));
		} else {
System.out.println("Girilen string uzunlugu tek sayidir duzeltiniz");
		}
    	
    	scan.close();
       
    }
}
