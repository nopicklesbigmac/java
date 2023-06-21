package search;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import common.ListViewService;
import buy.BuyDAO;
import buy.BuyDTO;
import common.CommonService;
import common.OpenService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import main.Controller;

public class SearchController  extends PublicController implements Initializable{

	@FXML ListView  searchlist;
	@FXML TextField  searchfield;
	@FXML Button  searchButton;
	
	private Parent searchForm;
	private CommonService commonService;
	private Controller controller;
	private OpenService openService;
	private BuyDAO goodsDao;
	private ListViewService listViewService;
	HBox column;
	public void setSearchForm(Parent searchForm) {
		this.searchForm = searchForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listViewService = new ListViewService();
		commonService = new CommonService();
		searchlist.getItems().clear();
		commonService.msg(controller.getSearchText()+", 검색 결과입니다.");
		searchsss(controller.getSearchText());
		searchButton.setOnMouseClicked((MouseEvent)->{
			searchsss(searchfield.getText());
	        });
		controller = new Controller();

	}
	public void searchsss(String s) {
		searchlist.getItems().clear();
		addcolumn();
   		System.out.println(s);
   		String sql = "select * from goods";
   		String searchT = " where " +"goodsname like'"+s+"'";
   		String sqllist = sql+searchT;
   		listViewService.sortListView(searchlist,sqllist);
	}
	public void addcolumn() {
		column = new HBox();
		column.getChildren().addAll(new Label("이미지"),new Label("상품명"),new Label("가격"),new Label("브랜드"),new Label("카테고리"));
		column.setSpacing(40);
	}
}