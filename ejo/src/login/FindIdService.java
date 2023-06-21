package login;

import common.CommonService;
import reg.RegDTO;

public class FindIdService {
	
	private LoginDAO loginDao;
	private CommonService commonService;
	
	public FindIdService() {
		loginDao = new LoginDAO();
		commonService = new CommonService();
	}
	
	public void findId(String name, String phone) {
		
		RegDTO user = loginDao.selectNamePhone(name, phone);
		
		if(user==null) {
			commonService.msg("해당 유저가 존재하지 않습니다");
		}
		else {
			commonService.msg("아이디는 : " + user.getId());
		}
	}
}
