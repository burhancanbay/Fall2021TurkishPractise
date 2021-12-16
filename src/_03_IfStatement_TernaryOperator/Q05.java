package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner input = new Scanner (System.in);
		System.out.println("Lutfen Yasinizi ve Kilonuzu Giriniz");
		int yas=input.nextInt();
		double kilo=input.nextDouble();
		
		System.out.println((yas<18) ? ("Kan bagisi yapamazsiniz") : (kilo<50 ? "Kan bagisi yapamazsiniz" : "Kan bagisi yapabilirsiniz"));

		input.close();
	}

}
