package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int user=0, win=0, lose=0, money=10000, b;
		int dice=0 ,dice1=0, dice2=0,dice3=0,com1=0, com2=0,com3=0,com=0;
		char re;
		while(true) {
			System.out.println("== dice ==");
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
			if(user == 1) {
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
							com = com1 + com2 + com3;
							System.out.println("com 주사위");
							System.out.println("첫번쨰 주사위 : "+com1);
							System.out.println("두번쨰 주사위 : "+com2);
							System.out.println("세번쨰 주사위 : "+com3);
							System.out.println("총 주사위 합 : "+com);
							if (dice > com&&b>=0&&money>b) {
								System.out.println("플레이어 승 ");
								money = b + money;
								win++;
								System.out.println(b +" 얻음 ");
								break;
							}else if (dice < com&&b>=0&&money>b) {
								System.out.println("com 승");
								money = money - b;
								lose++;
								System.out.println(b +" 잃음 ");
								break;
							}else if (dice== com&&b>=0&&money>b) {
								System.out.println("무 승부");
								break;
							}else {
								System.out.println("배팅금액을 다시 설정해주세요");
								continue;
							}
						}
					}else if (money < 0) {
						System.out.println("돈이 없으신데용  ㅋㅋ ");
						break;
					}
					re = sc.next().charAt(0);
					System.out.println("게임을 다시 시작 하시겠습니까 ?(y/n)");
					if (money>0) {
						if (re =='y') {
							System.out.println("게임을 다시시작합니다.");
							continue;
						}else if (re =='n' ) {
							System.out.println("게임을 종료합니다.");
							break;
						}else {
							System.out.println("잘못 입력햇습니다 ");
						}
					}else {
						System.out.println("돈을 모두잃으셨습니다");
						break;
					}
				}	
			}else if(user == 2) {
				System.out.println(win+lose+"전"+win+"승 "+lose+"패입니다.");
			}else if(user == 3) {
				System.out.println("게임을 종료합니다");
				break;
			}else {
				System.out.println("다시입력");
			}
		}
	}

}