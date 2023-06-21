package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("이름입력 : ");
		String name1 = sc.nextLine();
		
		System.out.println("이름입력 : ");
		String name2 = sc.next();
		// next는 뛰어쓰기 저장x , nextLine은 뛰어쓰기 저장o
		System.out.println("이름입력 : ");
		String name3 = sc.nextLine();
		
		System.out.println("이름 : "+ name1);
		System.out.println("이름 : "+ name2);
		System.out.println("이름 : "+ name3);

}

}
