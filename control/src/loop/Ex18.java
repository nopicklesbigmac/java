package loop;

public class Ex18 {

	public static void main(String[] args) {
		int i = 0;
		boolean stop= true;
		while(stop) {
			i++;
			if(i == 3) 
				System.out.println("i : " + i+"=break");
				stop= false;
		}System.out.println("i : " + i);
	}
}