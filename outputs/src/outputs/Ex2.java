package outputs;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("출력후 끝에 중바꿈이 적용됨.");
		System.out.print("출력후 끝에 줄바꿈 없음");
		System.out.printf("f의 약자는 format.( 서식,형식 )");
		System.out.print("출력후 줄바 꿈을 위해서 \n을 배치하면 줄바꿈 적용됨.");
		
		
		System.out.printf("\n%d", 10);
		System.out.printf("\n%f", 10.123);
		System.out.printf("\n%05d", 10);
		System.out.printf("\n%.1f", 10.123);
	}

}
