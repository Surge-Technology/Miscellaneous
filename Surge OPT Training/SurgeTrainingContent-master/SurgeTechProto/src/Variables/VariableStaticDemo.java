package Variables;

public class VariableStaticDemo
{
	   static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   public static void main(String args[])
	   {
		   VariableStaticDemo obj1=new VariableStaticDemo();
		   VariableStaticDemo obj2=new VariableStaticDemo();
	       obj1.increment();
	       System.out.println("Obj1: count is="+obj1.count);
	       obj2.increment();
	       
	       System.out.println("Obj2: count is="+obj2.count);
	   }
	}

