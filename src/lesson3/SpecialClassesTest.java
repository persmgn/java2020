package lesson3;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnnotation(value=12345)
public class SpecialClassesTest {
	
	public int x = 100;

	public void print(/*this*/) {
		MyInterface	mi = new MyInterface() {
			static final int w = 100;
			int	z = 100;
			
			{
				System.err.println("Constructor");
			}
			@Override
			public void test() {
				System.err.println("Anon test "+x);
			}
		};
		
		Class	cl = mi.getClass();
		
		System.err.println("Constructors: "+Arrays.deepToString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.deepToString(cl.getDeclaredFields()));
		
		System.err.println("Annotation: "+SpecialClassesTest.class.getAnnotation(MyAnnotation.class));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	ic = InnerClass.class;
		
		System.err.println("Canonical name="+ic.getCanonicalName());
		System.err.println("Name="+ic.getName());
		
		System.err.println("Constructors: "+Arrays.toString(ic.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(ic.getDeclaredFields()));
		
		SpecialClassesTest	sct = new SpecialClassesTest();
		InnerClass	ii = sct.new InnerClass(/*sct*/); // new InnerClass(sct)
		InnerStaticClass isc = new InnerStaticClass();
		
		final int	abcde = 5;//(int)Math.sqrt(25);
		
		MyInterface	mi = new MyInterface() {
								// int val$abcde
								// MyInterface(int q){val$abcde = q;}
								static final int w = 100;
								int	z = 100;
								
								{
									System.err.println("Constructor");
								}
								@Override
								public void test() {
									System.err.println("Anon test "+/*val$abcde*/abcde/*5*/);
								}
							};
		Class		miClass = mi.getClass();
		
		System.err.println("Name="+miClass.getName());
		System.err.println("Constructors: "+Arrays.deepToString(miClass.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.deepToString(miClass.getDeclaredFields()));
		mi.test();
		
		sct.print();
		
		MyEnum	value = MyEnum.MONDAY;
		
		if (value == MyEnum.MONDAY) {
			
		}
		switch (value/*.ordinal()*/) {
			case MONDAY : // 0 = MONDAY.ordinal()
			case TUESDAY : // 1 = TUESDAY.ordinal();
			default :
		}
		
		Class	enumClass = SpecialClassesTest.class;
		
		System.err.println("Inner methods: "+Arrays.toString(enumClass.getDeclaredMethods()));
	}

	private class InnerClass {	// 15%
		// final SpecialClassesTest this$0
		// InnerClass(lesson3.SpecialClassesTest xxxxxxxx){this$0 = xxxxxxxx;}
//		static int z = 10;	// ConstValue
//		
//		static {
//			
//		}
		
		public void print() {
			System.err.println("X="+/*this$0.*/x);
		}
	}	

	private static class InnerStaticClass {	// 85%
		// final SpecialClassesTest this$0
		// InnerClass(lesson3.SpecialClassesTest xxxxxxxx){this$0 = xxxxxxxx;}
		public void print() {
			System.err.println("X=");
		}
	}	
}

@FunctionalInterface
interface MyInterface {
	void test();
	default void aaa() {
	}
}

class MyInterfaceImpl implements MyInterface {
	@Override
	public void test() {
		System.err.println("Call test");
	}
}

//class MyImpl implements MyAnnotation {
//
//	@Override
//	public Class<? extends Annotation> annotationType() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int value() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public String text() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//}