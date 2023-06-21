package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		 * 회원등록 : 이름(중복 허용), 전화번호(중복 허용), 이메일(중복 허용 안됨)
		 * 회원 검색 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 없으면 없음 출력
		 * 회원 삭제 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 삭제 없으면 없음 출력
		 * 회원 수수정 : 이메일로 검색하여 있으면 이름, 전화번호 수정 없으면 없음 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> email = new ArrayList<>();
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select = 0;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}
			String p = "";
			int index = 0;
			switch (select) {
			case 1:
				System.out.println("== 회원 등록 ==");
				System.out.print("이메일 : ");
				p = sc.next();
				if (email.contains(p) == false) {
					email.add(p);
					System.out.print("이름 : ");
					names.add(sc.next());
					System.out.print("전화번호 : ");
					num.add(sc.next());
					System.out.println("회원 등록 완료");
				} else {
					System.out.println("중복된 이메일 입니다.");
				}
				break;			
			case 2:
				System.out.println("== 회원 검색 ==");
				System.out.print("이메일 : ");
				p = sc.next();
				index = email.indexOf(p);
				if (index != -1) {
					System.out.println("이름 : " + names.get(index));
					System.out.println("전화번호 : " + num.get(index));
					System.out.println("이메일 : " + email.get(index));
				} else {
					System.out.println("등록되지 않은 정보입니다.");
				}
				break;
			case 3:
				System.out.println("== 회원 삭제 ==");
				System.out.print("이메일 : ");
				p = sc.next();
				index = email.indexOf(p);
				if (index != -1) {
					System.out.println("다음과 같이 데이터를 삭제했습니다.");
					System.out.println("이름 : " + names.remove(index));
					System.out.println("전화번호 : " + num.remove(index));
					System.out.println("전화번호 : " + email.remove(index));
				} else {
					System.out.println("등록되지 않은 정보입니다.");
				}
				break;
			case 4:
				System.out.println("== 회원 보기 ==");
				if(names.isEmpty()) {
					System.out.println("등록된 정보가 없습니다.");
				}else {
					System.out.println("등록 정보 모두 보기");
					for (int i = 0; i < email.size(); i++) {
						System.out.println("이름: " + names.get(i));
						System.out.println("전화번호: " + num.get(i));
						System.out.println("이메일: " + email.get(i));
					}
					
				}

				break;
			case 5:
				System.out.println("== 회원 수정 ==");
				System.out.print("회원 이메일 : ");
				p = sc.next();
				index = email.indexOf(p);
				if (index != -1) {
					System.out.print("전화번호 수정 : ");
					String phnum = sc.next();
					num.set(index, phnum);
					System.out.print("이름 수정 : ");
					String names2 = sc.next();
					names.set(index, names2);
					System.out.println("수정 되었습니다.");
					System.out.println(email + phnum + names2);
				}else {
					System.out.println("수정이 없습니다.");
				}
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		
	}

}
}