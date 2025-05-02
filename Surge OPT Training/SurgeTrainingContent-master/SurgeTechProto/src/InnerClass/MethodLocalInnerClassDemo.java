package InnerClass;


//Top level class definition
class MethodLocalInnerClassDemo {
	
	 public void display(){
	      int num = 23;
	      class Inner{
	         public void print() {
	            System.out.println("This is method inner class "+num);
	         }
	      }
	      Inner obj = new Inner();
	      obj.print();
	   }
	 
	 
	   public static void main(String args[]){
		   MethodLocalInnerClassDemo outer = new MethodLocalInnerClassDemo();
	      outer.display();
	   }
} // close Top level class