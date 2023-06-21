package loop;

public class Ex08 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i = 2; i <= 9; i++) {
			System.out.println("\n"+i+"단");	
			for(j = 1; j <= 9; j++)
				System.out.println(i+" X "+j+" = "+(i * j));
		} 
	}

}
//디버깅
//* 버그를 잡기 위해서 동작.
//* 코드 흐름 파악
//* 
//* BreakPoint 설정/해제 : Ctrl + Shift + B
//* 디버그 모드 시작 : F11
//* 한 줄 실행 : F6
//* 디버깅 종료 : Ctrl + F2
//* 이클립스 오른쪽 위 perspective를 java로 변경