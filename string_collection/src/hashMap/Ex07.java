package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("선풍기", 100);
		map.put("에어컨", 200);
		map.put("건조기", 300);
		

		for (String k: map.keySet()) {
			System.out.println(k+"키의 데이터 :"+map.get(k));
		}
		System.out.println("=========");
		for (Integer m: map.values()) {
			System.out.println(m+"키의 데이터 :"+map.get(m));
		}
	}
}

