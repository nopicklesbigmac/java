package condition;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수입력: ");

		int data1 = sc.nextInt();
		if(data1 % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		System.out.print("수입력: ");
		data1 = sc.nextInt();
		if(data1 > 0 && data1 < 100) {
			System.out.println("적중");
		} else {
			System.out.println("비적중");
		}
		
		System.out.print("수입력: ");
		data1 = sc.nextInt();
		if(data1 % 2 == 0 && data1 % 3 == 0) {
			System.out.println("3의 배수이자 짝수");
		} else {
			System.out.println("3의 배수이자 짝수가 아니다.");
		}
	}

}
