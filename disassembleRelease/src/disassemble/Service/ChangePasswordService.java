package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class ChangePasswordService {
    private MemberDAO memberDao;
    
	public ChangePasswordService(MemberDAO memberDao) {
	     this.memberDao = memberDao;
	    }

	public void changePassword(String email, String oldPw, String newPw) {
		// 이메일 등록여부 확인.
		// 패스워드 확인 및 MemberDAO.update() 호출 
		MemberDTO ems = memberDao.selectEmail(email);
		if(ems == null) {
			System.out.println("없는 이메일입니다.");
		}else {
			if (memberDao.ep(email, oldPw)) {
				ems.cPassword(newPw);
				memberDao.update(ems);
				System.out.println("암호를 변경했습니다.");
			}else {
				System.out.println("기존의 비밀번호가 틀렸습니다.");
		}
		}
	}
}
 

