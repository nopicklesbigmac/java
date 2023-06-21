package arrays;

public class Ex07 {

	public static void main(String[] args) {
		int arr[] = new int[] {4,8,2,7,6};
		int i, j, tmp;
		for(i = 0; i < arr.length-1; i++) {
			for(j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print("정렬 후 : " );
			for(i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
	}
}