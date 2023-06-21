package method;

import java.util.Scanner;

public class ThreeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Three three = new Three();
		
		System.out.print("데이터 입력:");
		int data =sc.nextInt();
		three.setData(data);
		
		if (three.result())
			System.out.println(three.getData()+", 3의 배수");
		else
			System.out.println(three.getData()+", 3의 배수아님");

	}
}
