package lesson2;

public abstract class CallTest {

	public abstract void call();

	public void test() {
		call();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		print(12345);
		System.err.println("Sum="+sum(3,5));

		int[]	x = {10};
		print(x);
		System.err.println("X[0]="+x[0]);
				CallTest	ct = new CallTest();
	}
	
	static void print() {
		System.err.println("print()");
	}

	static void print(int x) {
		System.err.println("print("+x+")");
	}

	static void print(int[] x) {
		System.err.println("print("+x[0]+")");
		x[0] = 1234567;
	}
	
	static int sum(int x, int y) {
		return x + y;
	}
}
