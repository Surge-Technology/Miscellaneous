package AbstractionDemo;


abstract class Vehicle
{
   public abstract void engine();
   public abstract void tyre();
   
   public void engineNonAbstract()
   {
       System.out.println("engineNonAbstract method invoked");
   }
   
}
public class Car extends Vehicle {

    public void engine()
    {
        System.out.println("Car engine");
        //car engine implementation
    }
    public void tyre()
    {
        System.out.println("Car tyre");
        //car engine implementation
    }
    public void tyreDuplicate()
    {
        System.out.println("Car tyre");
        //car engine implementation
    }
    public static void main(String[] args)
    {
        Vehicle v = new Car();
        Car c = new Car();
        v.engine();
        v.tyre();
        v.engineNonAbstract();
    }
}