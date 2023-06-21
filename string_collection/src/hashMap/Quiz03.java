package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		char data3 = 'A';
		System.out.println((int)data3);
		/*
		 * HashMap을 사용하여 회원 정보 만들기 ,해쉬맵은 패스워드와 이름을 저장하기 위해 두개를 생성함
		 * 1.회원등록: 아이디, 비번, 이름 3개의 정보를 등록함 아이디는 키로 비번과 이름은 발루로 사용
		 * 2.회원검색: 아이디를 키로 사용 중이기에 아이디를 이용하여 회원 정보를 검색하여 출력함
		 * 3.회원삭제: 아이디를 키로 사용 중이기에 아이디를 이용하여 회원 정보를 삭제
		 * 4.회원 모두 보기: 모든 정보 출력
		 * 5.비밀번호 수정: 아이디를 키로 사용 중이기에 아이디를 이용하여 비밀번호를 수정함
		 * 6.프로그램 종료: 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> password = new HashMap<>();
		HashMap<String,String> names = new HashMap<>();
		int data;
		String name,pass;
		
		while(true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 패스워드 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			data = sc.nextInt();
			switch(data) {
			case 1 :
				System.out.print("I D :");
				String id = sc.next();
				if (password.containsKey(id)) {
					System.out.println("이미 있는 I D");
				}else {
					System.out.print("password :");
					pass = sc.next();
					password.put(id, pass);
					System.out.print("이름 :");
					name = sc.next();
					names.put(id, name);
				}
				break;
			case 2:
				System.out.print("검색할 I D :");
				id = sc.next();
				if (password.containsKey(id)) {
					System.out.println("이름 : "+names.get(id));
					System.out.println("I D : " + id);
					System.out.println("password : " + password.get(id));
				}else {
					System.out.println("없는 I D");
				}
				break;
			case 3 :
				System.out.print("삭제할 I D :");
				id = sc.next();
				if (password.containsKey(id)) {
					System.out.print("password :");
					pass = sc.next();
					if (password.get(id).equals(pass)) {
						password.remove(id);
						names.remove(id);
						System.out.println("삭제완료");
					}else {
						System.out.println("password 틀림");
					}
				}else {
					System.out.println("없는 I D");
				}
				break;	
			case 4 :
				Iterator<String> itp = password.keySet().iterator();
				while(itp.hasNext()) {
					id = (String)itp.next();
					System.out.println("이름 : "+names.get(id));
					System.out.println("I D : " + id);
					System.out.println("password : " + password.get(id));;
					System.out.println();;
				}
				break;
			case 5 :
				System.out.print("I D :");
				id = sc.next();
				if (password.containsKey(id)) {
					System.out.print("password :");
					pass = sc.next();
					if (password.get(id).equals(pass)) {
						System.out.print("기존password :");
						pass = sc.next();
						password.put(id, pass);
						System.out.print(pass + ", 변경완료");
					}else {
						System.out.println("password틀림");
					}
				}else {
					System.out.println("없는 I D");
				}
				break;	
			case 6 :
				System.out.println("== 종료 ==");
				return;
			default:
				System.out.println("다시 입력");
				break;
			}
		}
	}
}

		
		
