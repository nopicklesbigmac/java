package trainning041;

import java.util.ArrayList;

public class MemberDAO {
	private ArrayList<MemberDTO> members;
	
	public MemberDAO() {
		members = new ArrayList<MemberDTO>();
	}
	
	public int indexOf(String id) {
		for(int i = 0; i < members.size(); i++) {
			MemberDTO tmp = members.get(i);
			if(tmp.getId().equals(id))
				return members.indexOf(tmp);
		}
		return -1;
	}
	
	public void insert(MemberDTO member) {
		members.add(member);
	}
	
	public MemberDTO selectOne(int index) {
		return members.get(index);
	}
	
	public void delete(int index) {
		members.remove(index);
	}
	public ArrayList<MemberDTO> selectAll() {
		return members;
	}
	public void update(int index, MemberDTO member) {
		members.set(index, member);
	}
}
