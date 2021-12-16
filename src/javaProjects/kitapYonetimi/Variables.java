package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Variables {

	static Scanner scan = new Scanner(System.in);
	static int bookNumber =1000;
	static List<Kitapci> bookList = new ArrayList<>();
	public static boolean mainMenu =true;
	
	public static final String MAIN_MENU_TEXT=
			"\n	========= KİTAP PROGRAMI =============\n"
			+ "\nLutfen Yapacaginiz Islemin Numarasini Giriniz: "
			+ "\n1. Kitap Ekle"
			+ "\n2. Numara Ile Kitap Sil"
			+ "\n3. Tum Kitaplari Listele"
			+ "\n4. Bitir";
		
}