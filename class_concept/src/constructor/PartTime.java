package constructor;

public class PartTime {
	private String name;
	private int pay;
	private int time;
	
	public PartTime(String name,int pay, int time) {
		this.name = name;
		this.pay = pay;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {;
		return pay * time;
	}
}
