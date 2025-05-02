package CollectionProto;

import java.util.*;
public class LinkedListToArrayDemo {
	
	public static void main(String[] args)
    {
		LinkedList<String> linkedList = new LinkedList<>();
	    
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		 
		//1. LinkedList to Array
		String array[] = new String[linkedList.size()];
		linkedList.toArray(array);
		 
		System.out.println(Arrays.toString(array));
		 
		//2. Array to LinkedList
		LinkedList<String> linkedListNew = new LinkedList<>(Arrays.asList(array));
		 
		System.out.println(linkedListNew);
		
    }
	
	

}
