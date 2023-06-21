package loop;

public class Quiz02 {
	public static void main(String[] args) {
		int total=0, i;
		for (i = 1;i<=1000;i++) {
			if(i%3!=0) 
				total = total + i;
			else if (i%5==0) 
				total = total + i;
			else 
				total = total + i;
			
		}
		System.out.println(total);
		
		total=0;
		for (i = 1;total<10000;i+=2) {
			total = total + i;
			}
		System.out.println(i);

				}
			

		}
			

	
	
	
