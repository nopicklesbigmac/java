package event;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;



public class EventDAO {

	private Connection con;
	private PreparedStatement ps;
	
	public EventDAO() {
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
	public ArrayList<EventDTO> selectAll() {
		ArrayList<EventDTO> info = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from eventlist";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				EventDTO user = new EventDTO();
				user.setTitle(rs.getString("title"));
				user.setEventdate(rs.getString("eventdate"));
				user.setContent(rs.getString("content"));
				info.add(user);
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

	public EventDTO selectEvent(String title) {
		String sql = "select * from eventlist where title = ?";
		EventDTO dto = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new EventDTO();
				dto.setTitle(rs.getString("title"));
				dto.setEventdate(rs.getString("eventdate"));
				dto.setContent(rs.getString("content"));
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
		return dto;
	}

}
