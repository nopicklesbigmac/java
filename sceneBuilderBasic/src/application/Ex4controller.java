package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Ex4controller implements Initializable {
	// FXML 파일에 작성한 fx:id와 맴버변수명을  
	// 일치하게 구성하면 객체의 참조값을 자동으로 입력해줌.
	@FXML private TextField centerid;
	@FXML private TextField rightid;
	@FXML private TextField centerpw;
	@FXML private TextField rightpw;
	@FXML private Button rightbutton;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Ex4.fxml 파일을 로드하면 메소드 호출");
		rightbutton.setOnAction(event -> {
			String id = rightid.getText();
			String pw = rightpw.getText();
			if(id.isEmpty()||pw.isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setContentText("입력하세요");
				alert.show();
				return;
			}
			centerid.setText(id);
			centerpw.setText(pw);
		});
	}
	
	
	
}
