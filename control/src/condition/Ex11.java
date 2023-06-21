package condition;

import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자 입력 : ");
		int select = System.in.read();
		
		switch(select) {
		case 'a': System.out.println("a입력");break;
		case 'A': System.out.println("A입력");break;
		default: System.out.println("a가 아닌 다른 값 입력");
		}
		}
		}