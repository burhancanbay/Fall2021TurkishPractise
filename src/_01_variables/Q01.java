package _01_variables;

public class Q01 {

	
	/*
		  \n (or \r): starts from a new line : metni bir alt sat�rdan itibaren yazd�r�r.
		          \t:  horizontal tab : metni yatayda 1 tab miktar� kayd�r�r.
		          \\: prints a back slash :\ (ters slash) yazd�r�r
		          \': prints single quote :' tek t�rnak yazd�r�r.
		          \": prints double quote :"" �ift t�rnak yazd�r�r.
		 */


		public static void main(String[] args) {
			//  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazd�r�n�z

			System.out.println("   \"Hello \" , \"World \\ / \"    ");
			// Soru-2 : Pazartesi kelimesini her harfini ayr� bir satira gelecek sekilde yazd�r�n�z.

			System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
			//Soru-3 : "Java" ile hayat cok 'afilli'   yazd�r�n�z
			System.out.println("\"Java\" ile hayat cok \'afilli\'");

			//Soru-4 : "Basari" gayrete
			// 'asiktir'  yazd�r�n�z sonraki "TechProEd ile java cok kolay ..." ifadesi  3 sat�r sonra ve sat�r bas�ndan 1 tab ilerideyaz�ls�n.

			System.out.println(" \"Basari\" gayrete \n \'asiktir\' \n\n\n \t\"TechProEd ile java cok kolay ...\"");


	}

}
