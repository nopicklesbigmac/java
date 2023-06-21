package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("선풍기", 100);
		map.put("에어컨", 200);
		map.put("건조기", 300);
		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		ArrayList<String> keys = new ArrayList<>(map.keySet());
		ArrayList<Integer> values = new ArrayList<>(map.values());
		

		System.out.println("list keys" + keys);
		System.out.println("list values" + values);

	}

}
