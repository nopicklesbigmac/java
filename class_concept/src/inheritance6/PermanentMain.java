package inheritance6;
import java.util.ArrayList;
import java.util.Scanner;

import inheritance5.Child1;
public class PermanentMain {
	public static void main(String[] args) {

	ArrayList<Employee> emp = new ArrayList<>();
	
	emp.add(new Permanent("김변수", 200000));
	emp.add(new Permanent("이상수", 300000));
	emp.add(new Permanent("박참조", 400000));
	emp.add(new PartTime("김변수", 160, 5000));
	emp.add(new PartTime("이상수",  160, 6000));
	emp.add(new PartTime("박참조",  160, 7000));
	
	for (Employee e : emp) {
		System.out.print("이름 :"+ e.getName());
		System.out.println(",\t 급여 :"+ e.getSalary());
		
	}
	
	}
}
	
	