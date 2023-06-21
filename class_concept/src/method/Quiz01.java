package method;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prime prime = new Prime();
		Max max = new Max();
		
		System.out.print("데이터 입력:");
		max.setData1(sc.nextInt());
		max.setData2(sc.nextInt());
		System.out.println("큰수 : " + max.getMax());
		System.out.println();
		System.out.print("소수 : ");
		prime.setData1(sc.nextInt());
		System.out.println("소수 : "+ prime.getPrime());
		
			
		
		
		
		
	}

}
