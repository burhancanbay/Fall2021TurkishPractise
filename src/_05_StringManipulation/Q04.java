package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin


    	Scanner scan=new Scanner(System.in);
    	System.out.print("lutfen 4 harfli bir kelime giriniz : ");
    	String word=scan.nextLine();
    	
    	System.out.println(word.substring(3,4)+word.substring(2,3)+word.substring(1,2)+word.substring(0,1));
    	
    	
    	scan.close();
       
    }
}
