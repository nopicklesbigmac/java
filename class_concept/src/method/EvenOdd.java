package method;

public class EvenOdd {
	private int data;
	/*
	 * 생성자 이름 : 클래스 이름과 동일하게 구성 
	 * 메소드와 다른점 : 반환 자료형이 없다. 반환 데이터가 많다.
	 * 생성자의 호출은 클래스를 인스턴스로 생성되면서 호출
	 * 기본생성자 : 생성자를 명시하면 자동으로 만들지 않음.
	 * 생성자를 명시하지 않으면 기본 생성자가 자동으로 만들어짐
	 * 
	 */
	public EvenOdd() {
		//기본 생성자.
	}
	//setter
	public void setData(int data) {
		this.data = data;
	}
	
	//getter
	public int getData() {
		return data;
	}
	
	public boolean result() {
		if (data%2==0)
			//짝수
			return true;//반환 값은 한개, 여러개x
		else
			//홀수
			return false;//return 데이터; 데이터는 같은 자료형으로 구성.
	}
}
