package mediaEx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		Parent mainForm = loader.load();
		
		primaryStage.setTitle("mediaEx2");
		
		primaryStage.setScene(new Scene(mainForm));
		primaryStage.show();
	}

}
