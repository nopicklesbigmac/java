package buy;

public class BuyDTO {
	private String goodsName;
	private String buyUserId;
	private String price;  //인트로 나중에
	private String buyDate;
	private String brand;
	private String category;
	private String goodsId;
	private String goodsSize;
	private String sellUserId;
	private String ea;  //남은 수량
	private String goodsUrl;
	
	
	//커리문
	//create table purchase(goodsname varchar2(20), userid varchar2(10), price varchar2(10), date varchar2(15), buyuserid(15), price(15),
	//brand varchar2(15), category varchar2(15), goodsid varchar2(15), size varchar2(10), selluserid varchar2(15), ea varchar2(10),goodsurl varchar2(15));
	
	public String getBuyUserId() {
		return buyUserId;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public void setBuyUserId(String buyUserId) {
		this.buyUserId = buyUserId;
	}
	public String getEa() {
		return ea;
	}
	public void setEa(String ea) {
		this.ea = ea;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getSellUserId() {
		return sellUserId;
	}
	public void setSellUserId(String sellUserId) {
		this.sellUserId = sellUserId;
	}
	
}
