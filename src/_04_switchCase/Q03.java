package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasina gore , ayin kac gun olduğunu sayi ile yazdiriniz

       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen gun sayisini ogrenmek istediginiz ay numarasini giriniz");
       int ay=scan.nextInt();
       
       switch (ay) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("girdiginiz ay 31 gun");
		
		break;
	case 4:
	case 6:
	case 9:
	case 11:
	
		System.out.println("girdiginiz ay 30 gun");
		break;
	case 2:
		System.out.println("yili giriniz : ");
		int yil=scan.nextInt();
		if (yil%4==0) {
			System.out.println("girdiginiz ay 29 gun");
		} else {
			System.out.println("girdiginiz ay 28 gun");
		}
		break;
	default:
		System.out.println("Lutfen 1 ve 12 arasinda bir rakam giriniz");
		break;
	}
       scan.close();
    }
}

