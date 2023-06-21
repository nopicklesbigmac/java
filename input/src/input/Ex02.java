package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int data = input.nextInt();
		System.out.println("입력 받은 데이터  : " + data);		

	}
}
