package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonEx extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		RadioButton radio1 = new RadioButton("체크1");
		RadioButton radio2 = new RadioButton("체크2");
	      
		ToggleGroup group = new ToggleGroup();
		radio1.setToggleGroup(group);
		radio2.setToggleGroup(group);
		
	      radio1.setText("멍때리기");
	      radio2.setText("침대와 혼연일체");
	      
	      radio2.setSelected(true);
	      
	      System.out.println("check1 : " +radio1.isSelected());
	      System.out.println("check2 : " +radio2.isSelected());
	      
	      HBox box = new HBox();
	      box.getChildren().addAll(radio1,radio2);
	      box.setAlignment(Pos.CENTER);
	      box.setSpacing(10);
	      
	      primaryStage.setTitle("RadioButtonEx");
	      primaryStage.setScene(new Scene(box,200,100));
	      primaryStage.show();

	}

}
