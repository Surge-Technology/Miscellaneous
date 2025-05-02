package CollectionProto;

import java.util.*;

 
public class LinkedListSimpleDemo {
 
	public static void main(String[] args)
    {
        //Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
         
        System.out.println(linkedList);
        System.out.println(arrayList);
         
        //Add elements at specified position
        linkedList.add(3, "AA");
        linkedList.add(4, "BB");
        linkedList.add(5, "CC");
        
        arrayList.add(3, "AA");
        arrayList.add(4, "BB");
        arrayList.add(5, "CC");
  
      // System.out.println(linkedList);
        //System.out.println(arrayList);
         
        //Remove element
        linkedList.remove("A");     //removes A
        linkedList.remove(0);       //removes B
         
      // System.out.println(linkedList);
         
//        //Iterate
//        ListIterator<String> itrator = linkedList.listIterator();
// 
//        while (itrator.hasNext()) {
//            System.out.println(itrator.next());
//        }
    }
 
}