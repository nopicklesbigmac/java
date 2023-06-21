package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력:");
		int data = sc.nextInt();
		
		if (data >10 ) {
			System.out.println("10 보다 큰경우 첫 번째 종속문장 실행.");
			System.out.println("10 보다 큰경우 두 번째 종속문장 실행.");
		
		
		}
		System.out.println("다음문장");		
	}

}
