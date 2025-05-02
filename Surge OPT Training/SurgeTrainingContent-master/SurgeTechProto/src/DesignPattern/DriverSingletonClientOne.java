package DesignPattern;

public class DriverSingletonClientOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClassDemo singletonClassDemoObj = SingletonClassDemo.getInstance();
		System.out.println("From DriverSingletonClientOne:"+singletonClassDemoObj.hashCode());
		
		SingletonClassDemo singletonClassDemoObj1 = SingletonClassDemo.getInstance();
		System.out.println("From DriverSingletonClientTwo:"+singletonClassDemoObj.hashCode());
	}

}
