package CollectionProto;

import java.util.*;

public class ArrayAddAll {
	public static void main(String[] args) {

	    /* Array Declaration and initialization*/
	    String array[]={"Hi", "Hello", "Howdy", "Bye"};

	    /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    
	    
	    /*Conversion*/
	    Collections.addAll(arraylist, array);
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	 	
	 	
	    }
	    
	    System.out.println("***************************************");
	    /*Adding new elements to the converted List*/
	    arraylist.add("String1");
	    arraylist.add("String2");

	    /*Display array list*/
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
	}
}
