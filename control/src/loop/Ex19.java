package loop;

import java.util.Random;

public class Ex19 {

	public static void main(String[] args) {
		for(int i=0; i<5;i++)
			System.out.println(Math.random());
		
		Random r; 
		r = new Random();
		for (int i=0 ; i<5;i++)
			System.out.println(r.nextInt());
		
		for (int i=0 ; i<5;i++)
			System.out.println(r.nextInt(11)+10);
	}

}
