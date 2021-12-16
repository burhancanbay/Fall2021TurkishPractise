package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[8];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+".elemani giriniz : ");
			arr[i]=scan.nextInt();
			
			}
		System.out.println(Arrays.toString(arr));
		System.out.print("3'e bolunebilen elemanlar : ");
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				sayac++;
				System.out.print(arr[i]+" ");
			}
		}
System.out.println();
System.out.println("3'e bolunebilen eleman sayisi : "+sayac);

scan.close();
	}

}
