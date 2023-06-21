package arrayLists;

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		ArrayList<String> arrClear = new ArrayList<>();
		arrClear.add("123"); 
		arrClear.add("456");
		
		
		System.out.println(arrClear.get(0));
		System.out.println(arrClear.get(1));
		
		
		arrClear.clear(); // 모두 삭제
		System.out.println("삭제 후"); 
		System.out.println(arrClear.get(0));// 에러 
		System.out.println(arrClear.get(1));
		}

}
