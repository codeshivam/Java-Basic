class DefaultException
{
	public static void main(String...ar)
	{
	doStuff();
	System.out.println(10/0);
	}
	
	static void doStuff()
	{
	doMoreStuff();
	System.out.println("do stuff");
	}
	
	static void doMoreStuff()
	{
	System.out.println("Default exception");
	}

}