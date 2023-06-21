package arrayLists;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
	      ArrayList list = new ArrayList();
	      
	      list.add(123);
	      list.add(12.3);
	      list.add("string");
	      

	      int intData = (int)list.get(0);
	      double doubleData = (double)list.get(1);
	      String stringData = (String) list.get(2);
	      
	      for(int i =0;i<list.size();i++)
	         System.out.println(list.get(i));
	      
	      System.out.println();
	      for (Object o : list)
	    	  System.out.println(o);

	   }

	}

