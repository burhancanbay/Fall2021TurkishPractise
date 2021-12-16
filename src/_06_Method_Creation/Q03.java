package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        
    	 Scanner scan=new Scanner(System.in);
         System.out.print("Cevrilecek birimi giriniz : ");
         String birim=scan.next();
         
         System.out.print("Cevrilecek birimin degerini giriniz : ");
         Double miktar=scan.nextDouble();
         
         cevirCan(birim,miktar);
         
         scan.close();
         
    }

	private static void cevirCan(String birim, Double miktar) {
		
		switch (birim) {
		case "saat":
			System.out.println("Girilen saatin saniye karsiligi : "+miktar*60*60+"saniye");
			break;
        case "mil":
        	System.out.println("Girilen milin km karsiligi : "+miktar*1.6+"km");
			break;
        case "kg":
        	System.out.println("Girilen kg'in gram karsiligi : "+miktar*1000);
	break;
         default:
        	 System.out.println("Lutfen birim olarak saat,mil ve kg'dan birini giriniz"+"gram");
			break;
		}
		
	}

	
		
	}


