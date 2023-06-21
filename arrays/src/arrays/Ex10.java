package arrays;

public class Ex10 {
	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{10,20,30,40},
			{50,60},
			{70,80,90,100,110},
			{120}};
			System.out.println(arr.length);
			System.out.println(arr[0].length);
			System.out.println(arr[1].length);
			System.out.println(arr[2].length);
			System.out.println(arr[3].length);

			System.out.println();
			System.out.println();
			
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					System.out.println("arr["+i+"]"+"["+j+"]"+arr[i][j]);
				}
				System.out.println();
			}
}
}
