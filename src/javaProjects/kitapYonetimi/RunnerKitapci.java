package javaProjects.kitapYonetimi;

import static javaProjects.kitapYonetimi.Variables.*;

public class RunnerKitapci {

	public static void main(String[] args) {

		while (mainMenu) {

			System.out.println(MAIN_MENU_TEXT);

			String choice = scan.next();

			switch (choice) {
			case "1":
				AddBooks.addBook();
				break;
			case "2":
			   RemoveBooks.removeBook();
				break;
			case "3":
				ToList.toList();
				break;
			case "4":
				mainMenu=false;
				System.out.println("Hosca kalin,tekrar gorusmek dilegiyle...");
				break;
			default:
				System.out.println("Hatali Giris Yaptiniz. Lutfen Tekrar Deneyiniz.");
				break;
			}
		}

	}
}
