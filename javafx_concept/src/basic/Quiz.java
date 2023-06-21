package basic;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Quiz  extends Application  {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Quiz");
		Scene scene = new Scene(label,1000,700);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		int x =screenSize.width;
		int y =screenSize.height;

		primaryStage.setX((x-1000)/2);
		primaryStage.setY((y-700)/2);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quiz");
		primaryStage.show();
		
	}

}
