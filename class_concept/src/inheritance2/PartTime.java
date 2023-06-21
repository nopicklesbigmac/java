package inheritance2;

public class PartTime extends Employee{
	private int pay;
	private int time;
	
	public PartTime(String name,int pay, int time) {
		setName(name);
		this.pay = pay;
		this.time = time;
	}

	public int getSalary() {;
		return pay * time;
	}
}
