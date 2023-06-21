package arrays;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 3, idx = 0;
		int[] arr = new int[size];
		boolean add=true;
		while (true) {
			System.out.println("현재 배열의 길이: " + arr.length);
			for (int i = idx; i < arr.length; i++) {
				add=true;
				System.out.print("입력: ");
				arr[idx] = input.nextInt();
				for(int k = 0; k <idx; k++) {
		               if(arr[idx] == arr[k]&&arr.length>0) {
		            	   System.out.print("중복 ");
		            	   idx--;
		            	   add=false;
		            	   continue;
		               }
		            }
				idx++;
				for (int j = 0; j < idx&&add; j++) {
					System.out.print(arr[j] + ", ");
				}
				System.out.println();
			}
			
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
