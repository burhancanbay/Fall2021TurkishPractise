package javaProjects.okulYonetimi;

public class Ogretmen extends Kisi{
	
	String sicilNo;
	String bolum;
	public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {
		super(adSoyad, kimlikNo, yas);
		this.sicilNo = sicilNo;
		this.bolum = bolum;
	}
	public String getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	@Override
	public String toString() {
		return "Ogretmen [sicilNo=" + sicilNo + ", bolum=" + bolum + ", adSoyad=" + adSoyad + ", kimlikNo=" + kimlikNo
				+ ", yas=" + yas + "]";
	}

	
	

}
