package arrays;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double arr[] = new double[3];
		for(int i = 0; i < arr.length; i++) {
		System.out.print(i+1+"번째 이름 입력 : ");
		arr[i] = in.nextDouble();
		}
		for(int i = 0; i < arr.length; i++)
		System.out.println(i+1+"번째 값 : "+ arr[i]);
		}
}