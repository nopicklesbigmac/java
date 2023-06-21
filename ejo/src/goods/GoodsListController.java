package goods;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import common.CommonService;
import common.ListViewService;
import common.OpenService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import main.Controller;

public class GoodsListController extends PublicController implements Initializable{
	
	private @FXML ComboBox  categBox;
	private @FXML ComboBox  brandBox;
	private @FXML ComboBox  sortBox;
	private @FXML ListView  listView;
	private @FXML TextField searchfield;
	private @FXML Button searchButton;
	private ListViewService listViewService;
	private Parent goodsListForm;
	private CommonService commonService;
	private Controller controller;
	HBox column;
	public void setGoodsListForm(Parent goodsListForm) {
		this.goodsListForm = goodsListForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listViewService = new ListViewService();
		categBox.getItems().addAll("상관없음","아우터","상의","바지","신발");
		brandBox.getItems().addAll("상관없음","나이키","아디다스","퓨마","컨버스");
		sortBox.getItems().addAll("판매순▲","판매순▼","가격순▲(오름차순)","가격순▼(내림차순)");
		addcolumn();
		listView.getItems().add(column);
		listViewService.makeListView(listView);
		controller = new Controller();
		commonService = new CommonService();
		searchButton.setOnMouseClicked((MouseEvent)->{
			controller.setSearchText(searchfield.getText());
			System.out.println(searchfield.getText());
			System.out.println(controller.getSearchText());
			controller.openSearchPage();
		});

		
	}
	public void sortbtn() {
	listView.getItems().clear();
	String category = (String) categBox.getValue();
	String brand = (String) brandBox.getValue();
	String sort = (String) sortBox.getValue();
	String categorysql="";
	String brandsql="";
	String wheresql="";
	String sortsql="";
	//ORDER BY 컬럼명 ASC or DESC; sql 정렬(ASC는 오름차순, DESC는 내림차순)
	if (category=="상관없음") {
		         category=null;
		      }
		      if (brand=="상관없음") {
		         brand=null;
		      }
		      if(category!=null) {
		         categorysql = "category=" + "'"+category+"'";
		      }
		      if(brand!=null) {
		         brandsql = "brand=" + "'"+brand+ "'";
		      }
		      if (category != null && brand != null) {
		         wheresql = " where "+categorysql +" and "+brandsql;
		      } else if(category != null || brand != null) {
		         wheresql = " where "+ categorysql+brandsql;
		      }
		      if (sort=="가격순▲") {
		         sortsql =  " order by price asc";
		      }else if (sort=="가격순▼") {
		         sortsql =  " order by price DESC";
		      }
//		      }else if (sort=="판매순▲") {
//		         sortsql =  " order by price asc";
//		      }else if (sort=="판매순▼") {
//		         sortsql =  " order by price DESC";
//		      }
		      String sql = "select * from goods";
		      String sortlist = sql + wheresql+sortsql;
		      listViewService.sortListView(listView,sortlist);
			
		            }
	public void addcolumn() {
		column = new HBox();
		column.getChildren().addAll(new Label("이미지"),new Label("상품명"),new Label("가격"),new Label("브랜드"),new Label("카테고리"));
		column.setSpacing(40);
	}
	
}