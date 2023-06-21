package arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
		arr[i] = 100*(i+1);
		}
		for(int i = 0; i < arr.length; i++) {
		System.out.println("arr["+i+"] : " + arr[i]);
		}

	}

}
