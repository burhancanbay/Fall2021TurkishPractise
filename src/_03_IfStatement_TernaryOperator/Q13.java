package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanimi
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        (Yardim: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        baglantisindan yararlanabilirsiniz)

        ornek Ekran ciktisi
        birinci kenari giriniz: 2
        ikinci kenari giriniz 15
        ucuncu kenari giriniz: 7
        Bu bir dik ucgen degildir.

        Bu bir dik ucgendir
     */

    	Scanner input=new Scanner(System.in);
		System.out.print("Lutfen ucgenin kenar uzunluklarini giriniz : ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        
        System.out.println(a*a+b*b==c*c ? "Dik ucgen" : "Dik ucgen degil");

        input.close();
    }
}
