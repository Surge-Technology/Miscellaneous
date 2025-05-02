package CollectionProto;

import java.util.HashMap;

public class MapMyHashMapCopy {
 
    public static void main(String a[]){
        HashMap<String, String> parentMap = new HashMap<String, String>();
        //add key-value pair to hashmap
        parentMap.put("first", "FIRST INSERTED");
        parentMap.put("second", "SECOND INSERTED");
        parentMap.put("third","THIRD INSERTED");
        System.out.println(parentMap);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        parentMap.putAll(subMap);
        System.out.println(parentMap);
    }
}
