package jdbc_concept01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAll {
	public static void main(String[] args) {
		 try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      } catch (ClassNotFoundException e) {
	         System.out.println("드라이버 로드 실패");
	      }
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
	    String sql = "SELECT * FROM test_table";
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    
	    try {
	       con = DriverManager.getConnection(url , user, password);
	       ps = con.prepareStatement(sql);
	       rs = ps.executeQuery();
		   System.out.println("회원번호\t아이디\t비밀번호\t이름");
	       while(rs.next()) {
	    	   int n = rs.getInt("num");
	    	   String i = rs.getString("id");
	    	   String p = rs.getString("password");
	    	   String nm = rs.getString("name");
	    	   System.out.println(n+"\t"+i+"\t"+p+"\t"+nm);
	       }
	    } catch (SQLException e) {
	       System.out.println("데이터 베이스 연결 실패");  
	    } finally {
			try {
				if(rs !=null)
					rs.close();
				if(ps !=null)
					ps.close();
				if(con !=null)
					con.close();
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
