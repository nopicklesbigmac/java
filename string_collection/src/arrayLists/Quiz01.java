package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> p = new ArrayList<>();
		int data=0;
		while(true) {
			System.out.println("1. 전화번호등록");
			System.out.println("2. 전화전호 검색");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 모두 보기");
			System.out.println("5. 프로그램종료");
			System.out.print("선택 >");
			data = in.nextInt();
			switch(data){
			case 1 : 
				System.out.print("이름 : ");
				String nam = in.next();
				name.add(nam);
				while(true) {
					System.out.print("전화번호 입력: ");
					String ph = in.next();
						if(p.contains(ph)) {
							System.out.println("이미 존재하는 전화번호");
							continue;
						}else {
							p.add(ph);
							break;
						}
					}
				break;
			case 2 :
				System.out.print("번호 검색 :");
				String searchData = in.next();
				int index = p.indexOf(searchData);
				if (index != -1) {
					System.out.println("이름:"+name.get(index));
					System.out.println("번호:"+p.get(index));
				}else {
					System.out.println(searchData+", 없는 연락처");
				}
				break;
			case 3 :
				System.out.print("이름 :");
				searchData = in.next();
				index = p.indexOf(searchData);
				if (index != -1) {
					name.remove(index);
					p.remove(index);
				}else {
					System.out.println(searchData+", 없는 연락처");
				}
				break;
			case 4 : 
				for (int i = 0; i < name.size(); i++) {
					System.out.println("이름 : "+name.get(i));
					System.out.println("전화번호 : "+p.get(i));
				}
				break;
			case 5 : 
				System.out.println("프로그램종료");
				return;
			default :
				System.out.println(" 다시입력하세요.");
		}
		}
	}
}


