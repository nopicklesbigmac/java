package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("김상수");list.add("이변수");list.add("박참조");
		list.add("조클래스"); list.add("지컬렉션");
		
		System.out.println(list);
		System.out.print("변경할 위치 : ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		System.out.print("변경 데이터 : ");
		String element = input.next();
		list.set(index, element); // 변경
//		list.add(index, element); // 추가
		System.out.println("======= 결과 =======");
		System.out.println(list);

	}

}
