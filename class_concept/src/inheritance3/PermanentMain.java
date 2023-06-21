package inheritance3;

import java.util.ArrayList;
import java.util.Scanner;

public class PermanentMain {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Permanent> per = new ArrayList<>();

	per.add(new Permanent("김변수", 200000));
	per.add(new Permanent("이상수", 300000));
	per.add(new Permanent("박참조", 400000));
	for (Permanent permanent : per) {
		System.out.print("이름 :"+ permanent.getName());
		System.out.println(",\t 급여 :"+ permanent.getSalary());
		
	}System.out.println();
	ArrayList<PartTime> pt = new ArrayList<>();
	pt.add(new PartTime("김변수", 160, 5000));
	pt.add(new PartTime("이상수",  160, 6000));
	pt.add(new PartTime("박참조",  160, 7000));
	for (PartTime parttime : pt) {
		System.out.print("이름 :"+ parttime.getName());
		System.out.println(",\t 급여 :"+ parttime.getSalary());
		
	}
}
}