package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();
		int data;

		while(true) {
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			data = sc.nextInt();
			switch(data) {
			case 1 :
				System.out.print("메뉴이름 :");
				String key = sc.next();
				if (map.containsKey(key)) {
					System.out.println("이미 있는 메뉴");
				}else {
					System.out.print("가격 :");
					int value = sc.nextInt();
					map.put(key, value);
				}
				break;
			case 2 :
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					key = (String)it.next();
					System.out.println(key + " : " + map.get(key));
				}
				System.out.println("1. 수정");
				System.out.println("2. 삭제");
				System.out.println("3. 나가기");
				System.out.print(">>> ");
				data = sc.nextInt();
				switch(data) {
				case 1 :
					System.out.print("메뉴이름 :");
					key = sc.next();
					if (map.containsKey(key)) {
						System.out.print("가격 :");
						int value = sc.nextInt();
						map.put(key, value);
						;
					}else {
						System.out.println("없는 메뉴");
					}
					break;
				case 2 :
					System.out.print("메뉴이름 :");
					key = sc.nextLine();
					if (map.containsKey(key)) {
						map.remove(key);
					}else {
						System.out.println("없는 메뉴");
					}
					break;
				case 3 :
					System.out.println("==나가기==");
					return;
				default:
					System.out.println("다시입력");
					break;
				}
				
				break;
			case 3 :
				System.out.println("==종료==");
				return;
			default:
				System.out.println("다시입력");
				break;
			}
		}
	}
}


