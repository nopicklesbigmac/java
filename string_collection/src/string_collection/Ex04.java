package string_collection;

public class Ex04 {
	public static void main(String[] args) {
		String str = new String(" Have a nice day ");
		String result = str.trim();
		System.out.println("--"+str+"--");
		System.out.println("--"+result+"--");
		String[] split = result.split(" ");
		for(int i = 0;i<split.length;i++) {
			System.out.println(split[i]);
				
		}
		String replace = result.replace(" ", 
		"^");
		System.out.println("replace : "+ replace);
		}
}
