package inheritance8;

public class Employee {
	private String name;
	public Employee(String name) {
		this.name = name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return 0;
	}
}
