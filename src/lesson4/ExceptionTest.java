package lesson4;

import java.io.IOException;

public class ExceptionTest {
	enum Abcde {
		A,
		B,
		C,
		D,
		E,
		F;
	}

	/* dfdff */
	/**
	 * <p>Calculate arithmetic expression and return result</p>
	 * @param x left operand
	 * @param operator operator (availables are '+', '-', '*', '/')
	 * @param y right operand
	 * @return result of the operation
	 * @throws IllegalArgumentException if y = 0 and operator = '/' or operator not in '+','-','/','*'
	 * @throws UnsupportedOperationException 
	 */
	public static int calc(int x, char operator, int y) throws IllegalArgumentException, UnsupportedOperationException {
		if (operator == '/' && y == 0) {
			throw new IllegalArgumentException("Attempt to divide ["+x+"] by zero for '/' operator");
		}
		else {
			Abcde z = Abcde.A;
			String s;
			switch (z) {
				case A:
					break;
				case B:
					break;
				case C:
					break;
				case D:
					break;
				case E:
					break;
				default:
					throw new UnsupportedOperationException("Enum item ["+z+"] is not supported yet");
			}
			
			switch (operator) {
				case '+' : return x + y;
				case '-' : return x - y;
				case '*' : return x * y;
				case '/' : return x / y;
				default : 
throw new IllegalArgumentException("Unknown operator ["+operator+"]. Only '+','-','*','/' are available");
			}
		}
	}

	//	NullPointerException
	//	IllegalArgumentException
	//	IllegalStateException
	//  UnsupportedOperationException
	
	static void error(int errType) throws RuntimeException, Exception, Throwable {
		switch (errType) {
			case  0 :
				throw new RuntimeException("Rintime simulator");
			case  1 :
				throw new Exception("Exception simulator");
			case  2 :
				throw new Throwable("Throwable simulator");
			default :
				return;
		}
	}
		
	static void nestedError(int errType) throws Throwable {
		try{error(errType);
		} catch (Exception e) {
			throw new Throwable(e);
//			System.err.println("Nested catch: "+e.getLocalizedMessage());
		} finally {
			System.err.println("Nested finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("My error");

		calc(3,'+',5);
		
		t.printStackTrace();
//		
//		throw t;
//		
//		String s;
//		Throwable // checked
//			- Error // unchecked
//				-- // ...
//			- Exception // checked
//				-- RuntimeException // unchecked
//					--- 
//				-- // ...
			
		
		for (int index = 0; index <= 3; index++) {
			try{
				nestedError(index);
				System.err.println("Success");
			} catch (RuntimeException e) {
				System.err.println("Catch runtime: "+e.getLocalizedMessage()+", "+e.getCause());
			} catch (Exception e) {
				System.err.println("Catch exception: "+e.getLocalizedMessage()+", "+e.getCause());
			} catch (Throwable e) {
				System.err.println("Catch throwable: "+e.getLocalizedMessage()+", "+e.getCause());
				e.printStackTrace();
			} finally {
				System.err.println("Finally");
			}
		}
	}

}
