package javaProjects.kitapYonetimi;

import static javaProjects.kitapYonetimi.Variables.*;

public class AddBooks {


static void addBook() {
	
	Kitapci book1=new Kitapci();
	System.out.print("Kitap adini giriniz : ");
	scan.nextLine();
	book1.setBookName(scan.nextLine());
	
	System.out.print("Yazar adini giriniz : ");
	book1.setWriterName(scan.nextLine());
	
	System.out.print("Yayinyilini giriniz : ");
	book1.setPublishYear(scan.nextLine());
	
	System.out.print("Fiyat giriniz : ");
	book1.setPrice(scan.nextDouble());
	
	book1.setBookNumber(bookNumber);
	bookList.add(book1);
	System.out.println("Girdiginiz kayit "+bookNumber+" kitap numarasi ile stoga eklendi");
	bookNumber++;
}
	
}
