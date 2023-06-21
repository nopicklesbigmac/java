package loop;

public class Ex12 {

	public static void main(String[] args) {
		int i=0, total = 0;
		do {
			i++;
			total += i;
		} while (i <=9);
		
		System.out.println("total = "+total);
	}

}
