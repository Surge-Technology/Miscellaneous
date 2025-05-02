package CollectionProto;

import java.util.ArrayList;

public class ArrayListDemo {
	   public static void main(String[] args) {

	      ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      
	     // ArrayList arrlist1 = new ArrayList();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);
	      arrlist.add(100);
	      arrlist.add(1000);
	      arrlist.add(1000);
	      
	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Integer num : arrlist) { 		      
	           System.out.println(num); 		
	      }

	      /* For Loop for iterating ArrayList */
//	      System.out.println("For Loop");
//	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
//	          //System.out.println(arrlist.get(counter)); 		
//	      }   		

	     
//
//	      /* While Loop for iterating ArrayList*/ 		
//	      System.out.println("While Loop"); 		
//	      int count = 0; 		
//	      while (arrlist.size() > count) {
//		 //System.out.println(arrlist.get(count));
//	         count++;
//	      }
//
//	      /*Looping Array List using Iterator*/
//	      System.out.println("Iterator");
//	      Iterator iter = arrlist.iterator();
//	      while (iter.hasNext()) {
//	         //System.out.println(iter.next());
//	      }
	   }
	}


