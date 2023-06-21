package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class QuizController implements Initializable{

	@FXML private TextField id;
	@FXML private PasswordField pw;
	@FXML private Button button;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MyDB db = new MyDB();
		Alert alert = new Alert(AlertType.INFORMATION);
		
		button.setOnAction(event->{
			String viewId = id.getText();
			String viewPw = pw.getText();
			
			if(viewId.isEmpty()) {
				alert.setContentText("아이디를 입력하세요");
				id.requestFocus();
			}else if(viewPw.isEmpty()) {
				alert.setContentText("비밀번호를 입력하세요");
				pw.requestFocus();
			}else {
				String dbPw = db.getPw(viewId);
				if(dbPw != null && dbPw.equals(viewPw)) {
					alert.setContentText("로그인 성공");
				}else {
					alert.setContentText("로그인 실패");
					pw.clear();
				}
			}
			
			alert.show();
		});
	}

}
