package arrays;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
			int m, d;
			Scanner sc = new Scanner(System.in);
			int s[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
			String [] w = {"토요일","일요일","월요일","화요일","수요일","목요일","금요일" };
			int tmp = 0;
			while(true) {
				System.out.print("입력 : ");
				m = sc.nextInt();
				d = sc.nextInt();
		        if (m <= 12||m>0 && d <= s[m-1]||d>0 ) {
		        	for( int i = 0; i < m-1; i++ ){
			            tmp += s[i];
			        }
			        tmp += (d-1);
			        break;
		        }else {
		        	continue;
		        }
			}
			System.out.print(m+"월 "+d+"일은 "+w[tmp % 7]);
	    }
	}