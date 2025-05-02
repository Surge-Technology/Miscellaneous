package CollectionProto;
import java.util.*;
public class SetLinkedHashSetManipulationDemo {
	
	
	public static void main(String args[]) {
		//1. Create LinkedHashSet
		LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<>();
		 
		//2. Add elements to LinkedHashSet
		LinkedHashSet.add("A");
		LinkedHashSet.add("B");
		LinkedHashSet.add("C");
		LinkedHashSet.add("D");
		LinkedHashSet.add("E");
		 
		System.out.println(LinkedHashSet);
		 
		//3. Check if element exists
		boolean found = LinkedHashSet.contains("murali");        //true
		System.out.println(found);
		 
		//4. Remove an element
		LinkedHashSet.remove("D");
		 
		//5. Iterate over values
		Iterator<String> itr = LinkedHashSet.iterator();
		 
		while(itr.hasNext())
		{
		    String value = itr.next();
		     
		    System.out.println("Value: " + value);
		}
		
		
		//Convert LinkedHashSet to Array Example
		LinkedHashSet<String> LinkedHashSetReff = new LinkedHashSet<>();
        
		LinkedHashSetReff.add("A");
		LinkedHashSetReff.add("B");
		LinkedHashSetReff.add("C");
		LinkedHashSetReff.add("D");
		LinkedHashSetReff.add("E");
		 
		String[] values = new String[LinkedHashSetReff.size()];
		 
		LinkedHashSetReff.toArray(values);
		 
		System.out.println(Arrays.toString(values));
		
		
	}
	

}
