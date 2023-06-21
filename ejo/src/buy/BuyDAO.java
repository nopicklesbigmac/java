package buy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import event.EventDTO;
import reg.RegDTO;

public class BuyDAO {
	
	private Connection con;
	private PreparedStatement ps;
	public Connection getCon() {
		return con;
	}
	
	public BuyDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String pw = "oracle";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<BuyDTO> selectPurchaseUser(String id) {
		ArrayList<BuyDTO> purchase = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from purchase where buyuserid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO buy = new BuyDTO();
				buy.setGoodsUrl(rs.getString("goodsurl"));
				buy.setBrand(rs.getString("brand"));
				buy.setCategory(rs.getString("category"));
				buy.setGoodsName(rs.getString("goodsname"));
				buy.setPrice(rs.getString("price"));
				buy.setBuyDate(rs.getString("buydate"));
				purchase.add(buy);
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
		return purchase;
	}
	
	public ArrayList<BuyDTO> selectSellUser(String id) {
		ArrayList<BuyDTO> purchase = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from purchase where selluserid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO buy = new BuyDTO();
				buy.setGoodsUrl(rs.getString("goodsurl"));
				buy.setBrand(rs.getString("brand"));
				buy.setCategory(rs.getString("category"));
				buy.setGoodsName(rs.getString("goodsname"));
				buy.setPrice(rs.getString("price"));
				buy.setBuyDate(rs.getString("buydate"));
				purchase.add(buy);
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
		return purchase;
	}
	
	public String countBuyColumn(String id) {
		ArrayList<BuyDTO> purchase = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select * from purchase where buyuserid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				count++;
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
		} return Integer.toString(count);
	}
	public String countSellColumn(String id) {
		ArrayList<BuyDTO> purchase = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select * from purchase where selluserid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				count++;
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
		} return Integer.toString(count);
	}
	
	
	public void insertSellUser(BuyDTO dto) {
	      //INSERT INTO fx_concept VALUES(이름, 아이디, 비번, 이메일, 전화번호, 비밀번호 질문, 비밀번호 답, 가입일);
	      String sql = "INSERT INTO purchase VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	      Connection con = getCon();
	      PreparedStatement ps = null;
	      try {
	         ps = con.prepareStatement(sql);
	         ps.setString(1, dto.getGoodsName());
	         ps.setString(2, dto.getPrice());
	         ps.setString(3, dto.getBuyDate());
	         ps.setString(4, dto.getBuyUserId());
	         ps.setString(5, dto.getSellUserId());
	         ps.setString(6, dto.getBrand());
	         ps.setString(7, dto.getCategory());
	         ps.setString(8, dto.getGoodsId());
	         ps.setString(9, dto.getGoodsSize());
	         ps.setString(10, dto.getEa());
	         ps.setString(11, dto.getGoodsUrl());
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
	public void insertPurchaseUser(BuyDTO dto) {
	      //INSERT INTO fx_concept VALUES(이름, 아이디, 비번, 이메일, 전화번호, 비밀번호 질문, 비밀번호 답, 가입일);
	      String sql = "INSERT INTO purchase VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	      Connection con = getCon();
	      PreparedStatement ps = null;
	      try {
	         ps = con.prepareStatement(sql);
	         ps.setString(1, dto.getGoodsName());
	         ps.setString(2, dto.getPrice());
	         ps.setString(3, dto.getBuyDate());
	         ps.setString(4, dto.getBuyUserId());
	         ps.setString(5, dto.getSellUserId());
	         ps.setString(6, dto.getBrand());
	         ps.setString(7, dto.getCategory());
	         ps.setString(8, dto.getGoodsId());
	         ps.setString(9, dto.getGoodsSize());
	         ps.setString(10, dto.getEa());
	         ps.setString(11, dto.getGoodsUrl());
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
	
	
	

}

	

