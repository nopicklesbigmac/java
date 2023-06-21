package basic;

public class MainClass {
//접근제어자 예약어 변환자료형 함수이름(매개 변수0개 이상)
	public static void main(String[] args) {
		test1();
		
		
		MainClass mc = new MainClass();
		mc.test2();
		
		SubClass sc = new SubClass();
		sc.insert();
		sc.select();
		sc.select();		
		sc.delete();
		
	}

	public static void test1() {
		System.out.println("MainClass 내 test1 Method");
		
	}
	public void test2() {
		System.out.println("MainClass 내 test2 Method");
		
	}
}
