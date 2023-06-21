package string_collection;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		String data = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		System.out.println("str1 : " + data);
		String[] strs = data.split("-");
		String num;
		int total = 0;
		for (int i=0; i<strs.length; i++) {
			num = "";
			for (int j = 0; j<strs[i].length(); j++) {
				if (Character.isDigit(strs[i].charAt(j))){
					num += strs[i].charAt(j);
				}
			}total += Integer.parseInt(num);
		}
		System.out.println("sum : " + total + "\n");
		
		
		String data3 = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		int total2 = 0;
		String[] split = data3.split("-");

		for (int i = 0; i < split.length; i++) {
			split[i] = split[i].replaceAll("[^0-9]", "");
		}

//		for (int i = 0; i < split.length; i++) {
//			int tmp = Integer.parseInt(split[i]);
//			total += tmp;
//		}
		
//		향상 for문
		for(String s : split) {
			total2 += Integer.parseInt(s);
		}
		
		System.out.println("합계 : " + total2);
		
		/*
		 * OX가 주어졌을 때, 점수를 구하는 프로그램 작성하시오. 
		 * OOXXOXXOOO의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * 입력 : OOXXOXXOOO 
		 * 결과 : 10 
		 * 입력 : OOXXOOXXOO 
		 * 결과 : 9 
		 * 입력 : OOOOXOOOOXOOOOX 
		 * 결과 : 30
		 */
		/*
		 * OX가 주어졌을 때, 점수를 구하는 프로그램 작성하시오. 
		 * OOXXOXXOOO의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * 입력 : OOXXOXXOOO 
		 * 결과 : 10 
		 * 입력 : OOXXOOXXOO 
		 * 결과 : 9 
		 * 입력 : OOOOXOOOOXOOOOX 
		 * 결과 : 30
		 */

		Scanner input = new Scanner(System.in);
		int result = 0, score = 1;
		
		System.out.print("입력: ");
		data = input.next();
		data = data.toUpperCase();
		
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'O')
				result += score++;
			else if (data.charAt(i) == 'X')
				score = 1;
		}
		
		System.out.println("결과: " + result);

	}
}
