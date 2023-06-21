package condition;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("입력: ");
		int data = input.nextInt();
		String result;
		if (data % 2 == 0 )
			result = data +"는/은 짝수입니다.";
		else 
			result = data + "는/은 홍수입니다.";
		System.out.println(result);
	}
}
