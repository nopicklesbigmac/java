package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
	      
	      p1.setMaxHeight(100);
	      p2.setMaxHeight(100);
	      p3.setMaxHeight(100);
	      
	      p1.setPrefWidth(80);
	      p2.setPrefWidth(80);
	      p3.setPrefWidth(120);
	      
    
		p1.setStyle("-fx-background-color: blue");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");

		HBox box =new HBox();
		box.getChildren().addAll(p1,p2,p3);
		box.setSpacing(10);
		box.setPadding(new Insets(10));
		
		Pane p4 = new Pane();
		Pane p5 = new Pane();
		Pane p6 = new Pane();
		
	      
	      p4.setMaxHeight(100);
	      p5.setMaxHeight(100);
	      p6.setMaxHeight(100);
	      
	      p4.setPrefWidth(80);
	      p5.setPrefWidth(80);
	      p6.setPrefWidth(120);
	      
  
		p4.setStyle("-fx-background-color: blue");
		p5.setStyle("-fx-background-color: red");
		p6.setStyle("-fx-background-color: black");

		HBox box2 = new HBox();
		box2.getChildren().addAll(p4,p5,p6);
		box2.setSpacing(10);
		box2.setPadding(new Insets(10));
		
		box.setPrefHeight(100);
		box2.setPrefHeight(100);
		
		box.setMaxWidth(300);
		box2.setMaxWidth(300);
		
		VBox box3 = new VBox();
	    box3.getChildren().addAll(box,box2); // 서로간의 간격
	    box3.setPadding(new Insets(10)); 
		
		primaryStage.setTitle("Box Ex");
		primaryStage.setScene(new Scene(box3));
		primaryStage.show();
	}

}

