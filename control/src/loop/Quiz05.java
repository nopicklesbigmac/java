package loop;

import java.util.Scanner;

public class Quiz05 { 
	public static void main(String[] args){ 
		Scanner	sc = new Scanner(System.in); 

		System.out.print("두 수 입력 : ");
		int data1 = sc.nextInt(); 
		int data2 = sc.nextInt(); 
		int x=0;
		for(int i = 2;i <= data1 && i <= data2; i++){ 
			if(data1 % i == 0 && data2 % i == 0) { 
				x = i;
			} 
		}
		
		System.out.println("최대 공약수는 " + x);
		for(int i = 1;i <= 1000; i++){ 
			if(i % 11 == 0 && i < 100 || i % 111 == 0) { 
				System.out.println(i);
			} 
		
		}
		
}
}


