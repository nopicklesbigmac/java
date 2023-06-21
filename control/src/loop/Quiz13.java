package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		

		int com=0, user=0;
		while(true) {
			com = r.nextInt(3)+1;
			System.out.println("===== 안내면 진다 ~ 가위바위보 ~! =====\n1. 가위\t2. 바위\t3. 보\n0. 종료");
			System.out.println("입력 : ");
			try {//예외 처리 
				user = sc.nextInt();
			} catch (Exception e ) {
				System.out.println("숫자를 입력하세요");
				sc.next(); // 버퍼값 제거 
				continue;
			}
			if(com==1)
				System.out.print("com : 가위");
			if(com==2)
				System.out.print("com : 바위");
			if(com==3)
				System.out.print("com : 보");
			System.out.print("\t");
			if(user==1)
				System.out.println("user : 가위");
			if(user==2)
				System.out.println("user : 바위");
			if(user==3)
				System.out.println("user : 보");
			System.out.print("===== 결과 =====\n");
	        if (com == user) {
	        	System.out.println("무 승부");
	        } else if (user == 0) {
	        	System.out.println("종료");
	        	break;
	        } else if (com-user==-2 || com-user==1){
	    		System.out.println("com win");
	    	} else if (com-user==-1 || com-user==2){
	    		System.out.println("you win");
	    	}
		}
/*	 	
 * 		com	 user 
 *
 *		1	3	-2  com 승 
 *		2	1	1
 *		3	2	1
 *
 *		 
 *		3	1	2 	user 승 
 *		1	2	-1
 *		2	3	-1
 */	
	}
}