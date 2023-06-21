package arrays;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[5];
		System.out.print("입력 : ");
		for(int i=0;i<5;i++) {
			s[i] = sc.nextInt();
		}
		int sex=0;
		for(int i=0;i<s.length-1;i++) {
			if (s[i]-s[i+1]<=0) sex = 1;
			if (s[i]-s[i+1]>=0) sex = 2;
		}
		if (sex==1) System.out.println("오름차순");
		else if (sex==2) System.out.println("내림차순");
		else System.out.println("섞임");
		
	}

}
