package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberDeleteService {
	
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		// 패스워드 확인
		// MemberDAO 객체 내 selectEmail() 메소드를 호출 
		// 저장된 회원 정보와 입력된 회원 정보 검증
		// MemberDAO 객체 내 delete() 호출
		MemberDTO ems = memberDao.selectEmail(email);
		if (password.equals(confirmPassword)) {
			if( ems == null) {
				System.out.println( email +" , 없는 이메일"); 
			}else {
				if (memberDao.ep(email, password)) {
					memberDao.delete(email);
					System.out.println( email +" , 삭제 완료");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
		}else{
			System.out.println("암호확인에 실패했습니다.");
		}
	}
}
