package login;

import common.CommonService;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import main.Controller;
import reg.RegDTO;

public class FindPwService {

	private CommonService commonService;
	private Controller controller;
	private LoginDAO loginDao;
	private @FXML ComboBox queBox;
	
	public FindPwService() {
		commonService = new CommonService();
		controller = new Controller();
		loginDao = new LoginDAO();
	}
	public void findPw(String id, String name, ComboBox queBox, String pwAnswer) {
		RegDTO regDto=new RegDTO();
		String pwQuestion = (String) queBox.getValue();
		regDto = loginDao.selectId(id);
		
		if(id.equals("")) {
			commonService.msg("아이디를 입력하세요");
		}else if (name.equals("")){
			commonService.msg("이름을 입력하세요");
		}else if (pwQuestion==null){
			commonService.msg("질문을 선택하세요");
		}else if (pwAnswer.equals("")){
			commonService.msg("답을 입력하세요");
		}else if (regDto==null) {
			commonService.msg("해당 유저가 존재하지 않습니다");
		}
		else {	
			if(regDto.getId().equals(id)&& regDto.getName().equals(name)&& regDto.getPwAnswer().equals(pwAnswer)&&regDto.getPwQuestion().equals(pwQuestion)) {
				commonService.msg("비밀번호는 "+ regDto.getPw());
			}else {
				commonService.msg("입력하신 정보가 일치하지 않습니다.");
				
			}
		}
		
	}
}
