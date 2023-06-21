package trainning02;

import java.util.ArrayList;

public class MemberDTO {
	private String email,name,mobile;
	
	public MemberDTO(String email, String name, String mobile) {
		this.email = email;
		this.name = name;
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
}
