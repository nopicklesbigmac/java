package condition;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력 : ");
		int data = sc.nextInt();
		String result;
		
		if (data %3 == 0 ) 
			result = data + "는/은 3의 배수가 아닙니다.";
		else 
			result = data + "는/은 3의 배수가 아닙니다.";
		
		System.out.println(result);
		}
		
}
