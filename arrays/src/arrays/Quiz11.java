package arrays;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		System.out.println("=== 아파트 입주자 정보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("건물의 층수를 입력하세요 : ");
		int a = sc.nextInt();
		String[][] apt = new String[a][];
		for (int i=0;i<a;i++) {
			System.out.print((i+1) + "층의 총 호실 입력 : ");
			int ho = sc.nextInt();
			apt[i] = new String[ho];
		}
		for(int i=0;i<a;i++) {
			System.out.println((i+1) + "층의 정보를 입력하세요");
			for (int j=0;j<apt[i].length;j++) {
				System.out.println((i+1) + "층" + (j+1) + "호실 : ");
				apt[i][j] = sc.next();
			}
		}
		System.out.println("===입주자 정보===");
		for (int i=0;i<a;i++) {
			for (int j=0;j<apt[i].length;j++) {
				System.out.println((i+1) + "층" + (j+1) );
				System.out.println("호실 입주자 : "+ apt[i][j]);
			}
		}
	}

}
