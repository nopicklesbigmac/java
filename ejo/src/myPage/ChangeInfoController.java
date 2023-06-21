package myPage;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import common.OpenService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ChangeInfoController extends PublicController implements Initializable{
	private ChangeInfoService changeInfoService;
	private CommonService commonService; 
	@FXML TextField changePw;
	@FXML TextField confirmPw;
	@FXML TextField changeName;
	@FXML TextField changePhone;
	@FXML TextField changeEmail;
	@FXML Button changeButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		commonService=new CommonService();
		changeInfoService = new ChangeInfoService(commonService);
		
	}
	public void changeInfo() {
		changeInfoService.changeInfo(confirmPw,changePw, changeName,changeEmail,changePhone);
	}

}
