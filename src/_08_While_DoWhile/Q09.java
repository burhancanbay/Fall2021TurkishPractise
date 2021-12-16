package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunu kontrol eden bir kod yazınız.

    	  Scanner scan = new Scanner(System.in);
	        System.out.print("pin kodunu giriniz  : ");
	        int userPin = scan.nextInt();
	        
	        int systemPin=1453;
	        
	        while (userPin!=systemPin) {
				System.out.println("tekrar deneyiniz");
				userPin = scan.nextInt();
			}
	        System.out.println("sisteme  giris yapiliyor");
	        
	        scan.close();
    }
}

