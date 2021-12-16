package javaProjects.kitapYonetimi;

import static javaProjects.kitapYonetimi.Variables.*;

import java.util.InputMismatchException;

public class RemoveBooks {
	
	static int i=0;
	static boolean available=false;
	
	// InputMismatchException
	static void removeBook() {
		if (bookList.size()==0) {
			System.out.println("Stokta kitap bulunmamaktadir");
		} else {
			try {
				System.out.println("Silinecek kitap numarasini giriniz");
				int number=scan.nextInt();
				
					for (int i = 0; i < bookList.size(); i++) {
					if (bookList.get(i).getBookNumber()==number) {
						available=true;
						break;
					}
				}
				if (available) {
					bookList.remove(i);
					System.out.println(number+" numarali kitap silindi");
				} else {
			System.out.println("Stokta "+number+" numarali bir kitap bulunamadi");
				}
					
			} catch (InputMismatchException e) {
				System.out.println("Lutfen sayisal deger giriniz");
			}
	
}
}
}