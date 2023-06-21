package condition;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int select;
		System.out.print("수 입력 : ");
		select = input.nextInt();
		switch(select){
			case 1: System.out.println("case 1 " + select); break;
			case 2: System.out.println("case 2 " + select); break;
			case 3: System.out.println("case 3 " + select); break;
			default: System.out.println("default 1,2,3이 아닌 다른 수");

		}
	System.out.println("다음문장");
	}
	
}