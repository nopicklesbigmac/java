package loop;

public class Ex14 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 5) {
			i++;
			if(i == 3) 
				continue;
			System.out.println("i : " + i);
		}
	}
}
