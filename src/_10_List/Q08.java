package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
        /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

    	ArrayList<String>list1=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("Ilk hali : "+list1);
    	String eleman3=list1.get(2);
    	String eleman8=list1.get(7);
    	
    	list1.set(2, eleman8);
    	list1.set(7, eleman3);
    	
    	System.out.println("3. ve 8. elemanlarin yer degistirmis hali : "+list1);


    }

}
