package DesignPattern;

//Lazy Initialization
public class SingletonClassDemo {

 // Static attribute.
 private static SingletonClassDemo instance = null;

 // Private constructor.
 private SingletonClassDemo() {

 }

 // Static function.
 public static  synchronized SingletonClassDemo getInstance() {
     // If there is no instance available, create new one (i.e. lazy initialization).
     if (instance == null) {
         instance = new SingletonClassDemo();
         System.out.println("Singleton Object Created:");
     }else{
    	 System.out.println("Singleton Object Reused:");
     }
     return instance;
 }
}