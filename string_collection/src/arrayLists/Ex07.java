package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		String addNum, printNum;
		
		System.out.print("만들 공간의 개수 입력 : ");
		Integer num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("데이터 입력 : ");
			addNum = input.next();
			arr.add(addNum);
		}
		
		System.out.println("--- 저장된 값 출력!! ---");
		for(int i = 0; i < arr.size(); i++) {
			printNum = arr.get(i);
			System.out.println(printNum);
		}
	}
}