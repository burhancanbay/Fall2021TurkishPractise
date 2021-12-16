package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        // ad ayri soyad ayri sekilde ekrana yazdiriniz.


    	Scanner scan=new Scanner(System.in);
    	System.out.print("lutfen adinizi ve soyadinizi birer kelime olarak giriniz : ");
    	String name=scan.nextLine();
    	
    	String name1=name.substring(0,name.indexOf(" "));
    	String name2=name.substring(name.indexOf(" ")+1);
    	
    	
    	System.out.println("Adiniz : "+name1+" "+"Soyadiniz : "+name2);
    	
    	scan.close();
    }
}
