package constructor;

public class Reverse {
	private int data, result;
	
	public Reverse() {
	}
	public Reverse(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	private void setResult() {
		int tmp = data;
		while(true) {
			result = result + tmp % 10;
			tmp /= 10;
			if(tmp == 0)
				break;
			result *= 10;
		}
	}
	public int getData() {
		return data;
	}
	public int getResult() {
		setResult();
		return result;
	}
	
}


