package _07_ForLoop;


public class C11 {

	public static void main(String[] args) {
		// 1000 den kucuk mukemmel sayilari bulunuz

		int bolenTop;

		for (int sayi = 1; sayi < 10000; sayi++) {
			bolenTop=0;
			for (int bolen = 1; bolen < sayi; bolen++) {
				if (sayi % bolen == 0) {
					bolenTop += bolen;
				}

			}
			if (sayi == bolenTop) {
				System.out.println(sayi);

			}
			
		}
		
	}

}
