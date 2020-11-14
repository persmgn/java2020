package lesson3;

public /*final*/ enum MyEnum /*extends java.lang.Enum*/ {
	/*public static final MyEnum */SUNDAY("Это воскресенье") /* = new MyEnum("SUNDAY",0,"Это воскресенье")*/, 
	/*public static final MyEnum */MONDAY("Это понедельник") /* = new MyEnum("MONDAY",1,"Это понедельник")*/, 
	/*public static final MyEnum */TUESDAY("Это вторник") /* = new MyEnum("TUESDAY",2,"Это вторник")*/;
	
	private final String	comment;
	
	MyEnum(/*String name, int ordinal,*/String comment) {
		// super(name,ordinal);
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public int getRandom() {
		return (int)(1000*Math.random());
	}
}
