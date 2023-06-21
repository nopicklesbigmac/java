package hashSets;

import java.util.HashSet;

public class Ex05 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		      
		boolean check;
		      
		check = set.add("라면"); System.out.println("check : " + check);
		check = set.add("김밥"); System.out.println("check : " + check);
		check = set.add("순대"); System.out.println("check : " + check);
		check = set.add("김밥"); System.out.println("check : " + check);
		
		
		
		System.out.println("HashSet : " + set);
		check = set.remove("김밥"); System.out.println("check : " + check);
		check = set.remove("국수"); System.out.println("check : " + check);
		System.out.println("HashSet : " + set);
}
}