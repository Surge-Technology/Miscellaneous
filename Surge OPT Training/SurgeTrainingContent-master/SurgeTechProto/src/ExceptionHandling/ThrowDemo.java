package ExceptionHandling;

public class ThrowDemo {
	static int sum(int num1, int num2){
	      if (num1 == 0)
	         throw new ArithmeticException("First parameter is not valid");
	      
	      else
	         System.out.println("Both parameters are correct!!");
	      return num1+num2;
	   }
	static void parentCall(){
		System.out.println("parentCall statements");
	     try{
	 		int res=sum(0,12);
		      System.out.println(res);
	    	 
	     }catch(Exception e){
	    	 throw e;
	    	 //System.out.println("Thrown exception handled");
	    	 
	    	// e.printStackTrace();
	     }
	}
	   public static void main(String args[]){
	      //int res=sum(0,12);
	      //System.out.println(res);
		  parentCall();
	      //System.out.println("Continue Next statements");
	   }
}
