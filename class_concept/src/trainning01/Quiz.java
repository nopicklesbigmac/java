package trainning01;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {// static을 안붙이면 Quiz quiz = new Quiz(); 
	private static ArrayList<String> names = new ArrayList<>();
	private static ArrayList<String> ps = new ArrayList<>();
	private static ArrayList<String> ems = new ArrayList<>();
	private static Scanner in = new Scanner(System.in);

	public static void insert(String em,String n,String p) {
		if(ems.contains(em)) {
			System.out.println(em + " 는 이미 등록된 이메일입니다.");
		}
		else {
			ems.add(em);
			names.add(n);
			ps.add(p);
			System.out.println(em + " , 등록완료 ");
		}
		return;
	}
	public static void selectOne(String em) {
		int index = ems.indexOf(em);
		if (ems.contains(em)) {
			System.out.println("이름:"+names.get(index));
			System.out.println("번호:"+ps.get(index));
			System.out.println("메일:"+ems.get(index));
			System.out.println();
		}else {
			System.out.println(em +", 없는 이메일");
		}
		return;
	}
	public static void selectAll() {
		for (int i = 0; i < names.size(); i++) {
			System.out.println("이름 : "+names.get(i));
			System.out.println("전화번호 : "+ps.get(i));
			System.out.println("이메일 : "+ems.get(i));
		}
		return;
	}
	public static void delete(String em) {
		int index = ems.indexOf(em);
		if (ems.contains(em)) {
			names.remove(index);
			ems.remove(index);
			ps.remove(index);
		}else {
			System.out.println(em+", 없는 이메일");
		}
		return;
	}
	public static void update(String em,int index) {
		if (index != -1) {
			System.out.print("변경할 이름 : ");
			String element = in.next();
			names.set(index, element);
			System.out.print("변경할 번호 : ");
			element = in.next();
			ps.set(index, element); 
		}else {
			System.out.println(em+", 없는 이메일");
		}
		return;
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
			case 1 :
				System.out.print("이메일 입력: ");
				String em = in.next();
				System.out.print("이름 : ");
				String n = in.next();
				System.out.print("전화번호 : ");
				String p = in.next();
				insert(em,n,p);
				break;
			case 2 : 
				System.out.print("이메일 검색 :");
				em = in.next();
				selectOne(em);
				break;
			case 3 : 
				System.out.print("이메일 :");
				em = in.next();
				delete(em);
				break;
			case 4 : 
				selectAll();
				break;
			case 5 :
				System.out.print("이메일 :");
				em = in.next();
				int index = ems.indexOf(em);
				update(em,index);
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
