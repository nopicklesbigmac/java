package hashMap;

import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(0, "test");
		hm.put(1, "hello");
		hm.put("naver", "https://www.naver.com");
		
		System.out.println(hm);
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get("naver"));
		}
		}