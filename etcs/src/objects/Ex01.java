package objects;

import java.util.ArrayList;

class AA extends Object{
	
}

public class Ex01 {
	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println("AA참조변수에 담긴 참조값의 클래스는 "+aa.getClass()+"로 생성되었습니다.");
		ArrayList list = new ArrayList();
		System.out.println("list참조변수에 담긴 참조값의 클래스는 "+list.getClass()+"로 생성되었습니다.");
		
		list.add(10);
		list.add(1.1);
		list.add("String");
		
		Object data1 = 10;
		Object data2 = 1.1;
		Object data3 = "String";
	}

}
