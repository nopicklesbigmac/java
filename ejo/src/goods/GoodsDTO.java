package goods;

import java.util.ArrayList;

public class GoodsDTO {
   private String goodsName;
   private String price;  //인트로 나중에
   private String brand;
   private String category;
   private String goodsId;
   private int ea;  //남은 수량
   private String goodsUrl;
   
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
   public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}
   
}