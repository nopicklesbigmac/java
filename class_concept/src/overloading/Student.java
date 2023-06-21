package overloading;

public class Student {
	
	private String Name; 
	private int Kor,Eng,Math,Total;
	private double Avr;
	
	public Student(String name, int eng, int kor,int math) {
		this.Eng = eng;
		this.Kor = kor;
		this.Math = math;
		this.Name = name;
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
