package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		Scanner input=new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		double sayi=input.nextDouble();
		
		System.out.println(sayi>=0 ? sayi : -sayi);
		
		input.close();
		
		
		
		
	}

}
