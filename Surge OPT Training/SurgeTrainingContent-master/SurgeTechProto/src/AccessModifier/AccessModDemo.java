package AccessModifier;



 

class AccessModDemo 
{ 
private void display() 
	{ 
		System.out.println("GeeksforGeeks"); 
	} 
} 

class B 
{ 
public static void main(String args[]) 
	{ 
	AccessModDemo obj = new AccessModDemo(); 
		//trying to access private method of another class 
		//obj.display(); 
	} 
} 
