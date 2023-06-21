package trainning05.copy;

import java.util.HashMap;
import java.util.Iterator;


public class MemberService {
	private MemberDAO memberDao;
	
	public MemberService() {
		memberDao = new MemberDAO();
	}
	public void insert(String id, String pw, String name) {
		if(memberDao.indexOf(id)) {
			System.out.println(id + "는/은 등록된 아이디입니다.");
		}else {
			MemberDTO member = new MemberDTO();
			member.setPw(pw);
			member.setName(name);
			memberDao.insert(id, member);
		}
	}
	public void selectOne(String id) {
		if(memberDao.indexOf(id)) {
			memberDao.selectOne(id);
		}else {
			System.out.println(id + "는/은 없는 아이디입니다.");
		}
	}
	public void delete(String id, String currentPw) {
		if(memberDao.indexOf(id)) {
			MemberDTO member = memberDao.selectOne(id);
			if(member.getPw().equals(currentPw)) {
				memberDao.delete(id, member);
				System.out.println(id + " 삭제완료");
			}else {
				System.out.println("현재 비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println(id + "는/은 미 등록 아이디입니다.");
		}
		System.out.println();
			
		
	}
	public void selectAll() {
		HashMap<String,MemberDTO> members = memberDao.selectAll();
		 if(members.isEmpty() == false) {
			 System.out.println(" === 회원 목록 === ");
			 Iterator<String> itp = members.keySet().iterator();
				while(itp.hasNext()) {
					String id = (String)itp.next();
					System.out.println("이름 : "+members.get(id));
					System.out.println("I D : " + id);
					System.out.println("password : " + members.get(id));;
					System.out.println();;
				}
		 }else {
			 System.out.println("등록된 정보가 없습니다.");
		 }
		 System.out.println();
	}
	public void update(String id, String currentPw, String changePw) {
		if(memberDao.indexOf(id)) {
			MemberDTO member = memberDao.selectOne(id);
			if(member.getPw().equals(currentPw)) {
				member.setPw(changePw);
				memberDao.update(id, member);
				System.out.println(id + " 비밀번호 정보를 수정했습니다.");
			}else {
				System.out.println("현재 비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println(id + "는/은 미 등록 아이디입니다.");
		}
		System.out.println();
		
	}

}
