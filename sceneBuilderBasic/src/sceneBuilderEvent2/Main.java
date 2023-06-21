package sceneBuilderEvent2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("form.fxml"));
		
		Parent form = loader.load();
		Scene scene = new Scene(form);
		
		primaryStage.setTitle("form");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
