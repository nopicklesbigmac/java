package string_collection;

public class Ex03 {

	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println("영어 " + str.length());
		str= "김변수";
		System.out.println("한글 " + str.length());
		str = "abcdefg";
		
		
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(0) == 'a');
		System.out.println(str.charAt(0) == 'c');
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		String addStr;
		addStr="a";
		System.out.println(addStr);
		addStr+="b";
		System.out.println(addStr);
		}

}
