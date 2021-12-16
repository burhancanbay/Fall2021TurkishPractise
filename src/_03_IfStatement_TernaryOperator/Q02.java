package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk, herhangi iki kenar farki diger kenardan buyuk olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	Scanner scan=new Scanner(System.in);
	System.out.println("3 tane pozitif tamsayi giriniz");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	
    if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
		if (a==b && b==c) {
			System.out.println("eskenar ucgen");
		} else {
            System.out.println("ucgen ama eskenar degil");
		}
	} else {
        System.out.println("ucgen degil");
	}
	
scan.close();
				

	}

}
