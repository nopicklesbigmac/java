package common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CommonService {
	
	public void msg(String text) {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(text);
		alert.show();
	}
	
	public void windowClose(Parent form) {
		Stage stage = (Stage) form.getScene().getWindow();
		stage.close();
	}
	
	public void changeColor(Label label, TextField textField) {
		String labelText = label.getText();
		label.setText("*"+labelText);
		textField.textProperty().addListener((observable, oldValue, newValue)->{
			if (newValue.equals("")) {
				label.setTextFill(Color.web("#EF441F"));
			}else label.setTextFill(Color.web("black"));
			
		});
	}
}
