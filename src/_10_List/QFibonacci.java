package _10_List;



import java.util.ArrayList;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen bir sayi giriniz : ");
    	int sayi=scan.nextInt();
    	
    	ArrayList<Integer>list=new ArrayList<>();
    
    	list.add(1);
    	list.add(1);
    	
    	for (int i = 2; list.get(i-2)+list.get(i-1)< sayi; i++) {
			list.add(list.get(i-2)+list.get(i-1));
		}
    	System.out.println(list);
    	scan.close();

    }
}
