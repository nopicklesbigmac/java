package inheritance5;

import javax.sound.midi.MidiDevice.Info;

public class Main {
	public static void main(String[] args) {
		
		
		Child1 c1 = new Child1();
		c1.method01();// 부모의 맴버 메소드
		c1.method02();// 부모 - 자식  맴버 메소드. 자식에서 오버레이드
		c1.method03();// 자식의 맴버 메소드 
		
		System.out.println();
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		// 부모의 기능 :자식 인스턴스의 참조 값을 저장 할수 있음.
		
		System.out.println();
		
		Parent parent = c1; //  업 캐스팅 
		parent.method01();
		parent.method02();
		
		System.out.println();
		Child1 c11 = (Child1)parent; // 다운 캐스팅 
		c11.method01();
		c11.method02();
		c11.method03();
		
		System.out.println();
		Child2 c2 = new Child2();
		c2.method01();
		c2.method02();
		c2.method03();
	
		
		info1(c1);
		info2(c2);
	
	}
	
	private static void info(Parent p) {
		System.out.println(" p ");
		p.method01();
		p.method02();
		
		/*p1.method03();// 자식메소드
		 * 부모에 없는 맴버이기에 사용x
		 * 해결책 
		 *  - 자식이 자료형으로 다운캐스팅을 함.
		 * 	- 부모 클레스에 동일한 이름의 맴버를 구현
		 */
		if (p instanceof Child1) {
			Child1 c= (Child1)p;
			c.method03();
		}else if(p instanceof Child2)  {
			Child2 c= (Child2)p;
			c.method03();
		}
		
		
	}
	private static void info1(Child1 c1) {
		System.out.println("1");
		c1.method01();
		c1.method02();
		c1.method03();
	}
	
	private static void info2(Child2 c2) {
		System.out.println("2");
		c2.method01();
		c2.method02();
		c2.method03();
	}
}
