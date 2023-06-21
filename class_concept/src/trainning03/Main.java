package trainning03;

import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);
	private static MemberService memberService = new MemberService();
	
	public static void insert() {
		MemberDTO memberDto = new MemberDTO();
		System.out.println("=== 회원 등록 ===");
		System.out.print("이메일 : ");  memberDto.setEmail(in.next());
		System.out.print("이름 : ");	memberDto.setName(in.next());
		System.out.print("전화번호 : "); memberDto.setMobile(in.next());
		memberService.insert(memberDto);
	}
	
	public static void selectOne() {
		System.out.println("=== 회원 검색 ===");
		System.out.print("이메일 : "); String email = in.next();
		memberService.selectOne(email);
	}
	
	public static void delete() {
		System.out.println("=== 회원 삭제 ===");
		System.out.print("이메일 : "); String email = in.next();
		memberService.delete(email);
	}
	
	public static void selectAll() {
		memberService.selectAll();
	}
	public static void update() {
		System.out.println("=== 회원 수정 ===");
		MemberDTO memberDto = new MemberDTO();
		System.out.print("이메일 : ");  memberDto.setEmail(in.next());
		System.out.print("이름 : ");	memberDto.setName(in.next());
		System.out.print("전화번호 : "); memberDto.setMobile(in.next());
		memberService.update(memberDto);
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1: insert(); break;
			case 2: selectOne(); break;
			case 3: delete(); break;
			case 4:	selectAll(); break;
			case 5: update(); break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
}
}