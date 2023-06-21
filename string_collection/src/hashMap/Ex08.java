package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();
		
		System.out.println(map);
		System.out.print("삭제 키입력 :");
		String key = sc.next();

		System.out.println(map);
		System.out.println(map.remove(key));
		System.out.println(map);
	}

}
