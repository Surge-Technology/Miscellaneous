package CollectionProto;
import java.util.*;

public class LinkedListSortDemo {
	public static void main(String[] args)
    {
		LinkedList<String> linkedList = new LinkedList<>();
		 
		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");
		linkedList.add("D");
		 
		//Unsorted
		System.out.println(linkedList);
		 
		//1. Sort the list
		Collections.sort(linkedList);
		 
		//Sorted
		System.out.println(linkedList);
		 
		//2. Custom sorting
		Collections.sort(linkedList, Collections.reverseOrder());
		 
		//Custom sorted
		System.out.println(linkedList);
    }
}
