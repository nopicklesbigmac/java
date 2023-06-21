package condition;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "", name2 = "";
		
		while(true){
			System.out.println("1.  우리집등록");
			System.out.println("2.  회사등록");
			System.out.println("3.  등록보기");
			System.out.println("3.  등록보기");
			System.out.println("4.  종료");
			System.out.print(">>> ");
			String select = sc.next();
			sc.nextLine();
		// nextLine은 뛰어 쓰기도 저장 가능 
			switch (select) {
				case "1" : 
					System.out.println("우리집 등록");
					name = sc.nextLine();
					break;
				case "2" : 
					System.out.println("회사 등록");
					name2 = sc.nextLine(); 
					break;
				case "3" : 
					System.out.println("우리집: " + name + "\n회사: " + name2 ); 
					break;
				case "4": 
					System.exit(0);
				default :
					System.out.println("메뉴를 확인 후 다시 입력하세요.");
		}
		}
		}
}
	
