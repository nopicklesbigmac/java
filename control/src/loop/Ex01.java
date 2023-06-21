package loop;

public class Ex01 {

	public static void main(String[] args) {
		int j;
		for(j = 0; j < 10; j++){
			System.out.print(j + " ");
		}
		System.out.println("for문 끝나고 나서 j변수의 데이터 : " + j);
		int i;
		
		for(i = 0; i <= 5; i++){
			System.out.print(i + " ");
		}
		
		System.out.println("for문 끝나고 나서 i변수의 데이터 : " + i);
		
		
		for(i = 6; i > 0; --i){
			System.out.print(i + " ");
		}
		
		System.out.println("for문 끝나고 나서 i변수의 데이터 : " + i);
		
	}
}