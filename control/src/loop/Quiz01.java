package loop;

public class Quiz01 {
	public static void main(String[] args) {
		
		for (int i = 1;i<5;i++) {
			System.out.println(i+".hello");
			
		}
		int total=0;
		for (int j = 0; j<=100;j++) {
			total += j;
			if(total == 528)
				total += j;
				System.out.println(j);
				break;
				
		}
		for (int i = 1;i<26;i++) {
			if(i%5 == 1) 
				System.out.print("\n");
			System.out.print(i+ " ");
		}
}
}
	


