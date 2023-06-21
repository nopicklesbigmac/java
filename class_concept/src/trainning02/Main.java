package trainning02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {// static을 안붙이면 Quiz quiz = new Quiz(); 
	private static MemberDaoImpl dao = new MemberDaoImpl();
	static String email,name,mobile;
	private static Scanner in = new Scanner(System.in);

	public static void insert() {
		System.out.print("이메일 입력: ");
		email = in.next();
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("전화번호 : ");
		mobile = in.next();
		int index = dao.selectIndex(email);
		if (index == -1) {
			dao.insert(email, name, mobile);
			System.out.println("등록.");
			}
		else {
			System.err.println("이미있는 이메일");
		}
	}
	public static void selectOne( ) {
		System.out.print("이메일 검색 :");
		email = in.next();
		int index = dao.selectIndex(email);
		MemberDTO dto = dao.selectOne(index);
		if(index != -1) {
			System.out.println( dto.getEmail());
			System.out.println(dto.getName());
			System.out.println(dto.getMobile());
		}else
			System.err.println("없는 이메일");
	}
	
	
	public static void selectAll() {
		ArrayList<MemberDTO> members = dao.selectAll();
		if(members.isEmpty()) {
			System.err.println("없는 이메일");
		}else {
			for (MemberDTO dto : members) {
				System.out.println(dto.getEmail());
				System.out.println(dto.getName());
				System.out.println(dto.getMobile());
				System.out.println();
			}
			
		}
	}
	public static void delete( ) {
		System.out.print("이메일 :");
		email = in.next();
		int index = dao.selectIndex(email);
		if(index != -1) {
			dao.delete(index);
			System.err.println("삭제성공");
		}else
			System.err.println("없는 이메일");
	}
	public static void update() {
		System.out.print("이메일 :");
		email = in.next();
		int index = dao.selectIndex(email);
		if(index != -1) {
			System.out.print("새로운 이름 입력: ");
			name = in.next();
			System.out.print("새로운 전화번호 입력: ");
			mobile = in.next(); 
			dao.update(index, name, mobile);
			System.out.println("수정함.");
		}else
			System.err.println("없는 이메일");
	}
	public static void main(String[] args) {
		int data=0;
		while(true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램종료");
			System.out.print("선택 >");
			data = in.nextInt();
			switch(data){
			case 1 :insert();
				break;
			case 2 :selectOne();
				break;
			case 3 :delete();
				break;
			case 4 :selectAll();
				break;
			case 5 :update();
				break;
			case 6 : 
				System.out.println("프로그램종료");
				return;
			default :
				System.out.println(" 다시입력하세요.");
		}
		}
	}
}
