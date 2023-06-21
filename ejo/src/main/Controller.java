package main;

import buy.BuyDTO;
import common.CommonService;
import common.OpenService;
import goods.GoodsDTO;
import javafx.scene.Parent;

public class Controller {
	
	private OpenService openService;
	private static Parent loginForm;
	private static Parent mainForm;
//	private static Parent backForm;
	private static Parent nowForm;
	private static Parent regForm;
	private CommonService commonService;
	private static String loginId;
	private static String searchText;

	private static Parent myPageForm;
	private static Parent findIdForm;
	private static Parent findPwForm;
	private static Parent eventForm;
	private static Parent goodsForm;
	private static Parent goodsListForm;
	private static Parent goodsaddForm;
	private static Parent searchform;
	private static Parent changeInfoForm;
	
	public Controller() {
		openService = new OpenService();
		commonService = new CommonService();
	}
	public static String getSearchText() {
		return searchText;
	}
	public void openPurchasePage(String what) {
		commonService.windowClose(nowForm);
		openService.openPurchasePage(what);
	}
	public void openMyPage() {
		commonService.windowClose(nowForm);
		openService.openMyPage();
	}
	public void setMyPageForm(Parent myPageForm) {
		this.myPageForm = myPageForm;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public void openGoodsPage(GoodsDTO goodsDto){
		commonService.windowClose(nowForm);
		openService.openGoodsPage(goodsDto);	
	}
	public void openGoodsPage(BuyDTO buyDto){
		commonService.windowClose(nowForm);
		openService.openGoodsPage(buyDto);	
	}
	public void setChangeInfoPage(Parent changeInfoForm) {
		this.changeInfoForm = changeInfoForm;
	}
	public void openChangeInfoPage() {
		commonService.windowClose(nowForm);
		openService.openChangeInfoPage();
	}
	public void openGoodsListPage() {
		commonService.windowClose(nowForm);
		openService.openGoodsListPage();
	}
	public void setGoodsListForm(Parent goodsListForm) {
		this.goodsListForm = goodsListForm;
	}
	
	
	
	public void setGoodsForm(Parent goodsForm) {
		this.goodsForm = goodsForm;
	}
	public void openEventPage() {
		commonService.windowClose(nowForm);
		openService.openEventPage();
	}
	
	public void setEventForm(Parent eventForm) {
		this.eventForm = eventForm;
	}
	public void setGoodsAddForm(Parent goodsaddForm) {
		this.goodsaddForm = goodsaddForm;
	}
	
	public void openPage(Parent form) {
		
	}
	
	public void setFindIdForm(Parent findIdForm) {
		this.findIdForm = findIdForm;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public void setNowForm(Parent nowForm) {
		this.nowForm = nowForm;
	}
	
	public void openFindIdPage() {
		commonService.windowClose(nowForm);
		openService.openFindIdPage();
	}
	
	
	public void openFindPwPage() {
		commonService.windowClose(nowForm);
		openService.openFindPwPage();
	}
	
	public void setMainForm(Parent mainForm) {
		this.mainForm = mainForm;
	}
	
	public void setFindPwForm(Parent findPwForm) {
		this.findPwForm = findPwForm;
	}
	
//	public void setBackFormString(String word) {
//		backFormString = word;
//	}
	public void openLoginPage() {
		commonService.windowClose(nowForm);
//		backForm = nowForm;
		openService.openLoginPage();
	}
	
	public void openMainPage() {
		commonService.windowClose(nowForm);
//		backForm = nowForm;
		openService.openMainPage();
	}
	
	public void openRegPage() {
		commonService.windowClose(nowForm);
//		backForm = nowForm;
		openService.openRegPage();
	}
	
	public void setLoginForm(Parent loginForm) {
		this.loginForm = loginForm;
	}
	
	public void setRegForm(Parent regForm) {
		this.regForm = regForm;
	}
	
	public void cancelPage() {
		commonService.windowClose(nowForm);
//		backForm = nowForm;
		openService.openMainPage();
	}
	
	public String getLoginId() {
		return loginId;
	}

	public void openGoodsAddPage() {
		commonService.windowClose(nowForm);
//		backForm = nowForm;
		openService.openGoodsAddPage();
	}

	public void openSearchPage() {
		commonService.windowClose(nowForm);
//		backForm = nowForm;
		openService.openSearchPage();
	}

	public void setSearchForm(Parent searchform) {
		this.searchform = searchform;
		
	}
	
//	public void goBack() {
//		commonService.windowClose(nowForm);
//		backForm.getProperties().
//		switch(backFormString) {
//		case "main": openService.openMainPage();
//		}
//	}
	
	
	
}
