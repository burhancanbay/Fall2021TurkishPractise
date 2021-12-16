package _07_ForLoop;


public class Q03 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         

         */
        String cumle=" Bugün hava oldukca güzel."; 
        int sayac=0;
    	for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)=='a') {
				sayac++;
			}
			if (cumle.charAt(i)=='c') {
				break;
			}
		}
    	System.out.println("girdiginiz cumledeki c harfine kadar olan a harfi sayisi : "+sayac);
    	
    }

}
