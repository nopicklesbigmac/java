package arrays;

import java.util.Scanner;

public class Quiz02 {
	public static int inputcheck(String sub) {
		Scanner sc = new Scanner(System.in);
		while(true) {
	         System.out.print(sub+"점수 : ");
	         int tmp = sc.nextInt();
	         if (tmp>=0&&tmp<=100) 
	            return tmp ;
	            		}
	}

	public static void main(String[] args) {
		int [] s = new int [4];
		s[0] = inputcheck("국어");
		s[1] = inputcheck("영어");
		s[2] = inputcheck("수학");
		
		s[3]=s[1]+s[2]+s[0];
		double avr = s[3] / 3.0;
		System.out.println("총점 : " + s[3]);
		System.out.println("평균 : " + avr);
		
				
		
		
		
	}

}
