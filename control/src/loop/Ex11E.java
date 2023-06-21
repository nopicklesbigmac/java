package loop;

import java.util.Scanner;


public class Ex11E {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String saveId = "", savePw = "", checkId, checkPw;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			String select = sc.next();

			switch(select) {
				case "1": System.out.print("아이디 입력 : ");
						checkId = sc.next();
						System.out.print("비밀번호 입력 : ");
						checkPw = sc.next();
						if(saveId.equals(checkId) && savePw.equals(checkPw)) {
							System.out.println("인증 성공 !!!");
						}else {
							System.out.println("인증 실패 !!!");
						}
						break;
				case "2": System.out.print("저장할 아이디 입력 : ");
						saveId = sc.next();
						System.out.print("저장할 비밀번호 입력 : ");
						savePw = sc.next();
						break;
				case "3": System.out.println("프로그램 종료 합니다.");
						System.exit(0);
				
				default : System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
	}

}
