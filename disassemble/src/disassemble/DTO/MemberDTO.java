package disassemble.DTO;

public class MemberDTO implements IMemberDTO{
/*
 * db 
 SQL> CREATE TABLE disassemble(
  2  num number,
  3  email varchar2(20),
  4  password varchar2(20),
  5  name varchar2(20),
  6  registerDate varchar2(100)
  7  );

Table created.

SQL> CREATE SEQUENCE disassemble_seq INCREMENT BY 1 START WITH 1;

Sequence created.

SQL> commit;

Commit complete.
 */
	private long num;
	private String email,password,name,registerDate;

	 public MemberDTO(String email, String password, String name, String registerDate) {
	        super();
	        this.email = email;
	        this.password = password;
	        this.name = name;
	        this.registerDate = registerDate;
	    }
	 public MemberDTO(long num, String email, String password, String name, String registerDate) {
	        super();
	        this.num = num;
	        this.email = email;
	        this.password = password;
	        this.name = name;
	        this.registerDate = registerDate;
	    }
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
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
}