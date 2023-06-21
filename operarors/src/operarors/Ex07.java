package operarors;

public class Ex07 {

	public static void main(String[] args) {
		
//		int data =10;
//		String result = (data > 10 || data < 5)?"참일때 반환 할 문장":"거짓일때 반환 할 문장";
		
		
		int data =8;
		String s = (data %2 == 0 ) ? "짝수":"홀수";
		System.out.println(data+ "= "+s);
		data=9;
		s= (data %2 == 0)? "짝수":"홀수";
		System.out.println(data+ "="+s);
	}

}
