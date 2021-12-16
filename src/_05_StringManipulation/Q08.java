package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
    	Scanner scan=new Scanner(System.in);
    	System.out.print("lutfen bir kelime giriniz : ");
    	String word=scan.nextLine();
    	
    	if (word.length()>=3) {
			System.out.println(word.substring(word.length()-2)+word.substring(word.length()-2)+word.substring(word.length()-2));
		} else {
             System.out.println(word);
		}
    	
    	scan.close();
    }
}
