package login;

import java.net.URL;
import java.util.ResourceBundle;

import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import main.Controller;
import common.CommonService;
import common.OpenService;

public class LoginController extends PublicController implements Initializable{
	
	private LoginService loginService;
	private @FXML TextField idField;
	private @FXML PasswordField pwField;
	private Controller controller;
	private @FXML Label idLabel;
	private @FXML Label pwLabel;
	private CommonService commonService;
	private OpenService openService;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginService = new LoginService();
		controller = new Controller();
		commonService = new CommonService();
		openService = new OpenService();
		
	}
	public void login() {
		loginService.login(idField, pwField);
		
	}

	public void findIdProc() {
		controller.openFindIdPage();
	}
	
	public void findPwProc() {
		controller.openFindPwPage();
	}
	
//	public Boolean getBoolean(TextField textField) {
//		Boolean state = true;
//		textField.textProperty().addListener((observable, oldValue, newValue)->{
//			if (newValue.equals("")) {
//				state = false;
//			}else state = true;
//		});
//		return null;
//	}
	
}
