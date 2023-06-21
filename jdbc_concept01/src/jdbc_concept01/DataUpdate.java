package jdbc_concept01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataUpdate {

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
	    System.out.print("비밀번호: ");String pw = sc.next();
	    System.out.print("이름: ");String name = sc.next();
	    String sql = "UPDATE test_table SET password = ? ,name = ? WHERE id = ? ";
	  
	    
		try {
			con = DriverManager.getConnection(url , user, password);
		    ps = con.prepareStatement(sql);
	        ps.setString(1, pw);
	        ps.setString(2, name);
	        ps.setString(3, id);
	        int rowCount = ps.executeUpdate();//insert,update, delete
	        if (rowCount==0) {
				System.out.println("수정실패");  
	        }else {
				System.out.println("수정성공");  
	        }
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결 실패");  
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