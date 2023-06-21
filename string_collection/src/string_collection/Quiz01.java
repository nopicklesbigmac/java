package string_collection;

public class Quiz01 {
	public static void main(String[] args) {
		String data = "Have a nice day Have a nice dat Have a nice day";
		int[] indexs = new int[data.length()];
		System.out.print("결과: ");
		int index=0;
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) == 'a') {
				indexs[index++] = i;
				System.out.print(i + " ");//배열x
			}
		}
		System.out.println();
		System.out.print("결과: ");
		for(int i = 0; i <index; i++) {
			System.out.print(indexs[i] + " ");//배열o
		}
		System.out.println();
		
		data = "It is a fun java programming";
		int idx;
		String[] ag = data.split(" ");
		int count = 0,acount=0,gcount=0,scount=0;
		for(int i = 0; i < ag.length; i++) {
			for(int j = 0; j < ag[i].length(); j++) {
				if(ag[i].charAt(j) == 'a')
					acount++;
				else if (ag[i].charAt(j) == 'g') 
					gcount++;
				else 
					count++;
			}
		}
		System.out.println("a :"+acount);
		System.out.println("g :"+gcount);
		System.out.println("나머지 문자 개수 :"+count);
		System.out.println("총 문자 개수 :"+data.length());
		
	}

}