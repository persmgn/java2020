package lesson4;

import java.util.HashSet;
import java.util.Set;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>		s = new HashSet<>();
		
		System.err.println("contains? "+s.contains("My string"));
		s.add("My string");
		System.err.println("contains? "+s.contains("My string"));
//		s.add(new Integer(10));
		for (String item : s) {
//			String	aaa = (String)item;
			
			System.err.println("COntent: "+item/*aaa*/);
		}
		
		MyClass<String,Integer>		mc1 = new MyClass<>(/*(String)*/"vassya");
		MyClass<Integer,Integer>	mc2 = new MyClass<>(/*(Integer)*/123);
		
		int		x = /*(Integer)*/mc2.getValue();
		
	}
}

class MyClass<T,Y extends Number> {
	T	value;		// Object value;
	Y   sign;		// Number sign;
	
	MyClass(T value) {
		this.value = value;
	}
	
	T getValue() {
		return value;
	}
	
	Y getSign() {
		return sign;
	}
	
	void setSign(Y newSign) {
		sign = newSign;
	}
}


