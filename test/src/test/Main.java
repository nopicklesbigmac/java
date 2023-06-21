package test;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
 
public class Main extends Application {
 
    int listViewCount;
 
    @Override
    public void start(Stage primaryStage) {
        // Parent
        VBox root = new VBox(); // Parent 하위 객체인 VBox 생성
        root.setPrefWidth(500); // VBox의 폭 설정
        root.setPrefHeight(300); // VBox의 높이 설정
        root.setAlignment(Pos.CENTER); // 컨트롤을 중앙으로 정렬 
        root.setSpacing(20); // 컨트롤의 수직 간격
 
        // Label
        Label label = new Label(); // Label 컨트롤 생성
        label.setText("ListView"); // text 속성 설정
        label.setFont(new Font(50)); // font 속성 설정
        
        // ListView
        listViewCount = 2;
        ListView<String> listView = new ListView<String>(); // ListView 컨트롤 생성
 
        listView.getItems().add("Item 1"); // ListView에 목록 추가
        listView.getItems().add("Item 2");
        listView.getItems().add("Item 3");
 
        // Button
        Button insert = new Button(); // Button 컨트롤 생성
        insert.setText("Insert");
        insert.setOnAction((event) -> { // Button 이벤트 처리
            listViewCount++;
            listView.getItems().add("Item " + (listViewCount + 1));
        });
        Button delete = new Button();
        delete.setText("Delete");
        delete.setOnAction((event) -> {
            if (listView.getItems().size() > 0) { // ListView의 목록이 1개 이상일 때만
                listView.getItems().remove(listViewCount); // ListView의 목록 삭제
                listViewCount--;
            }
        });
 
        // 장면, 윈도우 설정
        root.getChildren().addAll(label, listView, insert, delete); // VBox의 자식으로 컨트롤러들을 추가
        Scene scene = new Scene(root); // VBox를 루트 컨테이너로 해서 Scene 생성
        primaryStage.setTitle("JavaFX ListView"); // 윈도우 제목 설정
        primaryStage.setScene(scene); // 윈도우에 장면 설정
        primaryStage.show(); // 윈도우 보여주기
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}