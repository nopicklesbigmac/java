package trainning03;

import java.util.ArrayList;

// Main에서 전달된 데이터 검증 및 결과 출력
public class MemberService {
	private MemberDaoImpl memberDao;
	
	public MemberService() {
		memberDao = new MemberDaoImpl();
	}
	
	public void insert(MemberDTO memberDto) {
		int index = memberDao.selectIndex(memberDto.getEmail());
		if(index == -1) {
			memberDao.insert(memberDto);
			System.out.println(memberDto.getEmail() + "님의 회원 정보가 등록되었습니다.");
		}else {
			System.out.println(memberDto.getEmail() + "님의 회원 정보는 미 등록되어 있습니다.");
		}
		System.out.println();
	}

	public void selectOne(String email) {
		int index = memberDao.selectIndex(email);
		if(index != -1) {
			MemberDTO memberDto = memberDao.selectOne(index);
			System.out.println("=== " + email + " 회원 정보 === ");
			System.out.println("이메일 : " + email);
			System.out.println("이름 : " + memberDto.getName());
			System.out.println("전화번호 : " + memberDto.getMobile());
		}else {
			System.out.println(email + "님의 회원 정보는 미 등록되어 있습니다.");
		}
	}

	public void delete(String email) {
		int index = memberDao.selectIndex(email);
		if(index != -1) {
			memberDao.delete(index);
			System.out.println(email + "님의 회원 정보를 삭제했습니다.");
		}else {
			System.out.println(email + "님의 회원 정보는 미 등록되어 있습니다.");
		}
	}

	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty()) {
			System.out.println("회원 정보가 한 개도 없습니다.");
		}else {
			System.out.println(" === 회원 목록 ===");
			for(MemberDTO memberDto : members) {
				System.out.println("이메일 : " + memberDto.getEmail());
				System.out.println("이름 : " + memberDto.getName());
				System.out.println("전화번호 : " + memberDto.getMobile());
				System.out.println();
			}
		}
	}

	public void update(MemberDTO memberDto) {
		int index = memberDao.selectIndex(memberDto.getEmail());
		if(index != -1) {
			memberDao.update(index, memberDto);
			System.out.println(memberDto.getEmail() + "님의 회원 정보를 수정했습니다.");
		}else {
			System.out.println(memberDto.getEmail() + "님의 회원 정보는 미 등록되어 있습니다.");
		}
	}
}
