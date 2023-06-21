package loop;

public class Ex02 {

	public static void main(String[] args) {
		int total=0;
		for (int i = 1;i<=10;i++)
			total +=i;
		System.out.println("1~10의 범위의 합 :"+total);
		
		
		total=0;
		for (int i = 123;i<=456;i++) {
			total +=i;
		}
		System.out.println("123~456의 범위의 합 :"+total);
		
		total=0;
		for (int i = 1;i<=1000;i++) {
			if(i%2==0)
			total +=i;
		}
		System.out.println("1~1000 짝수의 합 :"+total);
		
		
		total=0;
		for (int i = 1;i<=1000;i++) {
			if(i%2==1)
			total +=i;
		}
		System.out.println("1~1000 홀수의 합 :"+total);
		
			
		
	
	}
}
