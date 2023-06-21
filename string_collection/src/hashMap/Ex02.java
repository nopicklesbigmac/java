package hashMap;

import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(0, "admin");
		hm.put(1, "user1");
		hm.put(1, "user2");
		
		System.out.println(hm);
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		}
		}