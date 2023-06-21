package loop;


import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		두 수를 입력 받아 작은 수 ~ 큰 수의 합계를 출력하세요.
		System.out.print("두 수 입력 : ");
		int small = sc.nextInt();
		int big = sc.nextInt();
		
		// 두 변수 데이터 교환
		if(small > big) {
			int tmp = small;
			small = big;
			big = tmp;
		}
		
		int total = 0;
		for(int i = small; i <= big; i++)
			total += i;
		
		System.out.println(small + " ~ " + big + "까지 합 : " + total);
		
//		수를 입력 받아 소수인지 아닌지 판별해서 출력하세요.
		System.out.print("수 입력 : ");
		int data = sc.nextInt();
		
		boolean check = true;
		for(int i = 2; i < data; i++) {
			if(data % i == 0)
				check = false;
		}
		
		if(check)
			System.out.println(data + "는/은 소수이다.");
		else
			System.out.println(data + "는/은 소수가 아니다.");
		
		/*
		 * data = 7;
		 * 7 % 2 
		 * 7 % 3
		 * 7 % 4 
		 * 7 % 5
		 * 7 % 6 
		 * 
		 */
	}


}







