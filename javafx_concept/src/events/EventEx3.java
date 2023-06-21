package events;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventEx3 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane anchor = new AnchorPane();
		Label label = new Label("Values");
		label.setFont(new Font("Cambria",32));
		label.setRotate(48);
		label.setLayoutX(120);
		label.setLayoutY(80);
		
		label.setOnMouseEntered(event-> {
				label.setScaleX(1.5);
				label.setScaleY(1.5);
				label.setRotate(0);
			});
		label.setOnMouseExited(event-> {
				label.setScaleX(1);
				label.setScaleY(1);
				label.setRotate(48);
		});
		anchor.getChildren().add(label);
		anchor.setPrefSize(300, 200);
		primaryStage.setTitle("EventEx1");
		primaryStage.setScene(new Scene(anchor, 300,200));
		primaryStage.show();
	}

}
