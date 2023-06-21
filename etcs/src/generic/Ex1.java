package generic;

class printClass{
	public void print(double data1, double data2) {
		System.out.println(data1+", "+data2);
	}
	public void print(int data1, int data2) {
		System.out.println(data1+", "+data2);
	}
	public void print(String data1, String data2) {
		System.out.println(data1+", "+data2);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		
	
	printClass pc = new printClass();
	pc.print(1.1,1.2);
	pc.print(1,2);
	pc.print("김","김변수");
	
	}
}
