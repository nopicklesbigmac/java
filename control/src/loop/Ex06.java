package loop;

public class Ex06 {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++)
				System.out.println("i: "+i+", j: "+j);
		} 
		
		
		
		i=0;
		j=0;
		for(i = 2; i <= 9; i++) {
			System.out.println("\n"+i+"단");	
			for(j = 1; j <= 9; j++)
				System.out.println(i+"X"+j+"="+(i * j));
		} 
	}
}