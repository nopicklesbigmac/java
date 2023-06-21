package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		

		int com=0, user=0;
		while(true) {
			com = r.nextInt(2)+1;
			System.out.println("===== 동전 앞 뒤 맞추기 =====\n1. 앞면\n2. 뒷면\n3. 종료");
			System.out.println("입력 : ");
			user = sc.nextInt();
	        if (com == user) {
	        	System.out.println("정답");
	        } else if (user == 3) {
	        	System.out.println("종료");
	        	break;
	        }else {
	        	System.out.println("땡!");
	        	continue;
	        }
		}
	
	
	}
}