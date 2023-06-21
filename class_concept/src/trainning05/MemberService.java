package trainning05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MemberService {
	private MemberDAO memberDao;
	
	public MemberService() {
		memberDao = new MemberDAO();
	}
	public void insert(String id, String pw, String name) {
		MemberDTO member = memberDao.selectId(id);
		if(member == null) {
			member = new MemberDTO();
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			memberDao.insert(member);
			System.out.println(id + " 계정 등록을 완료했습니다.");
		}else {
			System.out.println(id + "는/은 등록된 아이디입니다.");
		}
	}
	public void selectId(String id) {
		MemberDTO member = memberDao.selectId(id);
		if(member != null) {
			System.out.println(" == 검색 결과 == ");
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPw());
			System.out.println("이름 : " + member.getName());
		}else {
			System.out.println(id + "는/은 미 등록 아이디입니다.");
		}
		System.out.println();
	}
	
	public void delete(String id) {
		MemberDTO member = memberDao.selectId(id);
		if(member != null) {
			memberDao.delete(id);
			System.out.println(id + " 계정 정보를 삭제했습니다.");
		}else {
			System.out.println(id + "는/은 미 등록 아이디입니다.");
		}
		System.out.println();
		
	}
	public void selectAll() {
		 Collection<MemberDTO> members = memberDao.selectAll();
		 if(members.isEmpty() == false) {
			 System.out.println(" === 회원 목록 === ");
			 for(MemberDTO member : members) {
				System.out.println("아이디 : " + member.getId());
				System.out.println("비밀번호 : " + member.getPw());
				System.out.println("이름 : " + member.getName());
				System.out.println("---------------------------");
			 }
		 }else {
			 System.out.println("등록된 정보가 없습니다.");
		 }
		 System.out.println();
	}
	
	public void update(String id, String currentPw, String changePw) {
		MemberDTO member = memberDao.selectId(id);
		if(member != null) {
			if(member.getPw().equals(currentPw)) {
				member.setPw(changePw);
				memberDao.update(member);
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
