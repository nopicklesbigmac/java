package loop;

public class Ex17 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 5) {
			i++;
			if(i == 3) 
			System.out.println("i : " + i+"=break");
			break;
		}System.out.println("i : " + i);
	}
}
