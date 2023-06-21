package method;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		System.out.print("이름 :");
		stu.setName(sc.next());
		System.out.print("국어 :");
		stu.setKor(sc.nextInt());
		System.out.print("영어 :");
		stu.setEng(sc.nextInt());
		System.out.print("수학 :");
		stu.setMath(sc.nextInt());
		
		System.out.println("이름 : "+ stu.getName());
		System.out.println("국어 : "+ stu.getKor());
		System.out.println("영어 : "+ stu.getEng());
		System.out.println("수학 : "+ stu.getMath());
		System.out.println("-------------------");
		System.out.println("합계 : "+ stu.getTotal());
		System.out.printf("평균 : %.2f",stu.getAvr());
		
	}

}

