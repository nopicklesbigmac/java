package method;

public class Prime {
	private int data1;
	private boolean prime=true;

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}
	public boolean getPrime() {
		return prime;
	}
	public boolean setPrime() {
		for (int i=2; i<data1;i++) {
			if (data1%i==0) 
				prime= false;
		}
			return prime;
				
	}
}
		

	
	
	

