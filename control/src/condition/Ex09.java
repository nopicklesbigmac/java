package condition;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int data;
		System.out.print("정수 입력 : ");
		data = sc.nextInt();
		String result = "";
		
		if(data > 0) {
			if(data % 2 ==0) {
				result= data +" 는/은 양수이고 짝수이다.";
			} else {
				result= data +" 는/은 양수이고 홀수이다.";
			}
		}
		else if(data < 0) {
			if(data % 2 ==0) {
				result= data +" 는/은 음수이고 짝수이다.";
			} else {
				result= data +" 는/은 음수이고 홀수이다.";
			}
		}
		else {
			result = "입력 데이터는 0입니다.";
		}

		System.out.println(result);
	}
}
	
