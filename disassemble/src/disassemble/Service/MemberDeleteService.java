package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberDeleteService {
	
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		MemberDTO se = memberDao.selectEmail(email);
		if(se == null) {
			System.out.println(email + ", 없는 계정");
		}else {
			if(se.getPassword().equals(password)) {
				memberDao.delete(email);
				System.out.println(email + ", 삭제 완료");
			}else {
				System.out.println("비밀번호 틀림");
			}
		}
	}
}
