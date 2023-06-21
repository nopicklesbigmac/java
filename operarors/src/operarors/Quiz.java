package operarors;

import java.util.Scanner;

public class Quiz {
	public static void root() {
		System.out.println("root 메소드");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력 : ");
		int num = sc.nextInt();
		
		String s = (num %2 == 0 ) ? "짝수":"홀수";
		System.out.println(num+ "= "+s);
		String s1 = (num %3 == 0 ) ? "3의 배수이다.":"3의 배수가 아니다.";
		System.out.println(num+ "= "+s1);
		
		System.out.println("두 수를 입력 : ");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("num2:"+ num2 + ", num3:"+ num3);
		String s2 = (num2 < num3 ) ? "num3가 크다 .":"num2가 크다";
		System.out.println(s2);
	}
}
