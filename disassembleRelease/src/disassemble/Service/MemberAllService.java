package disassemble.Service;



import java.util.Collection;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		 Collection<MemberDTO> members = memberDao.selectAll();
		 if(members.isEmpty() == false) {
			 System.out.println(" === 회원 목록 === ");
			 for(MemberDTO member : members) {
				System.out.println("이메일 : " + member.getEmail());
				System.out.println("비밀번호 : " + member.getPassword());
				System.out.println("이름 : " + member.getName());
				System.out.println("가입일 : " + member.getRegisterDate());
				System.out.println("---------------------------");
			 }
		 }else {
			 System.out.println("등록된 정보가 없습니다.");
		 }
		 System.out.println();
	}
}
	
