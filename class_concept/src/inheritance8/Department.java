package inheritance8;

import java.util.ArrayList;

public class Department {
	private ArrayList<Employee>emp;
	
	public Department() {
		emp = new ArrayList<Employee>();
	}
	
	public void setEmp(Employee e) {
		emp.add(e);
	}
	public void info() {
		for (Employee e : emp) {
			System.out.print("이름 :"+ e.getName());
			System.out.println(",\t 급여 :"+ e.getSalary());
			
		}
	}
	
}
