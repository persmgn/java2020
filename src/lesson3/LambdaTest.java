package lesson3;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call(new MyInterface() {
			@Override
			public void test() {
				System.err.println("Anon print");
			}
		});
		// invokedynamic	MethodHandle
		call(/*LambdaTest::lambda$0*/()->System.err.println("Lambda print"));
		
		Class	cl = LambdaTest.class;
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));

		LambdaTest	lt = new LambdaTest();
		MyInterface	mi = lt::abcde; 
		
		call(mi);
	}

	void print() {
		MyInterface	mi = this::abcde; 
	}
	
	void abcde() {
		System.err.println("Call abcde");
	}
	
	static void call(final MyInterface item) {
		item.test();
	}
	
	// private static void lambda$0(){System.err.println("Lambda print");}
}
