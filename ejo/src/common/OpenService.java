package common;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import buy.BuyDAO;
import buy.BuyDTO;
import goods.GoodsDTO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.Controller;

public class OpenService {
	CommonService commonService;
	
	public void openLoginPage() {
		pageOpen("/login/login.fxml","login");
	}
	
	public void openRegPage() {
		pageOpen("/reg/register.fxml","register");
	}
	
	public void openFindIdPage() {
		pageOpen("/login/findId.fxml","findId");
	}
	
	public void openFindPwPage() {
		pageOpen("/login/findPw.fxml","findPw");
	}
	
	
	public void openNoticePage() {
		
	}
	
	public void openGoodsListPage() {
		pageOpen("/goods/goodslist.fxml","goodslist");
	}
	public void openGoodsPage(BuyDTO buyDto) {
	}
	public void openPurchasePage(String what) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/myPage/purchaseList.fxml"));
		Parent form = null;
		try {
			form = loader.load();
			Controller controller = new Controller();
			ListViewService listViewService = new ListViewService();
			Label naeyuk = (Label)form.lookup("#naeyuk");
			if (what.equals("sell")) naeyuk.setText("판매내역");
			controller.setNowForm(form);
			loginout(form);
			Scene scene = new Scene(form);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void openGoodsPage(GoodsDTO goodsDto) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/goods/goods.fxml"));
		Parent form = null;
		try {
			form = loader.load();
			Controller controller = new Controller();
			controller.setGoodsForm(form);
			controller.setNowForm(form);
			if (goodsDto!=null) {
				ImageView imageView = (ImageView) form.lookup("#image");
				Label goodsName = (Label) form.lookup("#goodsName");
				ComboBox<String> sizeCombo = (ComboBox) form.lookup("#sizeCombo");
				Label price = (Label) form.lookup("#price");
				Button buybtn = (Button) form.lookup("#buybtn");
				Button sellbtn = (Button) form.lookup("#sellbtn");
				Button searchButton = (Button) form.lookup("#searchButton");
				TextField searchfield = (TextField) form.lookup("#searchField");
				Label category = (Label) form.lookup("#category");
				Image image = new Image("File:"+goodsDto.getGoodsUrl(),200,250,false,false);
				imageView.setImage(image);
				goodsName.setText(goodsDto.getGoodsName());
				price.setText(goodsDto.getPrice());
				category.setText(goodsDto.getCategory());
				String categ = category.getText();
				if(categ.equals("신발")) {
					sizeCombo.getItems().addAll("260","265","270","275","280");
				}
				if(categ.equals("바지")) {
					sizeCombo.getItems().addAll("30","32","34","36","38");
				}
				if(categ.equals("아우터")||categ.equals("상의")) {
					sizeCombo.getItems().addAll("95","100","105","110","115");
				}
				CommonService commonService=new CommonService();
				// 추가 일단 구매판매 버튼코드 조금 수정했어요
				buybtn.setOnMouseClicked((MouseEvent)->{
					BuyDAO buyDao = new BuyDAO();
					LocalDateTime now = LocalDateTime.now();
					String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			          BuyDTO buy = new BuyDTO();
			          buy.setGoodsName(goodsDto.getGoodsName());
			          buy.setPrice(goodsDto.getPrice());
			          buy.setBrand(goodsDto.getBrand());
			          buy.setCategory(goodsDto.getCategory());
			          buy.setGoodsUrl(goodsDto.getGoodsUrl());
			          buy.setGoodsSize((String) sizeCombo.getValue());
			          buy.setBuyDate(formatedNow.toString());
			          buy.setBuyUserId(controller.getLoginId());
			          if (controller.getLoginId()!=null) {
			        	  if (sizeCombo.getValue()!=null) {
			        		  buyDao.insertPurchaseUser(buy);
			        		  commonService.msg(goodsDto.getGoodsName()+", 구매");
			        		  controller.cancelPage();
			        	  }else {
			        		  commonService.msg("사이즈를 선택해주세요.");
			        	  }
			          }else {
			        	  commonService.msg("로그인해라임마");
			        	  controller.openLoginPage();
			          }
			        });
				
				// 추가 판매 버튼 
				sellbtn.setOnMouseClicked((MouseEvent)->{

					BuyDAO buyDao = new BuyDAO();
					LocalDateTime now = LocalDateTime.now();
					String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			          BuyDTO buy = new BuyDTO();
			          buy.setGoodsName(goodsDto.getGoodsName());
			          buy.setPrice(goodsDto.getPrice());
			          buy.setBrand(goodsDto.getBrand());
			          buy.setCategory(goodsDto.getCategory());
			          buy.setGoodsUrl(goodsDto.getGoodsUrl());
			          buy.setGoodsSize((String) sizeCombo.getValue());
			          buy.setBuyDate(formatedNow.toString());
			          buy.setSellUserId(controller.getLoginId());
			          if (controller.getLoginId()!=null) {
			        	  if (sizeCombo.getValue()!=null) {
			        		  buyDao.insertSellUser(buy);
			        		  commonService.msg(goodsDto.getGoodsName()+", 판매");
			        		  controller.cancelPage();
			        	  }else {
			        		  commonService.msg("사이즈를 선택해주세요.");
			        	  }
			          }else {
			        	  commonService.msg("로그인해라임마");
			        	  controller.openLoginPage();
			          }
			        });
				searchButton.setOnMouseClicked((MouseEvent)->{
					controller.setSearchText(searchfield.getText());
					controller.openSearchPage();
				});
				
			}else {
				CommonService csv = new CommonService();
				csv.msg("null");
			}
			loginout(form);
			
			Scene scene = new Scene(form);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void openMyPage() {
		pageOpen("/myPage/myPage.fxml","mypage");
	}
	public void openEventPage() {
		pageOpen("/event/event.fxml","findPw");
	}
	public void openGoodsAddPage() {
		pageOpen("/goodsadd/goodsadd.fxml","goodsadd");
	}
	public void openDrawPage() {
		
	}
	public void openChangeInfoPage() {
		pageOpen("/myPage/changeinfo.fxml","changeinfo");
	}
	public void openMainPage() {
		pageOpen("/main/main.fxml","main");
	}
	public void pageOpen(String fxmlUrl,String name) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlUrl));
		Parent form = null;
		try {
			form = loader.load();
			
			Controller controller = new Controller();
			switch(name) {
			case "login" : controller.setLoginForm(form); break;
			case "main" : controller.setMainForm(form); break;
			case "register" : controller.setRegForm(form); break;
			case "findId" : controller.setFindIdForm(form); break;
			case "findPw" : controller.setFindPwForm(form); break;
			case "event" : controller.setEventForm(form); break;
			case "goodslist" : controller.setGoodsListForm(form);break;
			case "goodsadd" : controller.setGoodsAddForm(form);break;
			case "mypage" : controller.setMyPageForm(form); break;
			case "search" : controller.setGoodsAddForm(form);
			case "changeinfo" : controller.setChangeInfoPage(form); break;	
			default : return;
			}
			controller.setNowForm(form);

			loginout(form);
			
			Scene scene = new Scene(form);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loginout(Parent form) {
		Controller controller = new Controller();
//		Label loginButton = (Label) form.lookup("#loginButton");
		BorderPane borderPane = (BorderPane)form.lookup("#borderPane");
		Label loginButton;
		if (borderPane==null) {
			ScrollPane scrollPane = (ScrollPane)form.lookup("#scrollPane");
			loginButton = (Label) scrollPane.getContent().lookup("#loginButton");
		}
		else loginButton = (Label) borderPane.getTop().lookup("#loginButton");
		
		CommonService commonService = new CommonService();
		if (controller.getLoginId()==null) loginButton.setText("로그인");
		else {
			loginButton.setPrefWidth(70);
			loginButton.setText("로그아웃");
		}
	}
	public void openSearchPage() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/search/search.fxml"));
		Parent form = null;
		try {
			form = loader.load();
			Controller controller = new Controller();
			controller.setSearchForm(form);
			controller.setNowForm(form);
			
			loginout(form);
			
			Scene scene = new Scene(form);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
