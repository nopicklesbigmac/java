package jdbc_concept03.me;


import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberService {
	private static MemberDAO memberdao;
	public MemberService() {
		memberdao = new MemberDAO();
	}
	public void selectAll(){
		ResultSet m = memberdao.selectAll();
		 try {
			 System.out.println("회원번호\t이메일\t이름\t비번");
			   while (m.next()) {
		    	   int n = m.getInt("num");
		    	   String i = m.getString("email");
		    	   String p = m.getString("name");
		    	   String nm = m.getString("password");
		    	   System.out.println(n+"\t"+i+"\t"+p+"\t"+nm);
			   }
			} catch(SQLException e) {
				e.printStackTrace();
			}
	}
	public void selectEmail(String email) {
		ResultSet m = memberdao.selectEmail(email);
		try {
		 System.out.println("회원번호\t이메일\t이름\t비번");
		   if (m.next()) {
	    	   int n = m.getInt("num");
	    	   String i = m.getString("email");
	    	   String p = m.getString("name");
	    	   String nm = m.getString("password");
	    	   System.out.println(n+"\t"+i+"\t"+p+"\t"+nm);
		   }else {
			   System.out.println("없는 이메일입니다.");
		   }
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void insert(String email,String name,String password) {

		 ResultSet s = memberdao.selectEmail(email);
			try {
				   if (s.next()) {
					   System.out.println("있는 이메일입니다.");
				   }else {
					   int m = memberdao.insert(email, name, password);
		    			 if (m==0) {
		    					System.out.println("추가실패");  
		    		        }else {
		    					System.out.println("추가성공");  
		    		        }
				   }
				} catch(SQLException e) {
					e.printStackTrace();
				}
	}
	public void update(String email,String password,String changePassword) {
		ResultSet s = memberdao.selectEmail(email);
		try {
			   if (s.next()) {
		    	   String p = s.getString("password");
		    	   if(p.equals(password)) {
		    		   int m = memberdao.update(email,changePassword);
		    			if (m==0) {
		    				System.out.println("수정실패");  
		    	        }else {
		    				System.out.println("수정성공");  
		    	        }
		    	   }else {
					   System.out.println("기존 비밀번호 틀림");
		    	   }
			   }else {
				   System.out.println("없는 이메일입니다.");
			   }
			} catch(SQLException e) {
				e.printStackTrace();
			}
	}
	public void delete(String email,String password) {
		ResultSet s = memberdao.selectEmail(email);
		try {
			   if (s.next()) {
		    	   String p = s.getString("password");
		    	   if(p.equals(password)) {
		    		   int m = memberdao.delete(email);
		    			if (m==0) {
		    				System.out.println("삭제실패");  
		    	        }else {
		    				System.out.println("삭제성공");  
		    	        }
		    	   }else {
					   System.out.println("기존 비밀번호 틀림");
		    	   }
			   }else {
				   System.out.println("없는 이메일입니다.");
			   }
			} catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
