package constructor;

import java.util.Scanner;

public class ThreeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 입력:");
		Three three = new Three(sc.nextInt());
		if (three.result())
			System.out.println(three.getData()+", 3의 배수");
		else
			System.out.println(three.getData()+", 3의 배수아님");

	}
}
