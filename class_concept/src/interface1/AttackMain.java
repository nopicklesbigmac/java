package interface1;

public class AttackMain {

	public static void main(String[] args) {
//		AttackImp1 ai01 = new AttackImp1();
//		ai01.attack();
//		ai01.defense();
//		
//		
//		AttackImp2 ai02 = new AttackImp2();
//		ai02.attack();
//		ai02.defense();
		
		
		/*
		 * 인터페이스 
		 *  - 여러 사람과 작업하는상황에서 메소드 정의
		 *  - 다형성(업캐스팅), 코드의 결합도를 낮출 수 있는 방법.
		 *  - 
		 */
		AttackImp2 att = new AttackImp2();
		att.attack();
		att.defense();
		
		
	}

}
