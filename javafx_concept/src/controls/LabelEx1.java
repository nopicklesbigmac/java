package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelEx1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 Label label = new Label("레이블");
	      
	      label.setPrefSize(200, 30);
	      label.setStyle("-fx-background-color: skyblue");
	      label.setAlignment(Pos.CENTER);
	      
	      HBox box = new HBox();
	      box.getChildren().addAll(label);
	      box.setPrefSize(300, 200);
	      box.setPadding(new Insets(50,10,10,50));
	      
	      primaryStage.setTitle("TextAreaEX");
	      primaryStage.setScene(new Scene(box));
	       primaryStage.show();
	      

	}

}
