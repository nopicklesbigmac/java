package myPage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import buy.BuyDAO;
import buy.BuyDTO;
import common.CommonService;
import common.ListViewService;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import main.Controller;

public class PurchaseService {
	
	private Controller controller;
	private String loginId;
	private BuyDAO buyDao;
	private ListViewService listViewService;
	private CommonService commonService;
	private Label text;
	
	public PurchaseService(CommonService commonService,Label text) {
		controller = new Controller();
		buyDao = new BuyDAO();
		loginId = controller.getLoginId();
		listViewService = new ListViewService();
		this.commonService = commonService;
		this.text = text;
	}

	
	

	public ArrayList<BuyDTO> makeList(int term) {
		ArrayList<BuyDTO> buy = new ArrayList<>();
		if(text.getText().equals("구매내역")) buy = buyDao.selectPurchaseUser(loginId);
		else buy = buyDao.selectSellUser(loginId);
		ArrayList<BuyDTO> selectedBuy = new ArrayList<BuyDTO>();
		if (buy!=null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date now = sdf.parse(sdf.format(new Date()));
				
				for(BuyDTO buyDto : buy) {
					int count = 0;
					String date = buyDto.getBuyDate().replace("-", "");
					Date buyDate = sdf.parse(date);
					Calendar c1 = Calendar.getInstance();
					Calendar c2 = Calendar.getInstance();
					c1.setTime(buyDate);
					c2.setTime(now);
					while(c1.compareTo(c2)!=1) {
						c1.add(Calendar.DATE,1);
						count++;
					}
					
					if (count<=term) {
						selectedBuy.add(buyDto);
					}
				}
			}catch(Exception e) {	
			}
		}
		return selectedBuy;
	}
	public void twoMonth(ListView listView) {
		listViewService.makeSelectedListView(listView, makeList(60));
	}
	public void fourMonth(ListView listView) {
		listViewService.makeSelectedListView(listView, makeList(120));
	}
	public void sixMonth(ListView listView) {
		listViewService.makeSelectedListView(listView, makeList(180));
		
	}
	public void select(DatePicker frontDate, DatePicker backDate, ListView listView) {
		if (frontDate.getValue()==null||backDate.getValue()==null) {
			commonService.msg("날짜를 정확히 입력하세요");
			return;
		}
		int front = Integer.parseInt(frontDate.getValue().toString().replace("-", ""));
		int back = Integer.parseInt(backDate.getValue().toString().replace("-", ""));
		
		ArrayList<BuyDTO> buy = new ArrayList<>();
		if(text.getText().equals("구매내역")) buy = buyDao.selectPurchaseUser(loginId);
		else buy = buyDao.selectSellUser(loginId);
		ArrayList<BuyDTO> selectedBuy = new ArrayList<BuyDTO>();
		if (buy!=null) {
			for (BuyDTO buyDto : buy) {
				int buyDate = Integer.parseInt(buyDto.getBuyDate().replace("-", ""));  
				if (buyDate>=front && buyDate<= back) {
					selectedBuy.add(buyDto);
				}
			}
		}
		
		listViewService.makeSelectedListView(listView, selectedBuy);
	}
}
