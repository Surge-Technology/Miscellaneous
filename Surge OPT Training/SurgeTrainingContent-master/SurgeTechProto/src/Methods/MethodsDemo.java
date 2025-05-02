package Methods;

public class MethodsDemo {
    int sum = 0; 
    
    public int addTwoInt(int a, int b){ 
          
        // adding two integer value. 
        sum = a + b; 
          
        //returning summation of two values. 
        return sum;  
    } 
	
	public static void main (String[] args) { 
      
        // creating an instance of Addition class  
		MethodsDemo addInstance = new MethodsDemo(); 
		MethodsDemo anotherInstance = new MethodsDemo();
        // calling addTwoInt() method to add two integer using instance created 
        // in above step. 
        int s = addInstance.addTwoInt(1,2); 
      System.out.println("Sum of two integer values :"+ s); 
      System.out.println(addInstance.hashCode());
      System.out.println(anotherInstance.hashCode());
          
    }
}



