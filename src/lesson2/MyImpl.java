package lesson2;

public class MyImpl implements TotalInterface, Marker {	
	// [print(), call()] U [call(), test()] = [print(), call(), test()] 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface		mi = new MyImpl(); 
		MyINterface2	mi2 = new MyImpl(); 
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
