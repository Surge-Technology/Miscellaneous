package ConstructorProto;

public class DemoConstructor {
	
	int value1;
	int value2;

	DemoConstructor() {
		System.out.println("Inside Constructor");
		value1 = 10;
		value2 = 20;
		System.out.println("Exiting Constructor");
	}

	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
	}
	
	public static void main(String args[]) {
		DemoConstructor d1 = new DemoConstructor();
		d1.display();
		
		
		//DemoConstructor d2 = new DemoConstructor();
	}
	
	
	
	
	
	
	
	
	

}
