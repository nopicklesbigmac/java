package arrays;

import java.util.Random;

public class Quiz10 {

	public static void main(String[] args) {
		Random r = new Random();
		
		//각 행의 수는 중복되지 않아야 함
		int[][] lotto = new int[5][6];
		int i,j,k,tmp;
		for(i = 0; i < lotto.length; i++) {
			for(j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = r.nextInt(45) + 1;
				
				for(k = 0; k < j; k++) {
					if(lotto[i][k] == lotto[i][j]) {
						j--;
						break;
					}
				}
			}
		}
		
		System.out.println("정렬 전 출력");
		for(i = 0; i < lotto.length; i++) {
			for(j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i = 0; i < lotto.length; i++) {
			for(j = 0; j < lotto[i].length -1; j++) {
				for(k = j+1; k < lotto[i].length; k++) {
					if(lotto[i][j] > lotto[i][k]) {
						tmp = lotto[i][k];
						lotto[i][k] = lotto[i][j];
						lotto[i][j] = tmp;
					}
				}
			}
		}

		System.out.println("정렬 후 출력");
		for(i = 0; i < lotto.length; i++) {
			for(j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
