package jdbc_concept01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ConectionTest {

	public static void main(String[] args) {
		   /*
	       * JDBC(Java DataBase Connectivity)
	       * : 자바 프로그램에서 데이터베이스에 연결을 도와주는 기능의 집합
	       * 
	       * 작업순서 
	       * 1. JDBC Driver 실행
	       * 2. Database로 연결
	       * 3. SQL 쿼리문을 담아 전달하기 위한 객체(PreparedStatement) 생성
	       * 4. 쿼리문을 담은 객체 내 메소드를 호출하여 Database로 전달,
	       * 5. SELECT 쿼리문을 전달했다면 결과각 존재하기에 객체(ResultSet)로 받음.
	       * 6. 위에서 열어둔 객체 해제.
	       * 
	       */
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      } catch (Exception e) {
	         System.out.println("드라이버 로드 실패");
	      }
	      /*
	       * 컴퓨터의 주소 : IP 주소(컴퓨터를 식별하는 용도)
	       * 비유 : 서을특별시 동작구 노량진동 아이비빌딩
	       */
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      String user = "oracle";
	      String password = "oracle";
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("검색할 계정 아이디: ");
	      String id = sc.next();
	      
	      String sql = "SELECT num,id,password FROM test_table WHERE id=?";
	      
	      Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      try {
	         con = DriverManager.getConnection(url , user, password);
	         ps = con.prepareStatement(sql);
	         ps.setString(1, id);
	         rs = ps.executeQuery(); // DB로 쿼리문 전달
	         if (rs.next()) {
	        	 System.out.println("회원번호\t아이디\t비밀번호");
	        	 System.out.println(rs.getInt("num")+"\t"+rs.getString("id")+"\t"+rs.getString("password"));
	        	 
	         }else {
	        	 System.out.println(id + ",없는 계정");
	        	 
	         }
	         
	      } catch (Exception e) {
	         System.out.println("데이터 베이스 연결 실패");
	         
	      }
	      
	   }

	}