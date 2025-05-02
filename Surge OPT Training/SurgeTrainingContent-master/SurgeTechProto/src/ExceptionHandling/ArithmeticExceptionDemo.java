package ExceptionHandling;

public class ArithmeticExceptionDemo {
	public static void main(String args[])
	   {
	      try{
	         int num1=15, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	      catch(NullPointerException e){
		         System.out.println ("You Shouldn't divide a number by zero");
		  }
	   }
}
