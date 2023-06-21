package loop;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {

	for ( int x=0;x<=10;x++) {
		for (int y=0;y<=10;y++) {
			if(3*x+2*y==10) {
				System.out.println(x + ", " + y);
			}
		}
	}
	
	Scanner sc = new Scanner(System.in);
	System.out.println("입력 : ");
	int end = sc.nextInt();
	int i;
	for (i= 2 ; i<= end;i++) {
		boolean check= true;
		for(int j=2; j<i;j++) {
			if(i%j==0)
				check = false;
		}
		if (check)
			System.out.println(i+" ");
	}
	}
}
