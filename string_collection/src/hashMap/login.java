package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<String,Integer> pass = new HashMap<>();
		HashMap<String,String> name = new HashMap<>();
		
		int data;

		while(true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 패스워드 수정");
			System.out.println("6. 프로그램 종료");
			System.out.println("7. 로그인");
			System.out.print("선택 > ");
			data = sc.nextInt();
			switch(data) {
			case 1 :
				System.out.print("I D :");
				String id = sc.next();
				if (pass.containsKey(id)) {
					System.out.println("이미 있는 I D");
				}else {
					System.out.print("password :");
					int passw = sc.nextInt();
					pass.put(id, passw);
					System.out.print("이름 :");
					String name1 = sc.next();
					name.put(id, name1);
				}
				break;
			case 2:
				System.out.print("검색할 I D :");
				id = sc.next();
				if (pass.containsKey(id)) {
				System.out.println("이름 : "+name.get(id));
				System.out.println("I D : " + id);
				System.out.println("password : " + pass.get(id));
				}else {
					System.out.println("없는 I D");
				}
				break;
			case 3 :
				System.out.print("삭제할 I D :");
				id = sc.next();
				if (pass.containsKey(id)) {
					pass.remove(id);
					name.remove(id);
					System.out.print("삭제완료");
				}else {
					System.out.println("없는 I D");
				}
				break;	
			case 4 :
				Iterator<String> itp = pass.keySet().iterator();
				while(itp.hasNext()) {
					id = (String)itp.next();
					System.out.println("이름 : "+name.get(id));
					System.out.println("I D : " + id);
					System.out.println("password : " + pass.get(id));;
					System.out.println();;
				}
				break;
			case 5 :
				System.out.print("I D :");
				id = sc.next();
				if (pass.containsKey(id)) {
					System.out.print("password :");
					int passw = sc.nextInt();
					pass.put(id, passw);
					System.out.print(passw + ", 변경완료");
					;
				}else {
					System.out.println("없는 I D");
				}
				break;	
			case 6 :
				System.out.println("==종료==");
				return;
			case 7 :
				System.out.print("I D : ");
				id = sc.next();		
				if (pass.containsKey(id)) {
					System.out.print("password :");
					int passw = sc.nextInt();
					if (pass.get(id)==passw) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("password가 틀림");
					}
				}else {
					System.out.println("없는 I D");
				}
				break;
			default:
				System.out.println("다시입력");
				break;
			}
		}
	}
}

		
		
