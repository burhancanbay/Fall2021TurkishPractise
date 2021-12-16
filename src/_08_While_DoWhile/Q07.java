package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
		// ve x girildiğinde ise "Program bitti" yazan programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		String sifre=scan.nextLine();
		
		do {
			
			if (!sifre.equalsIgnoreCase("x")) { 
			System.out.println("Program calisiyor");
			}
			System.out.println("tekrar deneyiniz");
			sifre = scan.nextLine();
		} while (!sifre.equalsIgnoreCase("x"));
			
				System.out.println("Program bitti");	
			
				scan.close();
		
		}
			
		

	}

