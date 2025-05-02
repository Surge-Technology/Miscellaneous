package CollectionProto;

import java.util.ArrayList;
public class ArrayListCompare
{
     public static void main(String [] args)
     {
          ArrayList<String> parentList= new ArrayList<String>();
          parentList.add("hi");
          parentList.add("How are you");
          parentList.add("Good Morning");
          parentList.add("bye");
          parentList.add("Good night");

          ArrayList<String> childList= new ArrayList<String>();
          childList.add("Howdy");
          childList.add("Good Evening");
          childList.add("bye");
          childList.add("Good night");
          
         
          //Storing the comparison output in ArrayList<String>
          ArrayList<String> resultList= new ArrayList<String>();
          for (String temp : parentList)
        	  resultList.add(childList.contains(temp) ? "Yes" : "No");
          System.out.println(resultList);


     }
}