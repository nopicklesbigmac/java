package basic;

public class SubClass {
	private String connect;// 맴버 변수, 맴버 필드 
	
	
	//생성자
	public SubClass() {
		System.out.println("데이터 저장소에 연결합니다.");
		connect = "연결 정보";
	}
	public void insert() {
		System.out.println(connect);
		System.out.println("데이터를 저장합니다.");
		
	}
	public void select() {
		System.out.println(connect);
		System.out.println("데이터를 조회합니다.");
		
	}
	public void delete() {
		System.out.println(connect);
		System.out.println("데이터를 삭제합니다.");
		
	}
}
