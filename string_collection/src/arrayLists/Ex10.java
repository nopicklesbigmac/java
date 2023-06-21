package arrayLists;

import java.util.ArrayList;

public class Ex10 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("123");
		arr.add("456");
		
		
		System.out.println("지우기 전 [0]: "+arr.get(0));
		System.out.println("지우기 전 [1]: "+arr.get(1));
		System.out.println("결과 값 : "+arr.remove("123"));
		
		
		System.out.println("지우기 후 [0]: "+arr.get(0));;
		System.out.println("결과 값 : "+arr.remove(0));
		System.out.println("지우기 후 [0]: "+arr.get(0));
		
	}

}
