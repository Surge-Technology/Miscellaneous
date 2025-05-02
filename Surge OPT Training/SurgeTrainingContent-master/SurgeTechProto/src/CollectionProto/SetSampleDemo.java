package CollectionProto;
import java.util.*; 
import java.util.HashSet;

public class SetSampleDemo {
	public static void main(String[] args) {
        // Creating a HashSet
        Set<String> daysOfWeek = new HashSet<String>();
        
        List<String> daysOfWeekList = new ArrayList<String>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println(daysOfWeek.size());
        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");
        System.out.println(daysOfWeek.size());

        System.out.println(daysOfWeek);
        
        
        daysOfWeekList.add("Monday");
        daysOfWeekList.add("Tuesday");
        daysOfWeekList.add("Wednesday");
        daysOfWeekList.add("Thursday");
        daysOfWeekList.add("Friday");
        daysOfWeekList.add("Saturday");
        daysOfWeekList.add("Sunday");
        daysOfWeekList.add("Sunday");
        
        System.out.println("List Content:"+daysOfWeekList);
    }
}
