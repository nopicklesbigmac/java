package hashSets;

import java.util.HashSet;
import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet hs = new HashSet();
			while(true) {
				hs.add(r.nextInt(45)+1);
				if(hs.size() == 6)
					break;
			}System.out.println(hs);
}
}
 

