package exceptions;

import java.util.Scanner;

class Auth{
	public void start() {
		System.out.println("======= 프로그램 시작 =========");
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		try {
			age = Integer.parseInt(sc.next());
			check(age);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		} catch (LengthException e) {
			System.out.println("여섯 자리의 년월일을 입력하세요");
		}
	}

	private void check(int age) {
		String tmp = age + "";
		if(tmp.length() == 6) {
			if(tmp.charAt(0) < '9' && tmp.charAt(0) >= '0')
				System.out.println("90년생 미만입니다.");
			else
				System.out.println("90년생 이상입니다.");
		}else {
			throw new LengthException();
		}
	}
}
public class AuthMain {
	public static void main(String[] args) {
		Auth auth = new Auth();
		auth.start();
	}

}
