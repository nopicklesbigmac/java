package condition;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
		String str = null;
		System.out.print("안녕하세요 or 그래");
		str = input.next();
		switch(str) {
		case "안녕하세요":System.out.println(str+" : 선택"); break;
		case "그래": System.out.println(str+" : 선택"); break;
		default: System.out.println("입력한 데이터 :" + str);
		}
		}
		}