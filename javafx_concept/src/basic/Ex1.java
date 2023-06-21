package basic;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex1 extends Application {

	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Hello javaFX");
		label.setFont(new Font(20.0));
		
		Scene scene = new Scene(label,600,400);
		primaryStage.setTitle("welcome");
		primaryStage.setX(1000);
		primaryStage.setY(200);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
