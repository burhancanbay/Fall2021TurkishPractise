package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        
    	Scanner input=new Scanner(System.in);
		System.out.print("Lutfen 3 tane sayi giriniz : ");
		int sayi1=input.nextInt();
		int sayi2=input.nextInt();
		int sayi3=input.nextInt();
		
		if (sayi1>sayi2) {
			if (sayi1>sayi3) {
				if (sayi2>sayi3) {
					System.out.println("en buyuk sayi : "+sayi1+" en kucuk sayi : "+sayi3);
				} else {
					System.out.println("en buyuk sayi : "+sayi1+" en kucuk sayi : "+sayi2);
				}
			} else if (sayi1>sayi2) {
				System.out.println("en buyuk sayi : "+sayi3+" en kucuk sayi : "+sayi2);
			     } else {
			    	 System.out.println("en buyuk sayi : "+sayi3+" en kucuk sayi : "+sayi1);
			        }
		} else if (sayi3>sayi2) {
			System.out.println("en buyuk sayi : "+sayi3+" en kucuk sayi : "+sayi1);
		    } else if (sayi3>sayi1) {
		    	System.out.println("en buyuk sayi : "+sayi2+" en kucuk sayi : "+sayi1);
			    } else {
				System.out.println("en buyuk sayi : "+sayi2+" en kucuk sayi : "+sayi3);
			
		    	
		

		}
		input.close();
    }
}

