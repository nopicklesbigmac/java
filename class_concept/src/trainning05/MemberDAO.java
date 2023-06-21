package trainning05;

import java.util.Collection;
import java.util.HashMap;

public class MemberDAO {
	private HashMap<String, MemberDTO> members;
	
	public MemberDAO() {
		members = new HashMap<String, MemberDTO>();
	}
	
	public MemberDTO selectId(String id) {
		return members.get(id);
	}
	
	public void insert(MemberDTO member) {
		members.put(member.getId(), member);
	}
	
	public Collection<MemberDTO> selectAll() {
		return members.values();
	}
	
	public void delete(String id) {
		members.remove(id);
	}
	
	public void update(MemberDTO member) {
		members.put(member.getId(), member);
	}
}
