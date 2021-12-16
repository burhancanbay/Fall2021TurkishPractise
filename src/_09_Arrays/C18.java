package _09_Arrays;

public class C18 {

	public static void main(String[] args) {
		
		// kullanıcıdan alınan bir String'deki herbir karakterin adedini bir array
		// içinde yazdıran bir java programı yazın.
		// String "Javacilar cook afilli" ise cevap şöyle olmalıdır:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
		
		String str="Javacilar cook afilli";
		char [] ch=new char[str.length()];
		

		int sayac=0;
	
		for (int i = 0; i < ch.length; i++) {
			ch[i]=str.charAt(i);
			for (int j = 0; j <=i; j++) {
				if (ch[i]==ch[j]) {
					sayac++;
				}
			}
		
				
			
			
			
		
		System.out.println(sayac);
	}

}
}
