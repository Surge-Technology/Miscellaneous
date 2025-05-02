package AbstractionDemo;

abstract class parentBaseAbstract {
	abstract void callme();
	
}

class BaseAbstract extends parentBaseAbstract {
	void callme() {
		System.out.println("this is changed callme.");
	}

	public static void main(String[] args) {
		BaseAbstract b = new BaseAbstract();
		String name = "hello";
		b.callme();
	}
}
