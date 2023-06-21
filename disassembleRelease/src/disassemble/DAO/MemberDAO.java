package disassemble.DAO;

import java.util.Collection;
import java.util.HashMap;

import disassemble.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO{
	private HashMap<String, MemberDTO> members;
	public MemberDAO() {
		members = new HashMap<String, MemberDTO>();
	}
	@Override
	public Collection<MemberDTO> selectAll() {
		return members.values();
	}
	@Override
	public MemberDTO selectEmail(String email) {
		return members.get(email);
	}
	@Override
	public void insert(MemberDTO member) {
		members.put(member.getEmail(), member);
	}
	@Override
	public void update(MemberDTO member) {
		members.put(member.getEmail(), member);
	}
	@Override
	public void delete(String email) {
		members.remove(email);
	}
	// 기존비밀번호 확인 
	public boolean ep (String email,String pass) {
		Collection<MemberDTO> members = selectAll();
		for (MemberDTO member : members) {
			if (member.getEmail().equals(email)) {
				if (member.getPassword().equals(pass)) {
					return true; 
				}
			}	 
		}return false;
	}
}