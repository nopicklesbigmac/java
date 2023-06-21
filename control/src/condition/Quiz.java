package condition;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력 : ");
		int data = sc.nextInt();
		if (data %3 == 0 ) {
			System.out.println("3의배수 입니다  ");
		}
		System.out.println("수를 입력 : ");
		int data2 = sc.nextInt();
		if (data2 < 0 ) {
			System.out.println("data2의 절대값" + (-data2));
		}
		if (data2 > 0 ) {
			System.out.println("data2의 절대값" + (-data2));
		}		
//		System.out.println("data2의 절대값 : "+ Math.abs(data2));
		System.out.println("두 수를 입력 : ");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num2 > num3) {
			System.out.println(num2);
			
		}
		if (num2 < num3) {
			System.out.println(num3);
			
		}
}
}
