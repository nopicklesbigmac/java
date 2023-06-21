package myPage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import buy.BuyDAO;
import buy.BuyDTO;
import common.CommonService;
import common.OpenService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import main.Controller;

public class MyPageController extends PublicController implements Initializable {
	private MyPageService myPageService;
	private Parent myPageForm;
	private @FXML Label purchaseAll;
	private @FXML Label purchasing;
	private @FXML Label purchased;
	private @FXML Label saleAll;
	private @FXML Label onSale;
	private @FXML Label soldOut;
	private BuyDAO buyDao;
	private Controller controller;
	private @FXML Label nameId;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		controller = new Controller();
		myPageService = new MyPageService(controller);
		myPageService.setPurchaseAll(purchaseAll);
		myPageService.setSaleAll(saleAll);
		nameId.setText(controller.getLoginId());
	}
	
	public void changeInfoProc() {
		controller.openChangeInfoPage();
	}
	public void setmyPageForm(Parent myPageForm) {
		this.myPageForm = myPageForm;
	}
	
	public void purchaseAll() {
		controller.openPurchasePage("buy");
	}
	
	
	public void saleAll() {
		controller.openPurchasePage("sell");
	}
	
		
}
