package hashSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex03 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("라면");
		hs.add("고길동");
		hs.add("현대인");
		hs.add("고길동");
		System.out.println("HashSet : "+hs);
		System.out.println(hs.remove("고길동"));
		System.out.println("HashSet : "+hs);
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("라면");
		list.add("고길동");
		list.add("현대인");
		list.add("고길동");
;
		System.out.println("HashSet : "+list);
	}
}