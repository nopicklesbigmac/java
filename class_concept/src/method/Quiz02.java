package method;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Absolute ab = new Absolute();
		Grade g = new Grade();
		
		System.out.print("데이터 입력:");
		int data = sc.nextInt();
		ab.setData(data);
		g.setData(data);
		System.out.println("절대값 : " + ab.getData());
		System.out.println("등급 : " + g.getData());
		
			
		
		
		
		
	}

}
