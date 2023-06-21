package disassemble.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
		
	public MemberRegisterService(MemberDAO memberDao){
		this.memberDao = memberDao;
		}
		
	public void resgist(RegisterRequest req){
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		if (req.getPassword().equals(req.getConfirmPassword())) {
			MemberDTO se = memberDao.selectEmail(req.getEmail());
			if(se == null) {
				MemberDTO dao = new MemberDTO(
						req.getEmail(),
						req.getPassword(),
						req.getName(),
						formatedNow);
				memberDao.insert(dao);
				System.out.println(req.getEmail() + ", 등록 완료");
			}else {
				System.out.println(req.getEmail() + ", 이미 등록된 이메일");
			}
		}else {
			System.out.println("암호 확인에 실패");
		}
	}
}
