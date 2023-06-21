package constructor;

import java.util.Scanner;

public class PermanentMain {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("이름 :");
	String name = sc.next();
	System.out.print("급여 :");
	int salary = sc.nextInt();
	Permanent p = new Permanent(name,salary);
	
	System.out.print("이름 :");
	name = sc.next();
	System.out.print("급여 :");
	salary = sc.nextInt();
	Permanent p2 = new Permanent(name,salary);

	System.out.print("이름 :");
	name = sc.next();
	System.out.print("급여 :");
	salary = sc.nextInt();
	Permanent p3 = new Permanent(name,salary);
	
	System.out.print("이름 :"+ p.getName());
	System.out.println(",\t 급여 :"+ p.getSalary());
	System.out.print("이름 :"+ p2.getName());
	System.out.println(",\t 급여 :"+ p2.getSalary());
	System.out.print("이름 :"+ p3.getName());
	System.out.println(",\t 급여 :"+ p3.getSalary());
	
	
	System.out.print("이름 :");
	name = sc.next();
	System.out.print("시급 :");
	int pay = sc.nextInt();
	System.out.print("시간 :");
	int time = sc.nextInt();
	PartTime pt = new PartTime(name,pay,time);
	System.out.print("이름 :"+ pt.getName());
	System.out.println(",\t 급여 :"+ pt.getSalary());
		
	
	
	
	
	
	
}
}