package AbstractionDemo;


class DemoDriverUser1Interface implements DemoInterface
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
    */
   public void method1()
   {
	System.out.println("DemoDriverUser1Interface implementation of method1");
   }
   public void method2()
   {
	System.out.println("DemoDriverUser1Interface implementation of method2");
   }
   
   public void add(int a, int b){
	   System.out.println("add called");
   }
   public static void main(String arg[])
   {
	DemoInterface obj = new DemoDriverUser1Interface();
	obj.method1();
	obj.method2();
	//obj.age = 12;
   }
}