import static java.lang.System.out;
class NewThread extends Thread
{
	String name;
	NewThread(String name)
	{
	this.name=name;
	start();
	}
	public void run()
	{
	Implement.get(name);
	}
}
class Implement
{
	synchronized static void get(String str)
	{
	out.println(str+" started");
	try{
	Thread.sleep(500);
	}catch(InterruptedException ex)
	{}
	out.println(str+" ended");
	}
}
class Main
{
	static public void main(String...ar)
	{
	new NewThread("First Thread");
	new NewThread("Second Thread");
	}
}