package ExceptionHandling;

public class ThrowsDemo {
	int division(int a, int b) throws ArithmeticException, NullPointerException {
		int t = a / b;
		return t;
	}

	public static void main(String args[]) {
		ThrowsDemo obj = new ThrowsDemo();
		try{
			int divResult = obj.division(15, 5);
			System.out.println("Div Result...:"+divResult);
		}catch(Exception e){
			System.out.println("Division Exception...please send good data.....");
		}
	

	}
}
