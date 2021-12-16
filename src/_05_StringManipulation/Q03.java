package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz, 3 kelimeden olusan ismi
        // orn. Ahmet Emin Yilmaz -> A.E.Y.  formatiyla yazdiriniz.
    	

    	Scanner scan=new Scanner(System.in);
    	System.out.print("lutfen 3 kelimeli bir isim giriniz : ");
    	String name=scan.nextLine();
    	
    	char ilkHarf=name.toUpperCase().charAt(0);
    	char ikinciHarf=name.toUpperCase().charAt(name.indexOf(" ")+1);
    	char ucuncuHarf=name.toUpperCase().charAt(name.lastIndexOf(" ")+1); 
    	
    	System.out.println("Isminizin Kisaltilmis Hali : "+ilkHarf+"."+ikinciHarf+"."+ucuncuHarf+".");
	
    	scan.close();

    }       
}
