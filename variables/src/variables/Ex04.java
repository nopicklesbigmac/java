package variables;

public class Ex04 {
	public static void main(String[] args) {
		int data = 123, result;
		char ch = 'D';
 
		data =  data + 10; // 123 + 10
		ch = 'D' + 3; // 'G' or 71
		result = data + ch; // 133 + 71
		System.out.println("data = " + data);
		System.out.println("ch = " + ch);
		System.out.println("ch = " + (int)ch);
		System.out.println("result : " + result);
	}
}
