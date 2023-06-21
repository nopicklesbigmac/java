package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2me extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	public Pane getPane(String color, int width, int height) {
		Pane p = new Pane();
		p.setPrefSize(width, height);
		p.setStyle("-fx-background-color: "+color);
		return p;
	}
	public HBox getHBox() {
		HBox box = new HBox();
		box.getChildren().add(getPane("red", 100, 100));
		box.getChildren().add(getPane("orange", 100, 100));
		box.getChildren().add(getPane("black", 100, 100));
		box.setPadding(new Insets(20));
		box.setSpacing(20);
		return box;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox box1 = getHBox();
		HBox box2 = getHBox();
		
		VBox v = new VBox();
		v.getChildren().addAll(box1, box2);
		
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(v, 400, 300));
		primaryStage.show();
		
		
	}

}

