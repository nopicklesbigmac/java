package loop;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		int end = in.nextInt();
		int count = 0;
		for (int i = 1; i <= end; i++) {
			int j = i;
			while (true) {
				int tmp = j % 10; 
				if (tmp % 3 == 0 && tmp != 0) {
					count++;
					System.out.print(i + " ");
				}
				j /= 10; 
				if (j == 0)
					break;
			}
		}
		System.out.println("\n출력 : " + count);
	}

}
