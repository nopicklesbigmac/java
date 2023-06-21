package arrayLists;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
	      
	      list.add(123);
	      list.add(12);
	      list.add(123456);
	      
	      int data1 = list.get(0);
	      Integer data2 = list.get(1);
	     
	      
	      for(int i =0;i<list.size();i++) {
	    	 int data = list.get(i);
	         System.out.println(list.get(i));
	      }
	      System.out.println();
	      for (int data : list)
	    	  System.out.println(data);

	}

}
