package trainning03;

import java.util.ArrayList;

public interface IMemberDAO {
	// 이메일을 입력하면 이메일에 맞는 인덱스를 반환하는 기능
	public int selectIndex(String email);
	public void insert(MemberDTO memberDto);
	public MemberDTO selectOne(int index);
	public void delete(int index);
	public void update(int index, MemberDTO memberDto);
	public ArrayList<MemberDTO> selectAll();
}
