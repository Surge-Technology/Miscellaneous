package PolyProto;

class DisplayOverloading {
	
	
	public void display(char c) {
		System.out.println(c);
	}
	
	public void display(char c, int num) {
		System.out.println(c + " hello " + num);
	}
	
	public void display(int num, char c) {
		System.out.println(c + "display " + num);
	}
	
	
	public static void main(String args[]) {
		DisplayOverloading obj = new DisplayOverloading();
		//obj.display('a');
		obj.display('a', 10);
		obj.display(100,'M');
	}
}

