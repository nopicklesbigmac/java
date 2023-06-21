package arrays;

import java.util.Random;

public class Quiz08 {
	public static void main(String[] args) {
		int lotto[] = new int[6],i=0,j,tmp;	
		Random r = new Random();		
		while(true) {
			lotto[i] = r.nextInt(45) + 1;
			for(j=0;j<i;j++) { 		
				if(lotto[i] == lotto[j])
					continue;				
				}
			i++;
			if(i==6)
				break;
			}
		System.out.print("번호 :\t");
		for (i=0;i<6;i++) {
			System.out.print(lotto[i] + " ");
		}
		for(i = 0; i < 5; i++) {
			for(j = i + 1; j < 6; j++) {
				if(lotto[i] > lotto[j]) {
					tmp = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = tmp;
				}
			}
		}
		System.out.print("\n정렬 :\t");
		for(i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}