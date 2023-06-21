package application;

import javax.print.DocFlavor.STRING;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Ex2 extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Ex2.fxml"));
		
		//Ex1.fxml 메모지에 로드 (인스턴스 (객체) 생성)
		Parent form = loader.load();
		
		ListView<String> lv = (ListView<String>)form.lookup("#listView");
		lv.getItems().addAll("아이템1","아이템2", "아이템3");
		
		Scene scene = new Scene(form);
		primaryStage.setTitle("Ex2");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
