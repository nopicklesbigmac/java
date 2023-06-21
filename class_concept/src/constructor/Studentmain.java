package constructor;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("국어 :");
		int kor = sc.nextInt();
		System.out.print("영어 :");
		int eng=sc.nextInt();
		System.out.print("수학 :");
		int math=sc.nextInt();
		
		Student stu = new Student(name, kor, eng, math);
		
		System.out.println("이름 : "+ stu.getName());
		System.out.println("국어 : "+ stu.getKor());
		System.out.println("영어 : "+ stu.getEng());
		System.out.println("수학 : "+ stu.getMath());
		System.out.println("-------------------");
		System.out.println("합계 : "+ stu.getTotal());
		System.out.printf("평균 : %.2f",stu.getAvr());
		
	}

}

