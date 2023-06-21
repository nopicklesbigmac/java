package hashSets;

import java.util.HashSet;

public class Ex06 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥");
		System.out.println("HashSet : "+hs);
		System.out.println("라면 :"+hs.contains("라면"));
		System.out.println("우동 :"+hs.contains("우동"));
		System.out.println("데이터의 저장 개수 :"+hs.size());
	}}
