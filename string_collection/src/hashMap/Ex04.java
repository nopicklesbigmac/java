package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("선풍기", 100);
		map.put("에어컨", 200);
		map.put("건조기", 300);
		
		Scanner sc= new Scanner(System.in);
		System.out.print("키입력 :");
		String key = sc.next();
		System.out.print("값입력 :");
		int value = sc.nextInt();
		
		System.out.println(map);
		System.out.println(key +":"+ map.get(key)+"만원");
		System.out.println(key +",검색결과"+ map.containsKey(key));
		System.out.println(value +",검색결과"+ map.containsKey(value));

	}

}
