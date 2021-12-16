package _09_Arrays;



public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage (dizi elemanlarinin ortalama
		 * degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java
		 * programi yazin) input[]= {1,2,3,4,5,6,7} Output : 4
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int toplam = 0;
		double ort=0;
		/*
		for (int i : arr) {
			toplam+=i;
		}
		ort=toplam/arr.length;
		System.out.println(ort);
		*/
		for (int i = 0; i < arr.length; i++) {
			toplam += arr[i];
		}
		ort = toplam / arr.length;
		System.out.println("Verilen array'in ortalamasi : "+ort);
		/*
		for (int i : arr) {
			if (i>ort) {
				System.out.println(i);
			}
		}
		*/
		System.out.print("Ortalamadan buyuk olan elemanlar : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ort) {
				System.out.print(arr[i]+",");
			}
		}
		
	}

}
