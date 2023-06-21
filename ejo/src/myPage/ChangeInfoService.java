package myPage;

import common.CommonService;
import javafx.scene.control.TextField;
import main.Controller;

public class ChangeInfoService {
	private CommonService commonService;
	private Controller controller;
	private ChangeInfoDAO changeInfoDao;

	public ChangeInfoService(CommonService commonService){
		this.commonService=commonService;
		controller = new Controller();
		changeInfoDao = new ChangeInfoDAO();
	}
	
	public void changeInfo(TextField confirmPw,TextField changePw, TextField changeName,TextField changeEmail, TextField changePhone) {
		//바뀐 정보
		String cpw=changePw.getText();
		String cname=changeName.getText();
		String cemail=changeEmail.getText();
		String cphone=changePhone.getText();
		String cPw=confirmPw.getText();
		String pw=changeInfoDao.getPw(controller.getLoginId());
		
		if(cPw.equals(pw)){//db에서 가져온 비밀번호
			ChangeInfoDTO changeInfoDto= new ChangeInfoDTO();
			changeInfoDto.setChangeName(cname);
			changeInfoDto.setChangePw(cpw);
			changeInfoDto.setChangeEmail(cemail);
			changeInfoDto.setChangePhone(cphone);
			changeInfoDao.insert(changeInfoDto);
			controller.cancelPage();
			commonService.msg("성공");
		}else { 
			commonService.msg("비밀번호를 확인해주세요");
		}
	}
}
