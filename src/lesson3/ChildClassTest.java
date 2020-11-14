package lesson3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ChildClassTest extends ClassTest implements Cloneable {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		ChildClassTest	cct = new ChildClassTest();
		
		call(cct);
//		call(new ChildClassTest[] {cct});
		System.err.println("sum="+sum(cct));
	}

	static void call(Object	obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		Class		cl = obj.getClass();
		
		System.err.println("Canonical name: "+cl.getCanonicalName());
		System.err.println("Modifiers: "+Modifier.isPublic(cl.getModifiers()));
		System.err.println("Modifiers: "+Modifier.isAbstract(cl.getModifiers()));
		System.err.println("Interfaces: "+Arrays.toString(cl.getInterfaces()));
		
		System.err.println("isPrimitive: "+cl.isPrimitive());
		System.err.println("isPrimitive: "+int.class.isPrimitive());
		
//		System.err.println("isArray: "+cl.isArray());
//		System.err.println("contains: "+cl.getComponentType());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		System.err.println("Name="+cl.getName());
		System.err.println("Fields="+java.util.Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Super="+cl.getSuperclass());
		
		java.lang.reflect.Field	f = cl.getField("x");
		
		System.err.println("Field name="+f.getName());
		System.err.println("Field type="+f.getType());
		
		System.err.println("Field value="+f.getInt(null));
		f.setInt(null,20);

		java.lang.reflect.Field	fy = cl.getSuperclass().getDeclaredField("y");
		
		System.err.println("Field name="+fy.getName());
		System.err.println("Field type="+fy.getType());
		
		fy.setAccessible(true);		
		System.err.println("Field value="+fy.getInt(obj));
		fy.setInt(obj,20);

		System.err.println("Methods="+java.util.Arrays.toString(cl.getDeclaredMethods()));
		
		java.lang.reflect.Method	m = cl.getSuperclass().getDeclaredMethod("print", int.class);
		
		System.err.println("Name="+m.getName());
		System.err.println("Parameters="+java.util.Arrays.toString(m.getParameters()));
		System.err.println("Returned type="+m.getReturnType());	// void.class
		
		m.invoke(null,12345);

		java.lang.reflect.Method	md = cl.getSuperclass().getDeclaredMethod("print", double.class);
		
		System.err.println("Name="+md.getName());
		System.err.println("Parameters="+java.util.Arrays.toString(md.getParameters()));
		System.err.println("Returned type="+md.getReturnType());	// void.class
		
		md.invoke(obj,12345);
		
		System.err.println("Constructors="+java.util.Arrays.toString(cl.getDeclaredConstructors()));
		
		java.lang.reflect.Constructor	c = cl.getDeclaredConstructor();

		System.err.println("Name="+c.getName());
		System.err.println("Parameters="+java.util.Arrays.toString(c.getParameters()));
		
		Object	newObject = c.newInstance();
		
		System.err.println("Created: "+newObject);*/
	}
	
	static int sum(Object obj) throws IllegalArgumentException, IllegalAccessException {
		int sum = 0;
		
		Class current = obj.getClass();
		
		while (current != null) {
			for (Field f : current.getDeclaredFields()) {
				if (f.getType() == int.class) {
					f.setAccessible(true);
					sum += f.getInt(obj);
				}
			}
			current = current.getSuperclass();
		}
		return sum;
	}
}
