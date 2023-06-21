package test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
// 파일탐색(경로)
public class testController {
	@FXML ImageView imgView;
	public void imgSel() {
		FileChooser fc = new FileChooser();
		fc.setTitle("이미지 선택");
		fc.setInitialDirectory(new File("c:/img"));
		ExtensionFilter imgType = new ExtensionFilter("image file", "*.jpg", "*.gif","*.png");
		fc.getExtensionFilters().add(imgType);
		File path =fc.showOpenDialog(null);
		System.out.println(path);
		try {
			FileInputStream fis = new FileInputStream(path);
			BufferedInputStream bis = new BufferedInputStream(fis);
			Image img = new Image(bis);
			imgView.setImage(img);
			System.out.println("bis");
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		}	
	}	
}


//implements Initializable
//@Override
//public void initialize(URL location, ResourceBundle resources) {
//	String path = "C:/javas/workspace/test/src/img/1.png";		 
//	try {
//		FileInputStream fis = new FileInputStream(path);
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		Image img = new Image(bis);
//		imgView.setImage(img);
//		try {
//			bis.close();
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}		
//}