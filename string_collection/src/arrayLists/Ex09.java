package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		arr.add("123");
		arr.add("456");
		

		System.out.println(arr.indexOf("456"));
		System.out.println(arr.indexOf("12"));
		
		System.out.println("검색할 데이터 :");
		String searchData = input.next();
		int index = arr.indexOf(searchData);
		
		
		if (index != -1) {
			System.out.println(arr.get(index)+"데이터가 존재합니다.");
		}else
			System.out.println(searchData+"데이터가 존재하지 않습니다.");
	}
}
