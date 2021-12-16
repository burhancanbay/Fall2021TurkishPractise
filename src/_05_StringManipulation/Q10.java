package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen adinizi giriniz : ");
    	String name=scan.nextLine();
    	System.out.print("Lutfen soyadinizi giriniz : ");
    	String surname=scan.nextLine();
    	System.out.print("Lutfen 16 haneli kart numaranizi giriniz : ");
    	String kart=scan.nextLine();
    	
    	if (kart.length()<16) {
			System.out.println("Geçersiz kredi kartı numarası");
		}
    	else {
    		System.out.print("Adi : "+name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*"));
        	System.out.print(" "+"Soyadi : "+surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*"));
        	System.out.println(" "+"Kart No : "+kart.substring(0,12).replaceAll("\\d","*")+kart.substring(12));
        	}
    	scan.close();
		}

    }

