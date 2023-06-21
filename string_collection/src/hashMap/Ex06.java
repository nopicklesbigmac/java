package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("선풍기", 100);
		map.put("에어컨", 200);
		map.put("건조기", 300);
		
		
		Iterator<String> itk = map.keySet().iterator();
		while(itk.hasNext()) {
		String key = (String)itk.next();
		System.out.println(key + " : " + map.get(key));
		}
		Iterator<Integer> itv = map.values().iterator();
		while(itv.hasNext()) {
		Integer value =itv.next();
		System.out.println(value);
		}
		}
}