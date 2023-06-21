package method;

public class Absolute {
	private int data;

	public int getData() {
		if (data < 0)
			data = -data;
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
