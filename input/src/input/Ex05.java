package input;

import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(A~Z)입력 :");
		String tmp = sc.next(); // 문자열입력
		char data = tmp.charAt(0);
		System.out.println("등급 :" + data);
		

		System.out.print("등급(A~Z)입력 :");
		char data2 = (char)System.in.read();
		System.out.println("등급:"+ data2);
	}
}
