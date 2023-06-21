package hashSets;

import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		System.out.println("HashSet입력전  : "+hs.isEmpty());
		hs.add("라면");
		hs.add("고길동");
		hs.add("현대인");
		hs.add("고길동");
		System.out.println("HashSet : "+hs);
		System.out.println("HashSet입력후  : "+hs.isEmpty());
	}

}
