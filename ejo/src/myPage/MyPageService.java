package myPage;

import buy.BuyDAO;
import common.CommonService;
import javafx.scene.control.Label;
import main.Controller;


public class MyPageService {

	private CommonService commonService;
	private Controller controller;
	private BuyDAO buyDao;
	
	public MyPageService(Controller controller) {
		commonService = new CommonService();
		this.controller = controller;
		buyDao = new BuyDAO();
	}
	
	public void setPurchaseAll(Label label) {
		String count = buyDao.countBuyColumn(controller.getLoginId());
		label.setText(count);
	}
	public void setSaleAll(Label label) {
		String count = buyDao.countSellColumn(controller.getLoginId());
		label.setText(count);
	}
	
	
	
}
