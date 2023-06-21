package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// com은 맞출 숫자, user 시작 메뉴를 입력할 숫자, count는 정답을 입력한 수
		// re 최고기록 i는 사용자가 입력한수 
		int com=0, user=0, count=0,i=0, re=0;
		while(true) {
			System.out.println("== up & down ==");
			System.out.println("1. game start");
			System.out.println("2. game score");
			System.out.println("3. game exit");
			try {//예외 처리 
				user = sc.nextInt();
			} catch (Exception e ) {
				System.out.println("숫자를 입력하세요");
				sc.next(); // 버퍼값 제거 
				continue;
			}
			com = r.nextInt(100)+1;
			if(user == 1) {
				System.out.println("<< game start >>");
				while(true) {
					System.out.println("<< player turn >>\ninput number:");
					
					try {//예외 처리 
						i = sc.nextInt();
					} catch (Exception e ) {
						System.out.println("숫자를 입력하세요");
						sc.next(); // 버퍼값 제거 
						continue;
					}
					if (i==com) {
						System.out.println("정답");
						count++;
						if ( re > count||re==0) {
							re = count;
							count=0;
						}
						break;
					}else if (i > com) {
						System.out.println(i+", down !!");
						count++;
					}else if (i < com) {
						System.out.println(i+", up !!");
						count++;						
					}else {
						System.out.println("1~100범위 안의 수가 아님");
						count++;
					}
				}	
			}else if(user == 2) {
				
				System.out.println("최고기록:"+re);
			}else if(user == 3) {
				System.out.println("게임을 종료합니다");
				break;
			}else {
				System.out.println("다시입력");
			}
		}
	}

}
