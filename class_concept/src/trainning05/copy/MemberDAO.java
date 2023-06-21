package trainning05.copy;

import java.util.HashMap;

public class MemberDAO {
	private HashMap<String,MemberDTO> members;
	
	public MemberDAO() {
		members = new HashMap<String,MemberDTO>();
	}
	
	public boolean indexOf(String id) {
		if(members.containsKey(id))
				return true;
		else {
			return false;
			}
		
	}
	public void insert(String id, MemberDTO member) {
		members.put(id, member);
	}
	
	public MemberDTO selectOne(String id) {
		return members.get(id);
	}
	
	public void delete(String id, MemberDTO member) {
		members.remove(id);
	}
	public HashMap<String,MemberDTO> selectAll() {
		return members;
	}
	public void update(String id, MemberDTO member) {
		members.put(id, member);
	}
}