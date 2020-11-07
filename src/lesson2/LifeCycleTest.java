package lesson2;

public class LifeCycleTest {
	static final int	x = 10;		// 'ConstValue'
	static int			y = 12345;	// 'Code'

	int	z = 20;
	
	public void newMethod() {
	}
	
	//	public static void <clinit>() {
	//		y = 12345;
	//	---------------------------------
	//		System.err.println("abcdejhfgkljdfgjk");
	//	}
	
	//	public <init>() {
	//		super();
	//		z = 20; 
	//		-------------
	//		System.err.println("12344566 ");
	//	}

	public LifeCycleTest() {	// <init>
		this(1245);
		//		super();
		// z = 20;
		//		-------------
		//		System.err.println("12344566 ");
		System.err.println("my constructor");
	}
	
	public LifeCycleTest(int varX) {	// <init>
		//		super();
		// z = 20;
		//		-------------
		//		System.err.println("12344566 ");
//		System.err.println("my constructor");
		z = varX;
//		System.err.println("my constructor");
	}

	
	static {
		System.err.println("abcdejhfgkljdfgjk");
	}
	
	{
		System.err.println("12344566 ");
	}
	
	public static void staticPrint() {
		System.err.println("Static print LifeCycle "+x);
	}
	
	public void print(/*LifeCycleTest this*/) {
		System.err.println("Print LifeCycle "+x+", "+this.z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
//		LifeCycleTest	&lct1;
		
		LifeCycleTest	lct1 = new LifeCycleTest();	// Object 1 
		LifeCycleTest	lct2 = lct1; 
		LifeCycleTest	lct3 = new LifeCycleTest(123445);
		
		lct1.staticPrint();	// LifeCycleTest.staticPrint();
		lct1.print(/*lct1*/);
		lct3.print(/*lct3*/);
		
		lct1 = null;
		lct2 = null;
		// Object 1 - to delete
	}

}
