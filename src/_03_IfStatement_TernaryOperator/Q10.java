package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
          Problem tanimi : 
        Kulanicidan aracinin hizini aliniz
        Trafik cezasinin degerini hesaplayin.
            45 hiz siniridir.
            Eger hiziniz 55-74 arasinda ise:
            Ceza 100 $'dir.

            Eger hiziniz 75 - 84 arasinda ise:
            Ceza 150 $'dir.

            Eger hiziniz 85 -94 arasinda ise:
            Ceza 320 $'dir.

            Eger hiziniz 94'den daha fazla ise:
            Ceza 500 $'dir.

            ve ayrica,
            Eger surucunun ehliyeti yoksa cezaya 200 $ eklenir.

           orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

           orn;

            currentSpeed(Hiziniz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = true;

            sonuc 320 olmalidir.

            currentSpeed(Hiziniz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = false;

            sonuc 300 olmalidir.
     */

		Scanner input=new Scanner(System.in);
		System.out.print("Lutfen hizinizi giriniz : ");
        double hiz=input.nextDouble();
        System.out.println("Lutfen ehliyetiniz varsa 'E' yoksa 'H' ye basiniz");
        char ehliyet=input.next().toUpperCase().charAt(0);
        
        System.out.println(hiz>94 ? (ehliyet=='E' ? "Cezaniz:500$" : ehliyet=='H' ? "Cezaniz:500+200=700$" : "Lutfen 'E' veya 'H' den birine basiniz") :
        hiz>85 ? (ehliyet=='E' ? "Cezaniz:320$" : ehliyet=='H' ? "Cezaniz:320+200=520$" : "Lutfen 'E' veya 'H' den birine basiniz") : 
        hiz>75 ? (ehliyet=='E' ? "Cezaniz:150$" : ehliyet=='H' ? "Cezaniz:150+200=350$" : "Lutfen 'E' veya 'H' den birine basiniz") :	
        hiz>55 ? (ehliyet=='E' ? "Cezaniz:100$" : ehliyet=='H' ? "Cezaniz:100+200=300$" : "Lutfen 'E' veya 'H' den birine basiniz") :	
        "Hiz siniriniz 45'dir");
        
        input.close();
    }        	
}
