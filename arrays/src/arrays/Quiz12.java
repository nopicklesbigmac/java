package arrays;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 3, idx = 0;
		int[] arr = new int[size];
		
		while (true) {
			System.out.println("현재 배열의 길이: " + arr.length);
			for (int i = idx; i < arr.length; i++) {
				System.out.print("입력: ");
				arr[idx] = input.nextInt();
				idx++;

				for (int j = 0; j < idx; j++) {
					System.out.print(arr[j] + ", ");
				}
				System.out.println();
			}

			// 배열에 모든 요소에 값이 저장되면 배열을 늘린다.
			int[] tmp = arr;
			size += 3;
			arr = new int[size];
			for (int i = 0; i < tmp.length; i++) {
				arr[i] = tmp[i];
			}
			System.out.println("증가됨(" + size + ")");
		}

	}
}
