package input;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("당신의 이름은 무엇입니까 : ");
	String name = sc.nextLine();
	System.out.println(name + "님의 국어점수 : ");
	int name1 = sc.nextInt();
	System.out.println(name + "님의 영어점수 : ");
	int name2 = sc.nextInt();
	System.out.println(name + "님의 수학점수 : ");
	int name3 = sc.nextInt();
	int sum = name1 + name2 + name3;
	
	
	System.out.println("\n\n========================");
	System.out.println("이 름\t: \t"+ name);
	System.out.println("========================");
	System.out.println("국 어\t: \t"+ name1);
	System.out.println("영 어\t: \t"+ name2);
	System.out.println("수 학\t: \t"+ name3);
	System.out.println("========================");
	System.out.println("합 계\t: \t"+ sum);
	System.out.println("========================");
}
}
