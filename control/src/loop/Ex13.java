package loop;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0, sum = 0;
		do {
			System.out.print("수입력(1~100) : ");
			i = input.nextInt();
			if(i >= 1 && i <= 100)
				break;
			else
				System.out.println("잘못 입력, 다시");
		}while(true);
		for(int j = 1;j <= i; j++)
			sum += j;
		System.out.println("입력 받은 수까지의 합 : "+sum);
	}
}
