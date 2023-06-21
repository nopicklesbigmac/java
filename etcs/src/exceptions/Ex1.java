package exceptions;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1, data2, result;

		System.out.print("두 수 입력 :");
		data1=sc.nextInt();
		data2=sc.nextInt();
		result = data1/ data2;
		System.out.println(result);
		
		
		
		
//		if (data2==0) {
//			System.out.print("0으로 나눌수 없어요.");
//		}else {
//			result = data1/ data2;
//			System.out.println(result);
//		}
	}

}
