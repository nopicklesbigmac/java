package condition;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("세 수를 입력: ");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		
		int max = data1;
		if (max < data2) max = data2;
		if (max < data3) max = data3;
		int min = data1;
		if (min > data2) min = data2;
		if (min > data3) min = data3;
		System.out.println("가장 큰 수 : " + max +", 가장 작은 수 : " + min);

		System.out.print("정수입력: ");
		data1 = sc.nextInt();
		String re = "";
		
		if (data1 == 0) {
			re = "다시입력";
		}
		else if(data1 % 3 == 0 && data1 % 4 == 0) {
			re = "는 3과4의 배수이다.";
		} 
		else if (data1 % 3 == 0) {
			re = "는 3의 배수이다.";
		}
		else if (data1 % 4 == 0) {
			re = "는 4의 배수이다.";
		}
		else {
			re = "는 3의배수도  4의배수도 아니다.";
			
		}
		System.out.println(data1 + re);
	}
}
		
		
