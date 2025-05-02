package AbstractionDemo;


class DemoDriverUser2Interface implements DemoInterface
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
    */
   public void method1()
   {
	System.out.println("DemoDriverUser2Interface implementation of method1");
   }
   public void method2()
   {
	System.out.println("DemoDriverUser2Interface implementation of method2");
   }
   public static void main(String arg[])
   {
	DemoInterface obj = new DemoDriverUser2Interface();
	
	obj.method1();
	obj.method2();
	//obj.age = 12;
   }
}