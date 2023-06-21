package overloading;

public class PrintArraymain {
	public static void main(String[] args) {
		String[] sArr = {"김변수", "이상수", "박참조"};
		int[] iArr = {100,200,300};
		double[] dArr = {1.1,2.2,3.3};
		
		PrintArray printArray = new PrintArray();
		
		printArray.print(sArr);
		printArray.print(iArr);
		printArray.print(dArr);
	
	}
}
