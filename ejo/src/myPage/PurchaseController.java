package myPage;

import java.net.URL;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ResourceBundle;

import common.CommonService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;

public class PurchaseController extends PublicController implements Initializable{

	private @FXML DatePicker frontDate;
	private @FXML DatePicker backDate;
	private @FXML ListView listView;
	private PurchaseService purchaseService;
	private CommonService commonService;
	private @FXML Label text;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		commonService = new CommonService();
		purchaseService = new PurchaseService(commonService,text);
	}
	
	public void twoMonth() {
		purchaseService.twoMonth(listView);
	}
	
	public void fourMonth() {
		purchaseService.fourMonth(listView);
	}
	
	public void sixMonth() {
		purchaseService.sixMonth(listView);
	}
	
	public void frontAction() {
		
		backDate.setDayCellFactory(picker -> new DateCell() {
	        public void updateItem(LocalDate date, boolean empty) {
	        	if(frontDate.getValue()!=null) {
	        		super.updateItem(date, empty);
		            LocalDate front = frontDate.getValue();
		            setDisable(empty || date.compareTo(front) < 0 );	
	        	}
	            
	        }
	    });	
		
	}
	
	public void backAction() {
		frontDate.setDayCellFactory(picker -> new DateCell() {
	        public void updateItem(LocalDate date, boolean empty) {
	        	if(backDate.getValue()!=null) {
	        		super.updateItem(date, empty);
		            LocalDate back = backDate.getValue();
		            setDisable(empty || date.compareTo(back) > 0 );	
	        	}
	            
	        }
	    });
	}
	
	
	public void selectClicked() {
		purchaseService.select(frontDate,backDate,listView);	
	}

}
