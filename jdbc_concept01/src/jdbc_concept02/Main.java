package jdbc_concept02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String user = "oracle";
	public static String password = "oracle";
	public static Connection con = null;
	public static PreparedStatement ps = null;
	public static ResultSet rs = null;
	
	public static void insert(String email,String name,String mobile) {
		String sql = "insert into concept02 values(concept02_seq.nextval,?,?,?)";
		 try {
			 con = DriverManager.getConnection(url , user, password);
			 ps = con.prepareStatement(sql);
			 ps.setString(1, email);
			 ps.setString(2, name);
			 ps.setString(3, mobile);
			 int rowCount = ps.executeUpdate();//insert,update, delete
		        if (rowCount==0) {
					System.out.println("추가실패");  
		        }else {
					System.out.println("추가성공");  
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
			return;
	}
	public static void selectEmail(String email) {
		 String sql = "SELECT * FROM concept02 where email=?";
			try {
			       con = DriverManager.getConnection(url , user, password);
			       ps = con.prepareStatement(sql);
			       ps.setString(1, email);
			       rs = ps.executeQuery();
				   System.out.println("회원번호\t아이디\t비밀번호\t이름");
				   if (rs.next()) {
			    	   int n = rs.getInt("num");
			    	   String i = rs.getString("email");
			    	   String p = rs.getString("name");
			    	   String nm = rs.getString("mobile");
			    	   System.out.println(n+"\t"+i+"\t"+p+"\t"+nm);
				   }else {
					   System.out.println("없는 이메일입니다.");
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
	public static void selectAll() {
	    String sql = "SELECT * FROM concept02";
		try {
		       con = DriverManager.getConnection(url , user, password);
		       ps = con.prepareStatement(sql);
		       rs = ps.executeQuery();
			   System.out.println("회원번호\t이메일\t이름\t번호");
		       while(rs.next()) {
		    	   int n = rs.getInt("num");
		    	   String i = rs.getString("email");
		    	   String p = rs.getString("name");
		    	   String nm = rs.getString("mobile");
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
			}return;
	}
	public static void delete(String email) {
		 String sql = "DELETE FROM concept02 WHERE email=?";
			try {
				con = DriverManager.getConnection(url , user, password);
			    ps = con.prepareStatement(sql);
		        ps.setString(1, email);
		        
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
			}return;
	}
	public static void update(String email,String name,String mobile) {
	    String sql = "UPDATE concept02 SET name = ? ,mobile = ? WHERE email = ? ";
		try {
			con = DriverManager.getConnection(url , user, password);
		    ps = con.prepareStatement(sql);
	        ps.setString(3, email);
	        ps.setString(1, name);
	        ps.setString(2, mobile);
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
	/*
	 * concept02 테이블 생성
	 *  - 회원번호, 이메일, 이름, 전화번호 
	 * concept02_seq sequence 생성하여 회원번호로 활용
	 */
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}
		Scanner sc = new Scanner(System.in);
		String email = "", name="", mobile="";
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(sc.next());

			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = sc.next();
				System.out.print("이름 : ");	name = sc.next();
				System.out.print("전화번호 : "); mobile = sc.next();
				insert(email, name, mobile);
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = sc.next();
				selectEmail(email);
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = sc.next();
				delete(email);
				break;

			case 4:	selectAll(); break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = sc.next();
				System.out.print("이름 : ");	name = sc.next();
				System.out.print("전화번호 : "); mobile = sc.next();
				update(email, name, mobile);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}

	}

}

