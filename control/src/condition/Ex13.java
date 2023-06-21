package condition;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null; 
		int select; 
		boolean stop = true;
		
		while(stop){
			System.out.println("1. 이름 입력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			select = input.nextInt();
		
			switch (select) {
			case 1 : System.out.println("이름 입력");
			name = input.next(); break;
			case 2 : System.out.println("이름: " + name); break;
			case 3: stop = false;
			default :
				System.out.println("메뉴를 확인 후 다시 입력하세요.");
		}
		}
		}
}