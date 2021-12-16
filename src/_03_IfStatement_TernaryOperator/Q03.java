package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen boyunuzu cm olarak giriniz : ");
		double boy=scan.nextDouble();
		System.out.print("Lutfen kilonuzu kg olarak giriniz : ");
		double agirlik=scan.nextDouble();
		
		boy/=100;
		double bmi=agirlik/boy/boy;
		
		if (bmi<=20) {
			System.out.println("oldukca zayifsiniz");
		} else if (bmi<=25) {
			System.out.println("Normal sinirlardasiniz");
		} else if (bmi<=30) {
			System.out.println("Sisman kategorisindesiniz");
		} else if (bmi>30){
			System.out.println("Obez grubundasiniz");
		}
	

	scan.close();
		

    }

}
