package goodsadd;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import buy.BuyDAO;
import buy.BuyDTO;
import common.CommonService;
import common.PublicController;
import goods.GoodsDAO;
import goods.GoodsDTO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import main.Controller;

public class GoodsAddController  extends PublicController implements Initializable{
	
	private @FXML ImageView goodsimage;
	private @FXML ComboBox categComBo;
	private @FXML ComboBox sizeCombo;
	private @FXML TextField goodsName;
	private @FXML TextField Price;
	private @FXML TextField brand;
	private @FXML Label errtext;
	private @FXML TextField searchField;
	private @FXML Button searchButton;
	private Parent goodsaddForm;
	private CommonService commonService;
	private Controller controller;
	private GoodsDAO dao;
	private BuyDAO buyDao;
	File path;
	
	public void setGoodsAddForm(Parent goodsaddForm) {
		this.goodsaddForm = goodsaddForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
    	dao = new GoodsDAO();
    	buyDao = new BuyDAO();
		commonService = new CommonService();
		controller = new Controller();
		categComBo.getItems().addAll("아우터","상의","바지","신발");
		categComBo.setOnMouseClicked((MouseEvent)->{
			sizeCombo.getItems().clear();
		});
		sizeCombo.setOnMouseClicked((MouseEvent)->{
			String cs="";
			if(categComBo.getValue()!=null) {
				cs= (String) categComBo.getValue();	
				if(cs.equals("신발")) {
					sizeCombo.getItems().addAll("260","265","270","275","280");
				}
				else if(cs.equals("바지")) {
					sizeCombo.getItems().addAll("30","32","34","36","38");
				}
				else if(cs.equals("아우터")||cs.equals("상의")) {
					sizeCombo.getItems().addAll("95","100","105","110","115");
				}
			}else {
				errtext.setText("카테고리부터 선택해주세요.");
//				commonService.msg("카테고리부터 선택해주세요.");
			}
			
		});
		searchButton.setOnMouseClicked((MouseEvent)->{
			controller.setSearchText(searchField.getText());
			System.out.println(searchField.getText());
			System.out.println(controller.getSearchText());
			controller.openSearchPage();
		});
		
	}
	public void uploadbtn() {
		FileChooser fc = new FileChooser();
		fc.setTitle("이미지 선택");
		fc.setInitialDirectory(new File("c:"));
		ExtensionFilter imgType = new ExtensionFilter("image file", "*.jpg", "*.gif","*.png");
		fc.getExtensionFilters().add(imgType);
		path =fc.showOpenDialog(null);
		System.out.println(path);
		if(path!=null) {
			try {
				FileInputStream fis = new FileInputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);
				Image img = new Image(bis);
				goodsimage.setImage(img);
				try {
					if (path!=null) {
					bis.close();}
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			} catch (FileNotFoundException e) {	
				e.printStackTrace();
			}
		}else {
			errtext.setText("이미지파일을 선택해주세요.");
		}
	}
	public void cancelbtn() {
		controller.openMainPage();
	}
	public void addbtn() {
        if (controller.getLoginId()==null) {
        	controller.openLoginPage();
        	commonService.msg("로그인해라이자시가");
        }else {
        	if(goodsName.getText().equals("")) {
        		errtext.setText("제품명을 작성해주세요.");
        	}else {
        		if(brand.getText().equals("")) {
            		errtext.setText("브랜드명을 작성해주세요.");
            	}else {
            		if(sizeCombo.getValue()==null) {
                		errtext.setText("사이즈를 선택해주세요.");
                	}else {
                		if(path==null) {
                    		errtext.setText("이미지를 업로드해주세요.");
                    	}else {
                    		if(Price.getText().equals("")) {
                    			errtext.setText("가격안적음 ?");
                    		}else {
                    		LocalDateTime now = LocalDateTime.now();
                    		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    		String name = goodsName.getText();
                    		String brandstr = brand.getText();
                    		String pricestr = Price.getText();
                    		String sizestr = (String) sizeCombo.getValue();	
                    		String categstr = (String) categComBo.getValue();
                    		String url = ""+path;
                            String userid = controller.getLoginId();
                    		GoodsDTO dto = new GoodsDTO();
                        	dto.setGoodsName(name);
                        	dto.setPrice(pricestr);
                        	dto.setBrand(brandstr);
                        	dto.setCategory(categstr);
                        	dto.setGoodsId(sizestr);
                        	dto.setEa(1);
                        	dto.setGoodsUrl(url);
                        	dao.insertgoods(dto);
                        	//-----buylist 추가 
                        	
                        	BuyDTO buyDto = new BuyDTO();
                        	buyDto.setEa("1");
                        	buyDto.setGoodsUrl(url);
                        	buyDto.setBuyDate(formatedNow);
                        	buyDto.setGoodsName(name);
                        	buyDto.setPrice(pricestr);
                        	buyDto.setBrand(brandstr);
                        	buyDto.setCategory(categstr);
                        	buyDto.setGoodsSize(sizestr);
                        	buyDto.setSellUserId(controller.getLoginId());
                        	buyDao.insertSellUser(buyDto);
                        	controller.openMainPage();
                        	commonService.msg(dto.getGoodsName()+", 등록완료");
                    	}
                	}
            	}
        	}
        }
	}
}
}
