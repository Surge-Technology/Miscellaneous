package InnerClass;


class InnerClassInstanceDemo {
	   private int x= 1;
	   public void innerInstance()
	   {
	       MyInnerClassDemo inner = new MyInnerClassDemo();
	       inner. seeOuter();
	   }
	   public static void main(String args[]){
		   InnerClassInstanceDemo obj = new InnerClassInstanceDemo();
	       obj.innerInstance();
	   }
	   
	   /*public static void main(String args[]){
		   InnerClassInstanceDemo.MyInnerClassDemo inner = new InnerClassInstanceDemo().new MyInnerClassDemo();
		   inner. seeOuter();
		}	*/   
	   
	   
	   
	   // inner class definition
	   class MyInnerClassDemo {
	       public void seeOuter () {
	          System.out.println("Outer Value of x is :" + x);
	       }
	   } // close inner class definition	   
	} // close Top level class definition