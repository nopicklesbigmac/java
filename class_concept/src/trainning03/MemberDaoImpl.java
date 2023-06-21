package trainning03;

import java.util.ArrayList;
// Data Access Object
public class MemberDaoImpl implements IMemberDAO{
	private ArrayList<MemberDTO> members = new ArrayList<>();

	@Override
	public int selectIndex(String email) {
		for(MemberDTO m : members) {
			if(m.getEmail().equals(email)) {
				return members.indexOf(m);
			}
		}
		return -1;
	}
	@Override
	public void insert(MemberDTO memberDto) {
		members.add(memberDto);
	}
	@Override
	public MemberDTO selectOne(int index) {
		return members.get(index);
	}
	@Override
	public void delete(int index) {
		members.remove(index);
	}
	@Override
	public ArrayList<MemberDTO> selectAll(){
		return members;
	}
	@Override
	public void update(int index, MemberDTO memberDto) {
		members.set(index, memberDto);
	}
}
