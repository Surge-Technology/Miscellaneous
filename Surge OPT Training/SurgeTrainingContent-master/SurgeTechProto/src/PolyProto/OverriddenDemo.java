package PolyProto;




//A Java program to illustrate Dynamic Method 
//Dispatch using hierarchical inheritance 
class A 
{ 
 public void add(int a, int b, int c) 
 { 
     int d = a+b+c;
	 System.out.println("Inside A's m1 method:"+d); 
 } 
} 

class B extends A 
{ 
 // overriding m1() 
	public void add(int a, int b, int c) 
	 { 
	     int d = c+a+b;
		 System.out.println("Inside B's m1 method:"+d); 
	 }
} 

class C extends A 
{ 
 // overriding m1() 
	public void add(int a, int b, int c) 
	 { 
	     int d = b+c+a;
		 System.out.println("Inside C's m1 method:"+d); 
	 }
} 

//Driver class 
class OverriddenDemo 
{ 
 public static void main(String args[]) 
 { 
//     // object of type A 
     //A reffOfTypeA = new A(); 
//
//     // object of type B 
    // B reffOfTypeB = new B(); 
    // C reffOfTypeC = new C(); 
//
//     // object of type C 
//     C c = new C(); 
     
     //A reffOfTypeA = new B();
     
    
//     reffOfTypeA.add(2,3,4);
//     reffOfTypeB.add(2,3,4);
//     reffOfTypeC.add(2,3,4);
     
	 A reffOfTypeA = new C();
     
	 reffOfTypeA.add(2,3,4);
     
     

//     // obtain a reference of type A 
//     A ref; 
//       
//     // ref refers to an A object 
//     ref = a; 
//
//     // calling A's version of m1() 
//     ref.m1(); 
//
//     // now ref refers to a B object 
//     ref = b; 
//
//     // calling B's version of m1() 
//     ref.m1(); 
//
//     // now ref refers to a C object 
//     ref = c; 
//
//     // calling C's version of m1() 
//     ref.m1(); 
 } 
} 
