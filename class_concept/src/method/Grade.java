package method;

public class Grade {
	private int data;
	private char grade;

	public char getData() {
		if (data < 0)
			data = -data; 
		if (data/10 == 9) {
			grade = 'A';
		}
		else if (data/10 == 8) {
			grade = 'B';
		}
		else if (data/10 == 7) {
			grade = 'C';
		}
		else if (data/10 == 6) {
			grade = 'D';
		}else
			grade = 'F';
		return grade;
	}

	public void setData(int data) {
		this.data = data;
	}
}
