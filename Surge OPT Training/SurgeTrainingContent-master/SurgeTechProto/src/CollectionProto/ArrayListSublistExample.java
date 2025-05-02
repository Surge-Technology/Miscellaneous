package CollectionProto;

import java.util.ArrayList;
import java.util.List;
public class ArrayListSublistExample {

 public static void main(String a[]){
     ArrayList<String> parentList = new ArrayList<String>();
     


     //Addition of elements in ArrayList
     
     parentList.add("Steve");
     parentList.add("Justin");
     parentList.add("Ajeet");
     parentList.add("John");
     parentList.add("Arnold");
     parentList.add("Chaitanya");

     System.out.println("Original ArrayList Content: "+parentList);

     //Sublist to ArrayList
    // ArrayList<String> al2 = new ArrayList<String>(parentList.subList(1, 8));
     //System.out.println("SubList stored in ArrayList: "+al2);

     //Sublist to List
     List<String> list = parentList.subList(1, 4);
     System.out.println("SubList stored in List: "+list);
  }
}
