package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		Scanner scan=new Scanner(System.in);
		  System.out.print("bir sayi giriniz : ");
		  int sayi=scan.nextInt();
		  int kupTop=0;
		  int rakam=0;
		  int sayi1=sayi;
		  do {
			rakam=sayi1%10;
			kupTop+=rakam*rakam*rakam;
			sayi1/=10;
		} while (sayi1>0);

		  if (kupTop==sayi) {
			System.out.println("Girdiginiz sayi Armstrong bir sayidir");
		} else {
			System.out.println("Girdiginiz sayi Armstrong bir sayi degildir");
		}
			 
		 scan.close();
		 
		}
	}


