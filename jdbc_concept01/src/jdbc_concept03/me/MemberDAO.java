package jdbc_concept03.me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	public static Connection con = null;
	public static ResultSet rs = null;
	public static PreparedStatement ps = null;
	public static int c;
	
	public MemberDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String pw = "oracle";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}
		
		try {
			 con = DriverManager.getConnection(url , user, pw);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet selectAll() {
		 String sql = "SELECT * FROM concept03";
		 PreparedStatement ps = null;
		 ResultSet rs = null;
			try {
			       ps = con.prepareStatement(sql);
			       rs = ps.executeQuery();
			    } catch (SQLException e) {
			       System.out.println("데이터 베이스 연결 실패");  
			    } finally {
					close();
				}
			return rs;
	}
	public ResultSet selectEmail(String email){
		String sql = "SELECT * FROM concept03 where email=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
		       ps = con.prepareStatement(sql);
		       ps.setString(1, email);
		       rs = ps.executeQuery();
		    } catch (SQLException e) {
		       System.out.println("데이터 베이스 연결 실패");  
		    } finally {
				close();
			}
		return rs;
	}
	public int insert(String email,String name,String password){
		String sql = "insert into concept03 values(concept03_seq.nextval,?,?,?)";
		PreparedStatement ps = null;
		 try {
			 ps = con.prepareStatement(sql);
			 ps.setString(1, email);
			 ps.setString(2, name);
			 ps.setString(3, password);
			 c = ps.executeUpdate();
		 } catch (SQLException e) {
			 System.out.println("데이터 베이스 연결 실패");  
		 } finally {
			 close();
			}
		return c;
	}

	public int update(String email,String changePassword){
		String sql = "UPDATE concept03 SET password = ? WHERE email = ? ";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
		    ps.setString(1, changePassword);
		    ps.setString(2, email);
		    c = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return c;
	}
	public int delete(String email){
		 String sql = "DELETE FROM concept03 WHERE email=?";
		 PreparedStatement ps = null;
			try {
			    ps = con.prepareStatement(sql);
		        ps.setString(1, email);
		        c= ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
			return c;
	}
	public void close() {
		try {
			if(ps !=null)ps.close();
		} catch(SQLException e) {
			e.printStackTrace();
	}
	}
}

