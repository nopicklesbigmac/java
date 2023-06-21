package arrays;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생성할 배열의 길이를 입력: ");
		int a = s.nextInt();
		int[] b = new int[a];
		System.out.println(a+"개의 배열이 생성 ");
		System.out.println("데이터를 입력하세요");
		int i=0;
		while(true) {
			System.out.println(i+1 + "번째 데이터 입력: ");
			b[i] = s.nextInt();
			i++;
			if(i==a) 
				break;
			}
		System.out.print("배열 데이터: ");
		for(i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}

	
