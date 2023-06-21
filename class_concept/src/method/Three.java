package method;

public class Three {
	private int data;
			// ()안에 int data는 매개변수 
	
	public void setData(int data) {
		this.data = data;
	}	//this. 붙으면 클레스변수  
	public int getData() {
		return data;
	}
	
	public boolean result() {
		if(data%3==0)
			return true;
		return false;
	} // return 키워드를 사용하면 
	  //아래코드 실행하지않고 메소드종료
}
