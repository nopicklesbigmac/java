package inheritance3;

public class PartTime extends Employee{
	private int pay;
	private int time;
	
	public PartTime(String name,int pay, int time) {
		super(name);
		this.pay = pay;
		this.time = time;
	}

	public int getSalary() {;
		return pay * time;
	}
}
