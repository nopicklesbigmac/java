package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("선풍기", 100);
		map.put("에어컨", 200);
		map.put("건조기", 300);
		System.out.println("선풍기 : "+map.get("선풍기")+"만원");
		System.out.println("에어컨 : "+map.get("에어컨")+"만원");
		System.out.println("건조기 : "+map.get("건조기")+"만원");
		System.out.println("없는키 : "+map.get("없는키")+"만원");
		
		}
}
