package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label l1 = new Label("홈");
		Label l2 = new Label("사회");
		Label l3 = new Label("경제");
		Label l4 = new Label("국제");
		Label l5 = new Label("문화");
		HBox top =new HBox();
		top.getChildren().addAll(l1,l2,l3,l4,l5);
		top.setSpacing(10);
		top.setPrefSize(500, 50);
		top.setAlignment(Pos.CENTER);
		
		
		
		Label l6 = new Label("카테고리");
		Label l7 = new Label("노트북/pc");
		Label l8 = new Label("자동차용품");
		Label l9 = new Label("휴대폰");
		Label l10 = new Label("캠핑/낚시");
		
		VBox md =new VBox();
		md.getChildren().addAll(l6,l7,l8,l9,l10);
		md.setSpacing(10);
		md.setPrefSize(90, 200);
		md.setAlignment(Pos.TOP_LEFT);
		md.setPadding(new Insets(0,0,0,20));
		//
		Label label1 = new Label("Id");
	    Label label2 = new Label("pw");
	    TextField id = new TextField();
	    PasswordField pw = new PasswordField();
	    GridPane.setConstraints(label1, 0, 0);
	    GridPane.setConstraints(label2, 0, 1);
	    GridPane.setConstraints(id, 1, 0);
	    GridPane.setConstraints(pw, 1, 1);
	    GridPane grid = new GridPane();
	    grid.setHgap(20);
	    
	    grid.getChildren().addAll(label1,label2,id,pw);
	    
	    //남여
	    RadioButton radio1 = new RadioButton("남");
		RadioButton radio2 = new RadioButton("여");
	      
		ToggleGroup group = new ToggleGroup();
		radio1.setToggleGroup(group);
		radio2.setToggleGroup(group);
		radio1.setText("남");
	    radio2.setText("여");
	    HBox box = new HBox();
	    box.getChildren().addAll(radio1,radio2);
	    box.setSpacing(10);
	    
	    CheckBox check1 = new CheckBox("게임");
	    CheckBox check2 = new CheckBox("공부");
	    check1.setText("게임");
	    check2.setText("공부");
	    HBox box2 = new HBox();
	    box2.getChildren().addAll(check1,check2);
	    box2.setSpacing(10);

		Label l11 = new Label("하고 싶은 말");
		
		TextArea area = new TextArea();
		
		VBox box3 = new VBox();

	    box3.getChildren().addAll(grid,box,box2,l11,area);
	    box3.setSpacing(10);
	    box3.setPrefSize(180, 200);

	    TextField id2 = new TextField();
	    PasswordField pw2 = new PasswordField();
	    Button buttonLogin = new Button("로그인");
	    id2.setPrefSize(100, 20);
	    pw2.setPrefSize(100, 20);
		buttonLogin.setPrefSize(90, 45);
		
		VBox box4 = new VBox();
	    box4.getChildren().addAll(id2, pw2);
	   
	    HBox box5 = new HBox();
	    box5.getChildren().addAll(box4, buttonLogin);
	    
	    HBox box6 = new HBox();
	    box6.getChildren().addAll(md, box3,box5);
	    box6.setSpacing(20);
	    VBox box7 = new VBox();
	    box7.getChildren().addAll(top, box6);
	    
	    primaryStage.setTitle("Quiz");
	    primaryStage.setScene(new Scene(box7));
	    primaryStage.show();

	    
	    
		
	}

}
