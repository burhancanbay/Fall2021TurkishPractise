package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	Scanner scan=new Scanner(System.in);
    	System.out.print("bir metin giriniz : ");
    	String metin=scan.nextLine();
    	
    	StringBuilder sb=new StringBuilder(metin);
    	String tersMetin=sb.reverse().toString();
    	
    	if (tersMetin.equalsIgnoreCase(metin)) {
			System.out.println("girilen metin palindromedur");
		} else {
			System.out.println("girilen metin palindrome degildir");
		}
    	
    }

}
