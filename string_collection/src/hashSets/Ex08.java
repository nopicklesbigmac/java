package hashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("1.대부"); 
		set.add("2.반지의 제왕");
		set.add("3.겨울왕국"); 
		set.add("4.다크 나이트");
		set.add("5.해리포터"); 
		set.add("6.공공의 적");
		
		Iterator<String> it = set.iterator(); 
		Scanner sc = new Scanner(System.in);
		String deleteBookName = sc.nextLine();
		
		while( it.hasNext() ) {
		String name = (String)it.next();
			if (name.equals(deleteBookName )) {
				it.remove();
			}
		}
		
		
		System.out.println("삭제할책 :");
		deleteBookName = sc.nextLine();
		boolean  check = false;
		
		for (String name : set) {
			if (name.equals(deleteBookName )) {
				check = true;
				break;
			}
		}
		set.remove(deleteBookName);
		System.out.println(set);
		}
		
}