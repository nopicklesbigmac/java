package loop;

import java.util.Scanner;

public class Ex04 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복횟수:");
		
		int repeat = sc.nextInt();
		
		int i=1;
		for(;i<=repeat;) {
			System.out.println(i+"");
			i++;
		}
		
		
	}
}
