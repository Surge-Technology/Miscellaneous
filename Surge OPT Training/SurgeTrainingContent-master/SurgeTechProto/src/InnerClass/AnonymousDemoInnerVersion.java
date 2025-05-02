package InnerClass;


//Java program to demonstrate Anonymous inner class
//https://www.geeksforgeeks.org/anonymous-inner-class-java/
interface AgeInterface 
{ 
	int x = 21; 
	void getAge(); 
} 
class AnonymousDemoInnerVersion 
{ 
	public static void main(String[] args) { 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		AgeInterface oj1 = new AgeInterface() { 
			@Override
			public void getAge() { 
				// printing age 
				System.out.print("Age is "+x); 
			} 
		}; 
		oj1.getAge(); 
	} 
} 
