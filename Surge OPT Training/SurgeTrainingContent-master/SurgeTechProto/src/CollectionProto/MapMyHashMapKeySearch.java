package CollectionProto;

import java.util.HashMap;

public class MapMyHashMapKeySearch {
     
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "Muralibabu");
        hm.put("second", "Lokesh");
        hm.put("third","Rajini");
        System.out.println(hm);
        if(hm.containsValue("Murali")){
            System.out.println("The hashmap contains value Murali");
        } else {
            System.out.println("The hashmap does not contains Murali12");
        }
        if(hm.containsKey("first")){
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first12");
        }
    }
}