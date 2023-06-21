package jdbc_concept01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataDelete {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
	    Connection con = null;
	    PreparedStatement ps = null;
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("아이디: ");String id = sc.next();
	    
	    String sql = "DELETE FROM test_table WHERE id=?";
		try {
			con = DriverManager.getConnection(url , user, password);
		    ps = con.prepareStatement(sql);
	        ps.setString(1, id);
	        
	        int rc = ps.executeUpdate();
	        if (rc==0) {
				System.out.println("삭제실패");  
	        }else {
				System.out.println("삭제성공");  
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps !=null)ps.close();
				if(con !=null)con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}