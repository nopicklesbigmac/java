package loop;

public class Quiz09 {
	public static void main(String[] args) {
		int ssal = 102000;
		int m = 2;
		int eat = 20;
		int count = 0;
		
		while(ssal > 0) {
			count++;
			ssal = ssal - (m * eat);
			if(count % 10 == 0) {
				m *= 2;
				}
		}System.out.println(count+"일, "+ m+"마리");
		
		int i=0, sum=0, j=0; 
		while (sum < 100) {
			i++;
			j = i + 1;
			if(i % 2 != 0) 
				sum += i * j;
			else 
				sum -= i * j;
		}System.out.println(i+", "+ j);
	}
}

