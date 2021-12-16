package _14_Encapsulation;

public class ArabaMain {

	public static void main(String[] args) {
		
		Araba honda=new Araba(); // parametresiz constructor'da obje creat edildi.
		honda.setMotor(1300);
		honda.setModel("civic");
		honda.setYil(20212);
		honda.getModel();
		System.out.println(honda.getYil());
		
		Araba volvo=new Araba("xc90","beyaz",20,2020);
		Araba ww=new Araba("Passat","kirmizi",1600,-2021);
		
		System.out.println("Sectiginiz volvo'nun ozellikleri"+volvo.getYil()+volvo.getRenk()+volvo.getMotor());
		System.out.println("Sectiginiz ww'nun ozellikleri"+ww.getYil()+ww.getRenk()+ww.getMotor());

	}

}
