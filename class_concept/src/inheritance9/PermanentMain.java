package inheritance9;
import java.util.ArrayList;
import java.util.Scanner;

import inheritance5.Child1;
public class PermanentMain {
	public static void main(String[] args) {

	Department dept = new Department();
	
	Employee e1 = new Permanent("김변수", 200000);
	Employee e2 = new Permanent("이상수", 300000);
	Employee e3 = new Permanent("박참조", 400000);
	Employee e4 = new PartTime("김변수", 160, 5000);
	Employee e5 = new PartTime("이상수",  160, 6000);
	Employee e6 = new PartTime("박참조",  160, 7000);
	
	dept.setEmp(e1);
	dept.setEmp(e2);
	dept.setEmp(e3);
	dept.setEmp(e4);
	dept.setEmp(e5);
	dept.setEmp(e6);
	dept.info();
	
	}
}
	
	