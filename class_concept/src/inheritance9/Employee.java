package inheritance9;
// 추상클래스 : 추상멧드를 갖고 있는 클레스
public abstract class Employee {
	private String name;
	public Employee(String name) {
		this.name = name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	// 추상메소드 : 메소드 내용이 없는 상태 ,
	// 자식에서강제로 구현이 되도록 만든는 효과ㅣ를 갖음;
	public abstract int getSalary() ;
}
