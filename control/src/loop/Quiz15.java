package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// com은 정답, user 시작 메뉴를 입력할 숫자, count 사용자와 컴퓨터의 순번
		//  i는 사용자와 컴퓨터의 답 
		int i=0, user=0, com=0,max=100,min=0,win=0, lose=0, count=0;
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
					if (count%2==0) {
						System.out.println("<< player turn >>\ninput number:");
						i= sc.nextInt();
					}else if (count%2==1) {
						i = r.nextInt(max-min+1)+min;
						System.out.println("<< com turn >>\n:"+ i);
					}
					if (com==i) {
						System.out.println("정답");
						if (count%2==0) {
							win++;
							System.out.println("플레이어 승");
						}else {
							lose++;
							System.out.println("컴퓨터 승");
						}
						break;
					}else if (i > com) {
						System.out.println(i+", down !!");
						max = i;
						count++;
					}else if (i < com) {
						System.out.println(i+", up !!");
						min = i;
						count++;
					}else {
						count++;
						System.out.println("1~100범위 안의 수가 아님");
					}
				}	
			}else if(user == 2) {
				System.out.println("플레이어 :"+win+"승 "+lose+"패");
				System.out.println("컴퓨터 :"+lose+"승 "+win+"패");
			}else if(user == 3) {
				System.out.println("게임을 종료합니다");
				break;
			}else {
				System.out.println("다시입력");
			}
		}
	}

}