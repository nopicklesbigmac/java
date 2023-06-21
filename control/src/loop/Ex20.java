package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Random r; 
		r = new Random();
		
		Scanner sc; 
		sc = new Scanner(System.in);
		
		System.out.println("난수의 범위 입력 :");
		int begin = sc.nextInt();
		int end = sc.nextInt();
		
//		for (int i=0 ; i<5;i++)
		System.out.println(r.nextInt(end - begin+1)+end);
	}

}
