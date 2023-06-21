package jdbc_concept03.me;

import java.util.Scanner;

public class Main {
	public static MemberService m = new MemberService();
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}
		Scanner sc = new Scanner(System.in);
		String email = "", name="", password="";
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				
				select = Integer.parseInt(sc.next());

			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = sc.next();
				System.out.print("이름 : ");	name = sc.next();
				System.out.print("비밀번호 : "); password = sc.next();
				m.insert(email,name, password);
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = sc.next();
				m.selectEmail(email);
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = sc.next();
				System.out.print("비밀번호 : "); password = sc.next();
				m.delete(email,password);
				break;

			case 4:
				m.selectAll();
				break;
			case 5:
				System.out.println("=== 비밀번호 수정 ===");
				System.out.print("이메일 : "); email = sc.next();
				System.out.print("현재 비밀번호 : ");	password = sc.next();
				System.out.print("변경 비밀번호 : "); String changePassword = sc.next();
				m.update(email,password,changePassword);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}

	}

}
