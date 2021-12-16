package _02_Scanner;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
    	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
    	 */

        Scanner scan = new Scanner(System.in);

        String name, surname;


        int age, kilo;
        double boy;

        System.out.print("Ad�n�z� girin: ");
        name = scan.nextLine();

        System.out.print("Soyad�n�z� girin: ");
        surname = scan.nextLine();

        System.out.print("Ya��n�z� girin: ");
        age = scan.nextInt();

        System.out.print("Boyunuzu girin: ");
        boy = scan.nextDouble();


        System.out.print("Kilonuzu giriniz: ");
        kilo = scan.nextInt();

        System.out.println("Benim ad�m : " + name  +"\n"+ "Soyad�m : " +surname +"\n"+ "Ya��m : " + age +
                "\n"+"boyum : " + boy +"\n"+"kilom : " + kilo );
        scan.close();

	}

}
