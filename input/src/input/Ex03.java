package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력 : ");
		String name = sc.next();
		System.out.println("나이입력 : ");
		int age = sc.nextInt();
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);

	}
}
