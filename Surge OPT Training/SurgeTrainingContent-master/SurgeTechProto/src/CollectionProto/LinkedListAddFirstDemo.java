package CollectionProto;

import java.util.*;
public class LinkedListAddFirstDemo {
	public static void main(String[] args) {
	    // Creating LinkedList of String Elements
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    //Populating it with String values
	    linkedlist.add("AA");
	    linkedlist.add("BB");
	    linkedlist.add("CC");
	    linkedlist.add("DD");
	    linkedlist.add("EE");

	    //Displaying LinkedList elements
	    System.out.println(linkedlist);
	 
	    //Adding an element at the beginning 
	    linkedlist.addFirst("LAST");
	 
	    //Displaying the List after addition
	    System.out.println(linkedlist);
	 
	    //Adding an element at the end of list 
	    linkedlist.addLast("FIRST");
	 
	    //Displaying the final list
	    System.out.println(linkedlist);
	 }
}
