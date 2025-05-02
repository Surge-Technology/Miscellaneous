package Variables;


public class LocalVariableDemo 
{ 
    public void StudentAge()  
    {   //local variable age 
        int age = 0; 
        age = age + 5; 
        System.out.println("Student age is : " + age); 
    } 
  
    public static void main(String args[]) 
    { 
    	LocalVariableDemo obj = new LocalVariableDemo(); 
        obj.StudentAge(); 
    } 
} 