package inheritance2;

public class Permanent extends Employee{
	private int salary;

	public Permanent(String name, int salary) {
		setName(name);
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
}
