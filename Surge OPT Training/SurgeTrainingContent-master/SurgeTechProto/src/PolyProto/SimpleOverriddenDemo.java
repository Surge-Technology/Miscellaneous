package PolyProto;


	class college {
		int a=3;
		int c,d;
		
		 public void move() {
		  System.out.println("College is open");
		 }
		 
		 public void some(int b){
			 a=b;
			 System.out.println("this is b");
		 }
		 
//		 public void some(int c, int d){
//				System.out.println("second methos");
//		}
		 
		 
	}
	
	class univ extends college {
		int c,d;
		
		 public void move() {
		  System.out.println("University is open too");
		 }
	}
	
	public class SimpleOverriddenDemo {
		 public static void main(String args[]) {
			  college a = new college();
			  college b = new univ();
//			  a.some(2);
//			  a.some(2,3);
			  b.move();
			  a.move();
		 }
	}