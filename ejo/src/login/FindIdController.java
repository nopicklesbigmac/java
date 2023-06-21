package login;

import java.net.URL;
import java.util.ResourceBundle;

import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class FindIdController extends PublicController implements Initializable{

	private @FXML TextField nameField;
	private @FXML TextField phoneField;
	private FindIdService findIdService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		findIdService = new FindIdService();
	}
	
	public void findId() {
		findIdService.findId(nameField.getText(), phoneField.getText());
	}

}
