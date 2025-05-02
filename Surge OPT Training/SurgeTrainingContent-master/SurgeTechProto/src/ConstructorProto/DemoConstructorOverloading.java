package ConstructorProto;

public class DemoConstructorOverloading {
    int  value1;
    int  value2;
    DemoConstructorOverloading(){
     value1 = 10;
     value2 = 20;
     System.out.println("Inside 1st Constructor");
   }
    DemoConstructorOverloading(int a){
    value1 = a;
    System.out.println("Inside 2nd Constructor");
  }
 DemoConstructorOverloading(int a,int b){
  value1 = a;
  value2 = b;
  System.out.println("Inside 3rd Constructor");
 }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}
public static void main(String args[]){
	DemoConstructorOverloading d1 = new DemoConstructorOverloading();
	DemoConstructorOverloading d2 = new DemoConstructorOverloading(30);
	DemoConstructorOverloading d3 = new DemoConstructorOverloading(30,40);
  //d1.display();
  d2.display();
  d3.display();
}
}

