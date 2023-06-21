package common;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.Controller;

public class PublicController {
	@FXML TextField searchfield;
	private Controller controller;
	private CommonService commonService;
	
	
	public PublicController() {
		controller = new Controller();
		commonService = new CommonService();
	}
		
	//로그인 화면으로 이동
	//로그인 화면으로 이동
		public void loginProc() {
			if (controller.getLoginId()==null) controller.openLoginPage();
			else {
				controller.setLoginId(null);
				controller.openMainPage();
				commonService.msg("로그아웃 되었습니다");
			}
			
		}
	//id,pw찾기 화면으로 이동
	public void idpwProc() {
	}
	
	//회원가입 화면으로 이동
	public void regProc() {
		if (controller.getLoginId()!=null) {
			commonService.msg("로그인이 되어있습니다.");
			return;
		}
		controller.openRegPage();
	}
	
	//마이페이지 화면으로 이동
	public void myPageProc() {
		if (controller.getLoginId()==null) {
			commonService.msg("로그인이 필요합니다");
			return;
		}
		controller.openMyPage();
	}
	//메인 화면으로 이동
	public void mainProc() {
		controller.openMainPage();
	}
	
	//검색기능
	public void searchProc() {
		controller.openSearchPage();
	}
	
	//공지사항 화면으로 이동
	public void noticeProc() {
		controller.openEventPage();
	}
	
	public void eventProc() {
		
	}
	
	public void goBack() {
//		controller.goBack();
	}
	
	
}
