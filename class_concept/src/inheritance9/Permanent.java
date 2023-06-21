package inheritance9;

public class Permanent extends Employee{
	private int salary;

	public Permanent(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public int getSalary() {
		return salary;
	}
}
