package CollectionProto;

import java.util.LinkedList;

public class LinkedListPushAndPopDemo {
 
    public static void main(String a[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        arrl.push("push element");
        System.out.println("After push operation:");
        System.out.println(arrl);
        
        System.out.println("Before pop operation:");
        System.out.println(arrl);
        arrl.pop();
        System.out.println("After first pop operation:");
        System.out.println(arrl);
        arrl.pop();
        System.out.println("After second pop operation:");
        System.out.println(arrl);
    }
}
