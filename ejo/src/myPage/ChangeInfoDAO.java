package myPage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.CommonService;
import login.LoginDAO;
import main.Controller;
import reg.RegDAO;
import reg.RegDTO;

public class ChangeInfoDAO extends LoginDAO{
	
	private Connection con;
	private PreparedStatement ps;
	private Controller controller;
	
	
	public void insert(ChangeInfoDTO cInfo) {
	      //INSERT INTO fx_concept VALUES(이름, 아이디, 비번, 이메일, 전화번호, 비밀번호 질문, 비밀번호 답, 가입일);
	      // 간단하게 이름 아이디 비번 이메일 전화번호 5개만
		  String sql = "UPDATE USERINFO SET	NAME = ?,PW = ?, EMAIL = ?, PHONE = ? WHERE ID = ? ";
	      con = getCon();
	      PreparedStatement ps = null;
	      Controller controller=new Controller();
	      
	      try {
	         ps = con.prepareStatement(sql);
	         ps.setString(1, cInfo.getChangeName());
	         ps.setString(2, cInfo.getChangePw());
	         ps.setString(3, cInfo.getChangeEmail());
	         ps.setString(4, cInfo.getChangePhone());
	         ps.setString(5, controller.getLoginId());
	         ps.executeUpdate();
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(ps != null) ps.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	}
	
	public String getPw(String id) {
		 	String sql = "SELECT * FROM USERINFO WHERE id = ?";
		 	PreparedStatement ps= null;
			ResultSet rs= null;
			Controller controller=new Controller();
			id=controller.getLoginId();
			con = getCon();
			String pw = null;
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1,id);
				rs = ps.executeQuery();
				if(rs.next()) {
					pw = rs.getString("pw");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs != null) rs.close();
					if(ps != null) ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return pw;
		}
		
}
