package condition;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점 입력 : ");
		char grade = sc.next().charAt(0);
		
		if(grade == 'A'||grade == 'B' )
			System.out.println("참 잘했어요.");
		else if(grade == 'C'||grade == 'D')
			System.out.println("분발합시다.");
		
		System.out.print("년도 입력 : ");
		int data = sc.nextInt();

		if(data%4==0)
			System.out.println("윤년.");
		else if(data % 100 == 0)
			System.out.println("평년");
		else if(data % 400 == 0)
			System.out.println("윤년");
		}
	} 

