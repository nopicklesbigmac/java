package login;
import common.PublicController;
import common.CommonService;
import common.OpenService;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import main.Controller;
import reg.RegDAO;
import reg.RegDTO;


public class LoginService{
	
	private CommonService commonService;
	private LoginDAO loginDao;
	private Controller controller;
	
	public LoginService() {
		commonService = new CommonService();
		loginDao = new LoginDAO();
		controller = new Controller();
	}
	
	public void login(TextField idField, PasswordField pwField) {
		
		String id = idField.getText();
		String pw = pwField.getText();
		
		if(id.equals("")) {
			commonService.msg("아이디를 입력해주세요!!");
		}else if(pw.equals("")) {
			commonService.msg("비밀번호를 입력해주세요!!");
		}
		else {
			RegDTO regDto = loginDao.selectId(id);
			
			if(regDto != null && regDto.getPw().equals(pw)) {
				controller.setLoginId(id);
				controller.cancelPage();
				commonService.msg("로그인 성공");
				controller.setLoginId(id);
			}else {
				// 로그인 실패
				commonService.msg("로그인 실패");
			}
		}
		
	}
	
	
}
