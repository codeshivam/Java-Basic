class DefaultException
{
	public static void main(String...ar)
	{
	doStuff();
	}
	
	static void doStuff()
	{
	doMoreStuff();
	System.out.println(10/0);
	}
	
	static void doMoreStuff()
	{
	System.out.println("Default exception");
	}

}