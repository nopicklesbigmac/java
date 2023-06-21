package trainning03;
// 이메일, 이름, 전화번호
// 위 3개의 데이터를 저장할 멤버 변수(필드)는 필수
// setter, getter, constructor는 필요에 따라 구현
public class MemberDTO {
	private String email;
	private String name;
	private String mobile;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
