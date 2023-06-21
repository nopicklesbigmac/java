package method;

public class Student {
	
	private String Name; 
	private int Kor,Eng,Math,Total;
	private double Avr;
	
	public void setEng(int Eng) {
		this.Eng = Eng;
	}
	public void setKor(int Kor) {
		this.Kor = Kor;
	}
	public void setMath(int Math) {
		this.Math = Math;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public int getEng() {
		return Eng;
	}
	public int getKor() {
		return Kor;
	}
	public int getMath() {
		return Math;
	}
	public int getTotal() {
		this.Total =  Kor + Eng + Math;
		return Total;
	}
	public double getAvr() {
		this.Avr = Total / 3.0;
		return Avr;
	}
	
	
}
