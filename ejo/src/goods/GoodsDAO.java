package goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GoodsDAO {

	private Connection con;
	private PreparedStatement ps;
	
	public Connection getCon() {
		return con;
	}
	
	public GoodsDAO() {
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
	public void insertgoods(GoodsDTO dto) {
	      String sql = "INSERT INTO goods VALUES(?,?,?,?,?,?,?)";
	      Connection con = getCon();
	      PreparedStatement ps = null;
	      
	      try {
	         ps = con.prepareStatement(sql);
	         ps.setString(1, dto.getGoodsName());
	         ps.setString(2, dto.getPrice());
	         ps.setString(3, dto.getBrand());
	         ps.setString(4, dto.getCategory());
	         ps.setString(5, dto.getGoodsId());
	         ps.setInt(6, dto.getEa());
	         ps.setString(7, dto.getGoodsUrl());
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
	public ArrayList<GoodsDTO> selectAll() {
		ArrayList<GoodsDTO> info = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from goods";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				GoodsDTO good = new GoodsDTO();
				good.setGoodsName(rs.getString("goodsname"));
				good.setPrice(rs.getString("price"));
				good.setBrand(rs.getString("brand"));
				good.setCategory(rs.getString("category"));
				good.setGoodsId(rs.getString("goodsid"));
				good.setEa(rs.getInt("ea"));
				good.setGoodsUrl(rs.getString("goodsurl"));
				info.add(good);
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
		return info;
	}
	public ArrayList<GoodsDTO> sortlist(String sortsql) {
		ArrayList<GoodsDTO> info = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sortsql);
			rs = ps.executeQuery();
			while(rs.next()) {
				GoodsDTO good = new GoodsDTO();
				good.setGoodsName(rs.getString("goodsname"));
				good.setPrice(rs.getString("price"));
				good.setBrand(rs.getString("brand"));
				good.setCategory(rs.getString("category"));
				good.setGoodsId(rs.getString("goodsid"));
				good.setEa(rs.getInt("ea"));
				good.setGoodsUrl(rs.getString("goodsurl"));
				info.add(good);
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
		return info;
	}
}
