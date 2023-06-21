package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		arr.add("123");
		arr.add("456");
		
		// indexOf 인덱스 값을 반환해줌 
		// 없으면 -1을 반환 해줌
		System.out.println(arr.contains("123"));
		System.out.println(arr.contains("12"));
		
		System.out.println("검색할 데이터 :");
		String searchData = input.next();
		
		if (arr.contains(searchData)) {
		System.out.println(searchData+"데이터가 존재합니다.");
		}else
		System.out.println(searchData+"데이터가 존재하지 않습니다.");
		}

}
