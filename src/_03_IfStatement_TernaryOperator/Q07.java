package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner input = new Scanner (System.in);
		System.out.print("Lutfen bir harf giriniz : ");
		char harf=input.next().charAt(0);
		
		System.out.println(harf>='a' && harf<='z' ? "Kucuk Harf" : (harf>='A' && harf<='Z' ? "Buyuk Harf" : "Hatali Giris Yaptiniz" ));
		
		
		input.close();
		

	}

}
