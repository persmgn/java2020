package lesson2;

public class ChildLifeTEst extends LifeCycleTest {
	static final int	a = 100;
	static double		b = -3.5;
	
	int		c = 200;
	
	static {
		System.err.println("Child init");
	}
	
	//	public <init>() {
	//		super();
	//		c = 200;
	//		---------------------
	//		System.err.println("Child constr:");
	//	
	//	}

	public static void staticPrint() {
		System.err.println("Static print ChildLifeCycle "+a);
	}
	
	@Override
	public void print(/*LifeCycleTest this*/) {
		super.print();
		System.err.println("Print ChildLifeCycle "+x+", "+this.c);
	}
	
	public ChildLifeTEst() {
		super(12345);
		//		super();
		//		c = 200;
		//		---------------------
		//		System.err.println("Child constr:");
		System.err.println("::::");
	}
	
	{
		System.err.println("Child constr:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Child start");
		
		LifeCycleTest	clt1 = new ChildLifeTEst();
		
		clt1.staticPrint();
		clt1.print();
		
		//						VMT			this
		//	invokestatic 		-			-		static
		//	invokevirtual		+			+		
		//	invokespecial		-			+		constr, private
		//	invokeinterface		+			+
		//	invokedynamic
	}
}
