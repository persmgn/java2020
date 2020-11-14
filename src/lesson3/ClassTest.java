package lesson3;

import java.lang.reflect.InvocationTargetException;

public class ClassTest /* extends java.lang.Object */ {
	public static int	x = 10;
	
	private int	y = 100;

	public static void print(int x) {
		System.err.println("X====="+x);
	}

	public void print(double x) {
		System.err.println("Non-static====="+x);
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		ClassTest	ct = new ClassTest();
		
		call(ct);
		
		System.err.println("X="+x);
		System.err.println("Y="+ct.y);
	}

	static void call(Object	obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		Class		cl = obj.getClass();
		
		System.err.println("Name="+cl.getName());
		System.err.println("Fields="+java.util.Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Super="+cl.getSuperclass());
		
		java.lang.reflect.Field	f = cl.getField("x");
		
		System.err.println("Field name="+f.getName());
		System.err.println("Field type="+f.getType());
		
		System.err.println("Field value="+f.getInt(null));
		f.setInt(null,20);

		java.lang.reflect.Field	fy = cl.getDeclaredField("y");
		
		System.err.println("Field name="+fy.getName());
		System.err.println("Field type="+fy.getType());
		
		System.err.println("Field value="+fy.getInt(obj));
		fy.setInt(obj,20);

		System.err.println("Methods="+java.util.Arrays.toString(cl.getDeclaredMethods()));
		
		java.lang.reflect.Method	m = cl.getDeclaredMethod("print", int.class);
		
		System.err.println("Name="+m.getName());
		System.err.println("Parameters="+java.util.Arrays.toString(m.getParameters()));
		System.err.println("Returned type="+m.getReturnType());	// void.class
		
		m.invoke(null,12345);

		java.lang.reflect.Method	md = cl.getDeclaredMethod("print", double.class);
		
		System.err.println("Name="+md.getName());
		System.err.println("Parameters="+java.util.Arrays.toString(md.getParameters()));
		System.err.println("Returned type="+md.getReturnType());	// void.class
		
		md.invoke(obj,12345);
		
		System.err.println("Constructors="+java.util.Arrays.toString(cl.getDeclaredConstructors()));
		
		java.lang.reflect.Constructor	c = cl.getDeclaredConstructor();

		System.err.println("Name="+c.getName());
		System.err.println("Parameters="+java.util.Arrays.toString(c.getParameters()));
		
		Object	newObject = c.newInstance();
		
		System.err.println("Created: "+newObject);
	}

}

