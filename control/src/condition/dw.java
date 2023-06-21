package condition;

import java.util.Scanner;

public class dw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("수를 입력: ");
		int data;
		boolean t = false;
		data = sc.nextInt();

		for (int i = 2; i < data; i++) {
			if (data % i == 0) {
				t = true;
				break;
			}
		}
		if (t) {
			System.out.println("소수아님.");
		} else {
			System.out.println("소수");
		}
		
		
		
	
	
	
	}
}