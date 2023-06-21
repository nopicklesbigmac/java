package goods;

import java.net.URL;
import java.util.ResourceBundle;

import common.CommonService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import main.Controller;

public class GoodsController extends PublicController implements Initializable{
	private @FXML TextField searchfield;
	private @FXML Button searchButton;
	private Parent goodsForm;
	private CommonService commonService;
	private Controller controller;
	public void setGoodsListForm(Parent goodsForm) {
		this.goodsForm = goodsForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		controller = new Controller();
		commonService = new CommonService();
		
	}

}