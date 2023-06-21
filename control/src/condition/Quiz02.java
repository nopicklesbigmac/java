package condition;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("세 수를 입력: ");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		
		int sum = data1;
		if (sum < data2) sum = data2;
		if (sum < data3) sum = data3;
		System.out.println("가장 큰 수는 " + sum);
		
		System.out.printf("두 수를 입력: ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		sum = data1;
		if(sum < data2) sum = data2;
		if(sum % 2 == 0) {
			System.out.printf("큰 수 %d는 짝수입니다.\n", sum);
		}
		
		System.out.printf("두 수를 입력: ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		sum = data1 + data2;
		if(sum % 2 == 0 && sum % 3 == 0) {
			System.out.printf("짝수이면서 3의 배수" + sum);
		}
		
	}

}