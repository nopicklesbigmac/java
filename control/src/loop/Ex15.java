package loop;

public class Ex15 {
	public static void main(String[] args) {
		int i, total=0;
		for (i = 1; i<=100;i++) {
			if (i%2==0)
				continue;
			total +=i;
		}
		System.out.println("홀수의 합계: " + total);
	}
	
}
