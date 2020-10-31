package lesson1;

//import java.lang.*;
//import lesson1.*;

public class HelloWorld /*extends java.lang.Object*/ {
	// private 
	// ---------
	// protected
	// public 
	
	public int x = 10;
	
	protected void x() {
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
		// Примитивные типы:
		// - группа целых чисел
		// -- byte		~signed char		-128..127
		// -- short		~signed short		-32768..32767
		// -- int		~signed int			-2^31..2^31
		// -- long		~signed long		-2^63..2^63
		// -- char		~unsigned short		0..65535
		// - группа вещественных чисел IEEE754
		// -- float		~float				10+/-38 6 знаков
		// -- double	~double				10+/-306 15 знаков
		// - особый тип
		// -- boolean	~int 0 или 1
		byte	b1 = 10, b2 = 20, b3 = (byte)(b1 + b2);
		
		int		i1 = 10, i2 = 20, i3 = b1 + b2;
		
		System.err.println("i1+i2="+(i1+i2));
		System.err.println("i1-i2="+(i1-i2));
		System.err.println("i1*i2="+(i1*i2));
		System.err.println("i1/i2="+(i1/i2));
		System.err.println("i1%i2="+(i1%i2));
		
		System.err.println("i1|i2="+(i1|i2));	// float / double не поддерживается
		System.err.println("i1&i2="+(i1&i2));
		System.err.println("i1^i2="+(i1^i2));
		System.err.println("~i1"+(~i1));
		
		System.err.println("i1>i2="+(i1>i2));
		System.err.println("i1>=i2="+(i1>=i2));
		System.err.println("i1<i2="+(i1<i2));
		System.err.println("i1<=i2="+(i1<=i2));
		System.err.println("i1==i2="+(i1==i2));
		System.err.println("i1!=i2="+(i1!=i2));
		
		i3 = (i2 = (i1 = i2 + i3));
		i3 += 10;	// i3 = i3 + 10;
		i2 ^= i1;	// i2 = i2 ^ i1;
		
		if (i2 == 5) {	// begin
			System.err.println("sdfjklsdjfkjsdl");
			if (i2 == 5) {	// begin
				System.err.println("sdfjklsdjfkjsdl");
			} // end
		}			
		else { // begin
			System.err.println("1212");
		} // end
	}  
}


class MyClass extends HelloWorld {
	
}