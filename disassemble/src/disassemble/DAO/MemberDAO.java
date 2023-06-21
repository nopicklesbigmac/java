package disassemble.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import disassemble.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO{
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO() {
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
	@Override
	public void insert(MemberDTO member) {
		String sql = "insert into disassemble values(disassemble_seq.nextval, ?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getName());
			ps.setString(4, member.getRegisterDate());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public MemberDTO selectEmail(String email) {
		String sql = "select * from disassemble where email = ?";
		MemberDTO dto = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO(
						rs.getInt("num"),
						rs.getString("email"),
						rs.getString("password"),
						rs.getString("name"),
						rs.getString("registerdate"));
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
	@Override
	public void delete(String email) {
		String sql = "delete from disassemble where email = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
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
	@Override
	public void update(MemberDTO member) {
		String sql = "update disassemble set password=? where email = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getPassword());
			ps.setString(2, member.getEmail());
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
	@Override
	public Collection<MemberDTO> selectAll() {
		Collection<MemberDTO> info = new ArrayList<>();
		String sql = "select * from disassemble";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO user = new MemberDTO(
						rs.getInt("num"),
						rs.getString("email"),
						rs.getString("password"),
						rs.getString("name"),
						rs.getString("registerdate"));
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
	public void exit() {
		try {
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
