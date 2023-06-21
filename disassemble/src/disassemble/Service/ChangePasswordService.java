package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class ChangePasswordService {
    private MemberDAO memberDao;
    
	public ChangePasswordService(MemberDAO memberDao) {
	     this.memberDao = memberDao;
	    }

	public void changePassword(String email, String oldPw, String newPw) {
		MemberDTO se = memberDao.selectEmail(email);
		if(se == null) {
			System.out.println(email + ", 계정 미등록");
		}else {
			if(se.getPassword().equals(oldPw)) {
				se.setPassword(newPw);
				memberDao.update(se);
				System.out.println(email + ", 수정 완료");
			}else {
				System.out.println("기존 패스워드가 다름");
			}
		}
	}
}
 
