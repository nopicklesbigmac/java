package loop;

import java.util.Random;
import java.util.Scanner;

public class sw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int user=0, win=0, lose=0, money=10000, b;
		int dice=0 ,dice1=0, dice2=0,dice3=0,com1=0, com2=0,com3=0,com=0;
		char re;
		
		
		while(true) {
			System.out.println("1. game start");
			System.out.println("2. game score");
			System.out.println("3. game exit");
			System.out.print(">>> ");
			user = sc.nextInt();
			switch(user) {
				case 1: 
					while(true) {
						if (money > 0) {
							dice1 = r.nextInt(6)+1;
							dice2 = r.nextInt(6)+1;
							dice3 = r.nextInt(6)+1;
							dice = dice1 + dice2 + dice3;
							System.out.println("<< 게임을 시작하겠습니다.>>");
							System.out.println("<< 배팅금액 "+money+">>");
							System.out.println("<< 주사위 돌리겠습니다. >>");
							System.out.println("첫번쨰 주사위 : "+dice1);
							System.out.println("두번쨰 주사위 : "+dice2);
							System.out.println("세번쨰 주사위 : "+dice3);
							System.out.println("총 주사위 합 : "+dice);
							while(true) {
								System.out.println("배팅금액을 정해주세요: ");
								b = sc.nextInt();
								com1 = r.nextInt(6)+1;
								com2 = r.nextInt(6)+1;
								com3 = r.nextInt(6)+1;
								System.out.println("com 주사위");
								System.out.println("첫번쨰 주사위 : "+com1);
								System.out.println("두번쨰 주사위 : "+com2);
								System.out.println("세번쨰 주사위 : "+com3);
								System.out.println("총 주사위 합 : "+com);
								if (dice > com&&b>0) {
									System.out.println("플레이어 승 ");
									money = b + money;
									win++;
									System.out.println(b +" 얻음 ");
									break;
								}else if (dice < com&&b>0) {
									System.out.println("com 승");
									money = money - b;
									lose++;
									System.out.println(b +" 잃음 ");
									break;
								}else if (dice== com&&b>0) {
									System.out.println("무 승부");
									break;
								}else {
									System.out.println("배팅금액을 다시 설정해주세요");
									continue;
								}
							}
						}else if (money < 0) {
							System.out.println("돈없음");
							break;
						}
					}
				case 2:
					System.out.println(win+lose+"전"+win+"승 "+lose+"패입니다.");
					continue;
				case 3: System.out.println("프로그램 종료 합니다.");
						System.exit(0);
				
				default : 
					System.out.println("메뉴를 확인 후 다시 입력하세요.");
					continue;
				
			}
		}
	}
}
