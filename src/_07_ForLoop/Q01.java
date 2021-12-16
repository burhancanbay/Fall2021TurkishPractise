package _07_ForLoop;

public class Q01 {
    /*

       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DE�?İLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */
    public static void main(String[] args) {
    	int toplam=0;
    	for (int i = 100;i >= 0; i--) {
    		if (i%13==0) {
    			System.out.print(i+" ");	
    			toplam+=i;
			}
    		
		}
    	System.out.println("");
    	System.out.println(toplam);
    }
}
