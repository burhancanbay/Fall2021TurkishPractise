package javaProjects.kitapYonetimi;

import static javaProjects.kitapYonetimi.Variables.*;



public class ToList {

	static void toList() {

		if (bookList.size() == 0) {
			System.out.println("Stokta kitap bulunmamaktadir");
		} else {
			
			System.out.println(bookList);
		}
	}
}
