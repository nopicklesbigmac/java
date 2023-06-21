package inheritance3;

public class Permanent extends Employee{
	private int salary;

	public Permanent(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
}
