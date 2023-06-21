package loop;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
		int data,tmp;
		System.out.print("수 입력 : ");
		data = input.nextInt();
		while(true) {
			tmp = data % 10;
			data= data / 10;
			System.out.print(tmp+" ");
			if(data == 0) 
				break;
		}
	}
}
