package _10_List;

public class Q07 {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

		int arr[]={ 1, 5, 3, 4, 4, 3, 2, 1 };
		boolean simetrik=false;
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i]==arr[arr.length-1-i]) {
				simetrik=true;
			} else {
				simetrik=false;
				break;
			}
			
		}
		
	if (simetrik==true) {
		System.out.println("verilen array simetriktir");
	} else {
		System.out.println("verilen array simetrik degildir");
	}
	
	}

}
