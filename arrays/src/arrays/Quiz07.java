package arrays;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age[] = new int[5],i,j,tmp, a;
		String name[] = new String[5],tmp2, n;
		for (i=0;i<5;i++) {
			System.out.println(i+1+ "번째 정보 입력");
			System.out.print("이름 : \t");
			n = s.next();
			System.out.print("나이 : \t");
			a = s.nextInt();
			name[i] = n;
			age[i] = a;
		}
		for (i=0;i<5;i++) {
			for (j=i+1;j<5;j++) {
				if (age[i]>age[j]) {
					tmp = age[i];
					age[i] = age[j];
					age[j] = tmp;
					tmp2 = name[i];
					name[i] = name[j];
					name[j] = tmp2;
				}
			}
			
		}
		for (i=0;i<5;i++) {
			System.out.println(i+1+ "정보");
			System.out.print("이름 : " + name[i] + " ,");
			System.out.print("나이 : " + age[i] + "세");
		}
	}
}

