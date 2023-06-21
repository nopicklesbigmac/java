package arrayLists;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
	      
	      list.add(1.1);
	      list.add(1.2);
	      list.add(123.456);
	     
	      
	      for(int i =0;i<list.size();i++) {
	    	  Double data = list.get(i);
	         System.out.println(list.get(i));
	      }
	      System.out.println();
	      for (Double data : list)
	    	  System.out.println(data);

	}

}
