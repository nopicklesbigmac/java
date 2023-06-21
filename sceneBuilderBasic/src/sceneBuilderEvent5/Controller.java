package sceneBuilderEvent5;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private TextField id;
	@FXML private PasswordField pw;
	private LoginService loginSvc;
	private Parent regForm;
	
	public void setRegForm(Parent regForm) {
		this.regForm = regForm;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginSvc = new LoginService();
	}

	public void loginProc() {
		System.out.println("regForm : " + ((TextField)regForm.lookup("#id")).getText());
		loginSvc.loginProc(id.getText(), pw.getText());
	}
	
	public void cancelProc() {
		loginSvc.cancelProc(id, pw);
	}
	
	public void regProc() throws Exception {
		loginSvc.regProc();
	}
	public void regCancelProc() {
		
		loginSvc.regCancelProc(regForm);
	}
	
}
