package sceneBuilderEvent1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert.AlertType;

public class QuizController implements Initializable{

	@FXML private TextField id;
	@FXML private PasswordField pw;
	@FXML private Button button;
	@FXML private BorderPane border;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(id.textProperty());
		button.setDisable(true);
		id.textProperty().addListener( (attribute,before,after) -> {
//			System.out.println(attribute);
//			System.out.println(before);
//			System.out.println(after);
			emptyCheck();
			idLengthCheck();
		});
		pw.textProperty().addListener( (attribute,before,after) -> {
			emptyCheck();
			pwLengthCheck();
		});
		border.setOnKeyPressed(event ->{
			if(button.isDisable() == false &&event.getCode()==KeyCode.ENTER) {
				loginCheck();
			}
		});
	}
	public void emptyCheck() {
		if (!id.getText().isEmpty()&&!pw.getText().isEmpty()) {
			button.setDisable(false);
		}else {
			button.setDisable(true);
		}
	}
	private void idLengthCheck() {
		if (id.getLength() > 8) {
			String tmp = id.getText();
			tmp = tmp.substring(0,8);
			id.setText(tmp);
		}
	}
	private void pwLengthCheck() {
		if (pw.getLength() > 10) {
			String tmp = pw.getText();
			tmp = tmp.substring(0,10);
			pw.setText(tmp);
		}
	}
	public void loginCheck() {
		MyDB db = new MyDB();
		String dbPw = db.getPw(id.getText());
		if(dbPw != null && dbPw.equals(pw.getText())) {
			message("로그인 성공");
		}else {
			message("로그인 실패");
			pw.clear();
		}
	}
	public void message(String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(content);
		alert.show();
	}
	

}
