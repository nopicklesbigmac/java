package method;

import java.util.Scanner;

public class EvenOddMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 입력:");
		EvenOdd eo = new EvenOdd();
		eo.setData(sc.nextInt());
		if (eo.result())
			System.out.println(eo.getData()+", 짝수");
		else
			System.out.println(eo.getData()+", 홀수");
			
		
	}

}
