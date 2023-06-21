package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> p = new ArrayList<>();
		ArrayList<String> em = new ArrayList<>();
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
				System.out.print("이름 : ");
				String nam = in.next();
				name.add(nam);
				System.out.print("전화번호 : ");
				String ph = in.next();
				p.add(ph);
				while(true) {
					System.out.print("이메일 입력: ");
					String e = in.next();
						if(em.contains(e)) {
							System.out.println("이미 존재하는 이메일");
							continue;
						}else {
							em.add(e);
							break;
						}
					}
				break;
			case 2 :
				System.out.print("이메일 검색 :");
				String searchData = in.next();
				int index = em.indexOf(searchData);
				if (index != -1) {
					System.out.println("이름:"+name.get(index));
					System.out.println("번호:"+p.get(index));
					System.out.println("메일:"+em.get(index));
					System.out.println();
				}else {
					System.out.println(searchData+", 없는 이메일");
				}
				break;
			case 3 :
				System.out.print("이메일 :");
				searchData = in.next();
				index = em.indexOf(searchData);
				if (index != -1) {
					name.remove(index);
					em.remove(index);
					p.remove(index);
				}else {
					System.out.println(searchData+", 없는 이메일");
				}
				break;
			case 4 : 
				for (int i = 0; i < name.size(); i++) {
					System.out.println("이름 : "+name.get(i));
					System.out.println("전화번호 : "+p.get(i));
					System.out.println("이메일 : "+em.get(i));
				}
				break;
			case 5 :
				System.out.print("이메일 :");
				searchData = in.next();
				index = em.indexOf(searchData);
				if (index != -1) {
					System.out.print("변경할 이름 : ");
					String element = in.next();
					name.set(index, element);
					System.out.print("변경할 번호 : ");
					element = in.next();
					p.set(index, element); 
					System.out.print("변경할 이메일 : ");
					element = in.next();
					em.set(index, element);
					
				}else {
					System.out.println(searchData+", 없는 이메일");
				}
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
