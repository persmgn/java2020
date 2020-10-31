package lesson1;

//import java.lang.*;
//import lesson1.*;

public class HelloWorld /*extends java.lang.Object*/ {
	// private 
	// ---------
	// protected
	// public 
	
	public static int x = 10;
	
	public int y = 20;
	
	protected int x() {
		return 1;
	}

	protected static int y() {
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world ");
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
		
		while (i2 > 0) {
			System.err.println("ekjdjks");
			i2--;
		}
		
		do {				// repeat
			System.err.println("459049094509");
			i2--;
		} while (i2 > 0);	// until
		
		for (int index = 0; index < 10; index++) {
			System.err.println("i="+index);
		}
		// int index = 0;
		// while (index < 10) {
		//		System.err.println("i="+index);
		//		index++;
		// }
		
		while (true) {
			if (i2 % 2 == 0) {
				break;
			}
			else {
				i2--;
			}
		}
		// --> break

		// --> continue
		while (true) {
			if (i2 % 2 == 0) {
				continue;
			}
			else {
				break;
			}
		}

		for (int index = 0; index < 10; /*--->continue*/ index++) {
			continue;
		}

L1:		for (int index = 0; index < 10; index++) {
			for (int inner = 0; inner < 10; inner++) {
				if (index == inner) {
					break L1;
				}
			}
		}
		// ---> break L1;

L1:		for (int index = 0; index < 10; /*--->continue L1*/index++) {
			for (int inner = 0; inner < 10; inner++) {
				if (index == inner) {
					continue L1;
				}
			}
		}

		switch (i1) {
			case 0 :
				System.err.println("was 0");
				break;
			case 10 :
				System.err.println("was 10");
				break;
			case -321 :
				System.err.println("was -321");
				break;
			default :
				System.err.println("was otherwise");
		}
		// ---> break
		
		return;
	}  
}


class MyClass extends HelloWorld {
	
}