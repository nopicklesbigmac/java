package arrays;

import java.util.Random;

public class Quiz09 {
	public static void main(String[] args) {
		Random r = new Random();
		int arr[][]= new int[5][5];
		int data = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = r.nextInt(9)+1;
				System.out.print(arr[i][j] +"\t");
			}System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = r.nextInt(26)+97;
				System.out.print((char)arr[i][j] +"\t");
			}System.out.println();
		}
		

}
}
