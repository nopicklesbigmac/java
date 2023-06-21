package loop;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1번
		while (true) {
			System.out.println("1. 문자입력:");
			char i = sc.next().charAt(0);
			if (i=='q') 
				break;
		}
		
		//2번
		int data,tmp,sum=0;
		System.out.print("2. 숫자입력 : ");
		data = sc.nextInt();
		while(true) {
			tmp = data % 10;
			data = data / 10;
			sum += tmp;
			if(data == 0) 
				break;
		}
		System.out.println(sum);
		
		//3번 
		System.out.print("3. 숫자입력 : ");
		data = sc.nextInt();
		int re = 0;
		while(true) {
			tmp = data % 10;
			data= data / 10;
			re += tmp;		
			if (data != 0) 
				re = re * 10;
			else 
				break;
		}
		System.out.println(re);
	}
}
