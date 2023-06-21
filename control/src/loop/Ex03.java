package loop;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복횟수:");
		
		int repeat = sc.nextInt();
		
	
		for(int i=1;i<=repeat;i++) {
			System.out.println(i+"");
		}
		
		
	}
}
