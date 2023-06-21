package disassemble.DTO;

public class MemberDTO implements IMemberDTO{
	private String email,password,name,registerDate;
	 public MemberDTO( String email, String password, String name,String registerDate) {
	        super();
	        this.email = email;
	        this.password = password;
	        this.name = name;
	        this.registerDate = registerDate;
	    }
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getRegisterDate() {
		return registerDate;
	}
	@Override
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	public void cPassword(String np) {
	       this.password = np;
	    }
}
