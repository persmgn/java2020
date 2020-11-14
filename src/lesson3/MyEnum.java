package lesson3;

public /*final*/ enum MyEnum /*extends java.lang.Enum*/ {
	/*public static final MyEnum */SUNDAY("��� �����������") /* = new MyEnum("SUNDAY",0,"��� �����������")*/, 
	/*public static final MyEnum */MONDAY("��� �����������") /* = new MyEnum("MONDAY",1,"��� �����������")*/, 
	/*public static final MyEnum */TUESDAY("��� �������") /* = new MyEnum("TUESDAY",2,"��� �������")*/;
	
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
