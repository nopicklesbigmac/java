package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex4 extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Ex4.fxml"));
		
		//Ex1.fxml 메모지에 로드 (인스턴스 (객체) 생성)
		Parent form = loader.load();
		
		Scene scene = new Scene(form);
		primaryStage.setTitle("Ex4");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
