package jdbc_concept01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataInsert {

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
	    String sql = "insert into test_table values(num_seq.nextval,?,?,?)";
	    
	    
		try {
			con = DriverManager.getConnection(url , user, password);
		    ps = con.prepareStatement(sql);
	        ps.setString(1, id);
	        ps.setString(2, pw);
	        ps.setString(3, name);
	        ps.executeQuery();//insert,update, delete
	        
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결 실패");  
		} finally {
			try {
				if(ps !=null)ps.close();
				if(con !=null)con.close();
				sc.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
