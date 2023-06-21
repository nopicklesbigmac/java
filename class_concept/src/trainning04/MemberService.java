package trainning04;

import java.util.ArrayList;


public class MemberService {
private MemberDAO memberDao;
	
	public MemberService() {
		memberDao = new MemberDAO();
	}
	
	public void insert(MemberDTO memberDto) {
		int index = memberDao.selectIndex(memberDto.getId());
		if(index == -1) {
			memberDao.insert(memberDto);
			System.out.println(memberDto.getId() + "님의 회원 정보가 등록되었습니다.");
		}else {
			System.out.println(memberDto.getId() + "님의 회원 정보는 미 등록되어 있습니다.");
		}
		System.out.println();
	}

	public void selectOne(String id) {
		int index = memberDao.selectIndex(id);
		if(index != -1) {
			MemberDTO memberDto = memberDao.selectOne(index);
			System.out.println("=== " + id + " 회원 정보 === ");
			System.out.println("아이디 : " + id);
			System.out.println("비번 : " + memberDto.getPassword());
			System.out.println("이름 : " + memberDto.getName());
		}else {
			System.out.println(id + "님의 회원 정보는 미 등록되어 있습니다.");
		}
	}

	public void delete(String id) {
		int index = memberDao.selectIndex(id);
		if(index != -1) {
			memberDao.delete(index);
			System.out.println(id + "님의 회원 정보를 삭제했습니다.");
		}else {
			System.out.println(id + "님의 회원 정보는 미 등록되어 있습니다.");
		}
	}

	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty()) {
			System.out.println("회원 정보가 한 개도 없습니다.");
		}else {
			System.out.println(" === 회원 목록 ===");
			for(MemberDTO memberDto : members) {
				System.out.println("아이디 : " + memberDto.getId());
				System.out.println("비번 : " + memberDto.getPassword());
				System.out.println("이름 : " + memberDto.getName());
				System.out.println();
			}
		}
	}

	public void update( MemberDTO memberDto) {
		int index = memberDao.selectIndex(memberDto.getId());
		if(index != -1) {
			memberDto.setName(memberDao.selectOne(index).getName());
			memberDao.update(index, memberDto);
			System.out.println(memberDto.getId() + "님의 회원 정보를 수정했습니다.");
		}else {
			System.out.println(memberDto.getId() + "님의 회원 정보는 미 등록되어 있습니다.");
		}
	}
}

