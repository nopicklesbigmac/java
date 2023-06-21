package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DatePickerEx extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DatePicker date = new DatePicker();
		
		HBox box = new HBox();
		box.getChildren().addAll(date);
	    box.setAlignment(Pos.CENTER);
	    
	    Scene scene = new Scene(box,300,200);
	    primaryStage.setTitle("DatePickerEx");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

}
