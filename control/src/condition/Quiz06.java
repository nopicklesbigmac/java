package condition;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("커피 수: ");
		int data = sc.nextInt();
		int re;
		if(data <= 10) {
			re = data * 2000;
		}else {
			re = (data-10) * 1500 +20000 ;
		}
		System.out.println("커피가격 : " + re );
	
		System.out.println("과자 수: ");
		data = sc.nextInt();
		if (data >= 100) {
			re = data*1000/100*88 ;
		}	else if	(data >= 10) {
			re = data*1000/100*90 ;
		}else {
			re = data * 1000;
		}
		System.out.println("과자가격 : " + re );
	}
 }


