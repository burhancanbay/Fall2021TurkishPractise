package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanicidan aldiginiz koordinat noktasinin hangi bolgede oldugunu yazdiran bir kod yaziniz.

    	Scanner input = new Scanner (System.in);
		System.out.println("Lutfen noktanin koordinatlarini giriniz");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		System.out.println((x>=0 && y>=0) ? ("Girdiginiz nokta 1.bolgede") : ((x<0 && y>=0) ? "Girdiginiz nokta 2.bolgede"
				: ((x<0 && y<0) ? "Girdiginiz nokta 3.bolgede" : "Girdiginiz nokta 4.bolgede")));
    
		input.close();
    }
    }
