package trainning02;

import java.util.ArrayList;

public class MemberDaoImpl  implements IMemberDAO{
	
	private static ArrayList<MemberDTO> members = new ArrayList<>();
	
	@Override
	public int selectIndex(String email){
		for (MemberDTO m : members) {
			if(m.getEmail().equals(email)) {
				return members.indexOf(m);
			}
		}
		return -1;
	}	
	@Override
	public void insert(String email,String name,String mobile){
		MemberDTO a = new MemberDTO(email,name,mobile);
		members.add(a);
	}
	
	@Override
	public MemberDTO selectOne(int index){
		return members.get(index);
	}
	@Override
	public void delete(int index){
		members.remove(index);
	}
	@Override
	public void update(int index,String name,String mobile){
		MemberDTO a = selectOne(index);
		a.setName(name);
		a.setMobile(mobile);
		members.set(index, a);
	}
	@Override
	public ArrayList<MemberDTO> selectAll(){
		return members;
	}
}
