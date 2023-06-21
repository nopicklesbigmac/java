package condition;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int data;
		System.out.print("수 입력 : ");
		data = sc.nextInt();
		String result = "";
		
		if(data % 2 == 0) {
			if(data % 3 ==0) {
				result= data +" 는/은 짝수이고 3의 배수이다.";
			} else {
				result= data +" 는/은 짝수이고 3의 배수는 아니다.";
			}
		}
		else  {
			if(data % 3 ==0) {
				result= data +" 는/은 홀수이고 3의 배수이다.";
			} else {
				result= data +" 는/은 홀수이고 3의 배수는 아니다.";
			}
		}
		System.out.println(result);
	}
}