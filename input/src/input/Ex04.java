package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("체중 : ");
		double weight = sc.nextDouble();
		System.out.println("키 : ");
		float height= sc.nextFloat();
		
		System.out.println("체중 : "+ weight);
		System.out.println("키 : "+ height);

	}

}
