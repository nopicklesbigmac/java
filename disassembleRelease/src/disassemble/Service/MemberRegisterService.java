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
		// password == confirmPassword
		// email로 계정 등록 여부 확인
		// memberDao.insert() 계정 등록
		if (req.getPassword().equals(req.getConfirmPassword())) {
			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
				if( memberDao.selectEmail(req.getEmail()) != null) {
					System.out.println(req.getEmail()+", 이미있는 이메일"); 
				}else {
					MemberDTO dto = new MemberDTO(req.getEmail() , req.getPassword() , req.getName(),formatedNow);
					memberDao.insert(dto);
					System.out.println("등록했습니다.\n");
					}
			}
			else {
				System.out.println("암호확인에 실패했습니다.");	
			}
	}
}

