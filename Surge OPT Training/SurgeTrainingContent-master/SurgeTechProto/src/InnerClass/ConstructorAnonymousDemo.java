package InnerClass;


//Java program to illustrate defining a thread 
//Using Anonymous Inner class that define inside argument 
//https://www.geeksforgeeks.org/anonymous-inner-class-java/
class ConstructorAnonymousDemo 
{ 
	public static void main(String[] args) 
	{ 
		//Here we are using Anonymous Inner class 
		//that define inside argument, here constructor argument 
		Thread t = new Thread(new Runnable() 
		{ 
			public void run() 
			{ 
				System.out.println("Child Thread"); 
			} 
		}); 
		
		t.start(); 
		
		System.out.println("Main Thread"); 
	} 
} 
