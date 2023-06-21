package trainning05.copy;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService memberService = new MemberService();
		String id;
		while(true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print(">>> ");
			String select = sc.next();
			switch(select) {
			case "1": System.out.println(" === 회원 등록 === ");
					System.out.print("아이디 : "); id = sc.next();
					System.out.print("비밀번호 : "); String pw = sc.next();
					System.out.print("이름 : "); String name = sc.next();
					memberService.insert(id, pw, name);
					break;
			case "2": System.out.println(" === 회원 검색 === ");
					System.out.print("아이디 : "); id = sc.next();
					memberService.selectOne(id);
					break;
			case "3": System.out.println(" === 회원 삭제 === ");
					System.out.print("아이디 : ");
					id = sc.next();
					System.out.print("비밀번호 : ");
					String currentPw = sc.next();
					memberService.delete(id, currentPw);
					break;
			case "4":  memberService.selectAll(); break;
			case "5": System.out.println(" === 비밀번호 수정 === ");
					System.out.print("아이디 : "); id = sc.next();
					System.out.print("현재 비밀번호 : "); currentPw = sc.next();
					System.out.print("변경 비밀번호 : "); String changePw = sc.next();
					memberService.update(id, currentPw, changePw);
					break;
			case "6": System.out.println("프로그램을 종료합니다."); System.exit(0);
			default:  System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
}
