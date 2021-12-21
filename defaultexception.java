class DefaultException
{
	public static void main(String...ar)
	{
	doStuff();
	}
	
	static void doStuff()
	{
	doMoreStuff();
	}
	
	static void doMoreStuff()
	{
	System.out.println(10/0);
	}

}