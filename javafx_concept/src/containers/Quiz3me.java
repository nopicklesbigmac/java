package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz3me extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();

		p2.setPrefHeight(100);
		p3.setPrefHeight(100);

		p2.setMaxWidth(400);
		p3.setMaxWidth(400);

		p1.setStyle("-fx-background-color: blue");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");

		VBox box = new VBox();
		box.getChildren().addAll(p2, p3);
		box.setSpacing(10);
		
		box.setMaxHeight(200);
		p1.setMaxHeight(200);

		box.setPrefWidth(400);
	    p1.setPrefWidth(150);

		HBox box2 = new HBox();
		box2.getChildren().addAll(box,p1);
		box2.setSpacing(10);
		box2.setPadding(new Insets(10));
		
		primaryStage.setTitle("VBoxEx");
		primaryStage.setScene(new Scene(box2));
		primaryStage.show();
	}

}

