package _10_List;


import java.util.ArrayList;


public class QAsalSayi {

    /*
    100 den kucuk asal sayilari yazdiran bir program yaziniz
     */
    public static void main(String[] args) {

    	ArrayList<Integer>list=new ArrayList<>();
    	
    	for (int i = 2; i < 100; i++) {
			int sayac=0;
    		for (int j = 1; j <= i; j++) {
				if (i%j==0) {
					sayac++;
				}
				
				}
    		if (sayac==2) {
				list.add(i);
			}
		}
    	System.out.println(list);
    }
}
