package arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i = 0; i < arr.length;i++){
		arr[i] = 100*(i+1);
		}
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
		}
}
