package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabelEx2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 Label label = new Label("레이블");
	      
	      label.setPrefSize(200, 30);
	      label.setAlignment(Pos.CENTER);
	      label.setText("메소드로 입력한 텍스트 aaaaaaa");
	      label.setGraphic(new ImageView("/img/search.png"));
	      label.setTextFill(Color.web("#FF0000"));
	      label.setWrapText(true);
	      
	      HBox h = new HBox();
	      h.getChildren().addAll(label);
	      h.setPrefSize(300, 200);
	      h.setPadding(new Insets(50,10,10,50));
	      
	      primaryStage.setTitle("TextAreaEX");
	      primaryStage.setScene(new Scene(h));
	       primaryStage.show();
	      

	}

}
