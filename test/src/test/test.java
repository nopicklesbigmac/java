package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//파일탐색(경로)
public class test  extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml"));
		Parent mainForm = loader.load();
		
		primaryStage.setTitle("test");
		
		primaryStage.setScene(new Scene(mainForm));
		primaryStage.show();
		
	}

}
