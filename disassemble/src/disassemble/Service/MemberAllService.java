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
		if(members.isEmpty()) {
			System.out.println("가입된 계정이 없음");
		}else {
			for(MemberDTO member : members) {
				System.out.println("회원번호\t : \t" + member.getNum());
				System.out.println("이메일\t : \t" + member.getEmail());
				System.out.println("비밀번호\t : \t" + member.getPassword());
				System.out.println("이름\t : \t" + member.getName());
				System.out.println("가입일\t : \t" + member.getRegisterDate());
				System.out.println();
			}
		}
	}
}