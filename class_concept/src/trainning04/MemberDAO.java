package trainning04;

import java.util.ArrayList;

public class MemberDAO {
	private ArrayList<MemberDTO> members;
	
	public MemberDAO() {
		members = new ArrayList<MemberDTO>();
	}
	
	public int selectIndex(String id) {
		for(MemberDTO m : members) {
			if(m.getId().equals(id)) {
				return members.indexOf(m);
			}
		}
		return -1;
	}
	public void insert(MemberDTO memberDto) {
		members.add(memberDto);
	}
	
	public MemberDTO selectOne(int index) {
		return members.get(index);
	}
	
	public void delete(int index) {
		members.remove(index);
	}
	
	public ArrayList<MemberDTO> selectAll(){
		return members;
	}
	
	public void update(int index, MemberDTO memberDto) {
		members.set(index, memberDto);
	}
}


