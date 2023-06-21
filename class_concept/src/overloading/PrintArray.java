package overloading;

public class PrintArray {

	public void print (String[] arr) {
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	public void print (int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public void print (double[] arr) {
		for(double d : arr) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	
	
	
}
