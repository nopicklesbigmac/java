package condition;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data;
		System.out.print("수 입력 : ");
		data = sc.nextInt();
		
		if(data > 100)
			System.out.println(data + ": 100보다 크다.");
		else if(data > 50)
			System.out.println(data + ": 50보다 크다.");
		else if(data == 50)
			System.out.println(data + ": 50과 같다.");
		else
			System.out.println(data + ": 50보다 작다.");
		}
}