package _01_variables;

public class Q02 {
	
	public static void main(String[] args) {
		
	
	// verilen 12345 say�s�n�n rakamlar�n� yukar�dan a�a��ya do�ru yazd�r�n�z
    // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//		            5

    int sayi=12345;
    int birler= sayi%10; //birler basamagi sayinin 10 a bolumunden kalan�d�r.-->5
    int onlar=(sayi/10)%10;
    int yuzler=(sayi/100)%10;
    int binler=(sayi/1000)%10;
    int onBinler=(sayi/10000);

		/*
	    System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		 */

    // consolda alt satira yazd�rmak i�in "\n"  komutu kullan�l�r.

		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}