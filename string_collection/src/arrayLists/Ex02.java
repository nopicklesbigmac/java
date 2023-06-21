package arrayLists;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("12.3");
		list.add("string");
		
		
		for(int i=0; i <list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println();
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
