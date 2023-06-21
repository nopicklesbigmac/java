package common;


import java.util.ArrayList;

import buy.BuyDAO;
import buy.BuyDTO;
import goods.GoodsDAO;
import goods.GoodsDTO;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import main.Controller;

public class ListViewService {

	private GoodsDAO goodsDao;
	private Controller controller;
	private BuyDAO buyDao;
	public ListViewService() {
		goodsDao = new GoodsDAO();
		controller = new Controller();
		buyDao = new BuyDAO();
	}
	
	public void makeListView(ListView listView) {
		ArrayList<GoodsDTO> purchase = goodsDao.selectAll();
		if (purchase!=null) {
			for (GoodsDTO goodsDto : purchase) {
				HBox hbox = makeHBox(goodsDto);
				listView.getItems().add(hbox);	
			}
		}
	}
	public void sortListView(ListView listView, String sortlist) {
		ArrayList<GoodsDTO> purchase = goodsDao.sortlist(sortlist);
		if (purchase!=null) {
			HBox column = new HBox();
			column.getChildren().addAll(new Label("이미지"),new Label("상품명"),new Label("가격"),new Label("브랜드"),new Label("카테고리"));
			column.setSpacing(40);
			listView.getItems().add(column);
			for (GoodsDTO goodsDto : purchase) {
				HBox hbox = makeHBox(goodsDto);
				listView.getItems().add(hbox);	
			}
		}
	}
	public void resize(Label label) {
		label.setMinWidth(40);
		label.setMaxWidth(40);
		label.setWrapText(true);
	}
	public void makeSelectedListView(ListView listView, ArrayList<BuyDTO> buy) {
		listView.getItems().clear();
		if (buy!=null) {
			for (BuyDTO buyDto : buy) {
				HBox hbox = makeHBox(buyDto);
				listView.getItems().add(hbox);
			}
		}
	}
	public void tempListView(ListView listView,int front, int back) {
		ArrayList<BuyDTO> buy = buyDao.selectPurchaseUser(controller.getLoginId());
		if (buy!=null) {
			for (BuyDTO buyDto : buy) {
				int date = Integer.parseInt(buyDto.getBuyDate().replace("-", ""));
				if (date>=front && date<=back) {
					HBox hbox = makeHBox(buyDto);
					listView.getItems().add(hbox);	
				}
			}
		}
	}
	public HBox makeHBox(GoodsDTO goodsDto) {
		HBox hbox = new HBox();
		String goodsUrl = goodsDto.getGoodsUrl();
		String goodsName = goodsDto.getGoodsName();
		String price = goodsDto.getPrice();
		String brand = goodsDto.getBrand();
		String category = goodsDto.getCategory();
		Label name_label = new Label(goodsName);  resize(name_label);
		Label price_label = new Label(price);   resize(price_label);
		Label brand_label = new Label(brand);   resize(brand_label);
		Label category_label = new Label(category);   resize(category_label);
		ImageView imageView = new ImageView();
		if (goodsUrl!=null) {
			Image image = new Image("File:"+goodsUrl,100,100,false,false);
			imageView.setImage(image);	
		}
		
		HBox temp = new HBox(name_label,price_label,brand_label,category_label);
		temp.setSpacing(40);
		temp.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(imageView,temp);
		hbox.setSpacing(15);
		
		hbox.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				if (goodsDto!=null) {
					controller.openGoodsPage(goodsDto);	
				}
			}
		});
		return hbox;
	}

	public HBox makeHBox(BuyDTO buyDto) {
		HBox hbox = new HBox();
		String goodsUrl = buyDto.getGoodsUrl();
		String goodsName = buyDto.getGoodsName();
		String price = buyDto.getPrice();
		String brand = buyDto.getBrand();
		String category = buyDto.getCategory();
		String date = buyDto.getBuyDate();
		Label name_label = new Label(goodsName);  resize(name_label);
		Label price_label = new Label(price);   resize(price_label);
		Label brand_label = new Label(brand);   resize(brand_label);
		Label category_label = new Label(category);   resize(category_label);
		Label date_label = new Label(date); resize(date_label);
		ImageView imageView = new ImageView();
		if (goodsUrl!=null) {
			Image image = new Image("File:" + goodsUrl,75,75,false,false);
			imageView.setImage(image);	
		}
		
		HBox temp = new HBox(name_label,price_label,brand_label,category_label,date_label);
		temp.setSpacing(40);
		temp.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(imageView,temp);
		hbox.setSpacing(15);
		
		hbox.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (buyDto!=null) {
					controller.openGoodsPage(buyDto);	
				}
			}
		});
		return hbox;
	}
}

