package lesson2;

public /*abstract*/ interface MyInterface {
	/*public static final*/ int	x = 10;
	/*public abstract*/void print();
	/*public abstract*/void call();
	default /*public abstract*/ void newMethod(/*this*/) {
		
	}

	/*public*/ static void myMethod() {	// 1.8
		System.err.println();
		
	}
	
	private void myInternal(/*this*/) {	// 9
		
	}
}
