package generic;

class printClass3<All>{
	public void print(All data1, All data2) {
		System.out.println(data1+", "+data2);
	}

}

public class Ex3 {
	public static void main(String[] args) {
		
	
	printClass3 pc1 = new printClass3<>();
	pc1.print(1.1,1.2);
	pc1.print(1,2);
	pc1.print("김","김변수");
	
	printClass3<Integer> pc2 = new printClass3<>() ;
	pc2.print(100, 200);
	
	printClass3<Double> pc3 = new printClass3<>() ;
	pc3.print(1.1, 1.2);
	}
}
