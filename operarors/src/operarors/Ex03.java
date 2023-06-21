package operarors;

public class Ex03 {
	public static void main(String[] args) {
	double do1 = 3.0, do2 = 3.1;
	System.out.println("do1 <= do2 크기 비교 : " + (do1 <= do2));
	System.out.println("do1 >= do2 크기 비교 : " + (do1 >= do2));
	System.out.println("do1 == do2 크기 비교 : " + (do1 == do2));
	System.out.println("do1 != do2 크기 비교 : " + (do1 != do2));
	
	boolean result = (do1 <= do2);
	System.out.println(result == true);
	System.out.println(result == false);
	}
}
