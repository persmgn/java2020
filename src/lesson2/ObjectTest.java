package lesson2;

public class ObjectTest {
	public int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	obj = new Object(), obj1 = new Object();
		
		System.err.println("? "+(obj != obj1));
		
		System.err.println(new ObjectTest());
	}

	@Override
	public String toString() {
		return "ObjectTest [x=" + x + "]";
	}
	
	
}
