package generic;

class printClass2{
	public void print(Object data1, Object data2) {
		System.out.println(data1+", "+data2);
	}

}

public class Ex2 {
	public static void main(String[] args) {
		
	
	printClass2 pc = new printClass2();
	pc.print(1.1,1.2);
	pc.print(1,2);
	pc.print("김","김변수");
	
	}
}
