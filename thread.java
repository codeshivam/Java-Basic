import static java.lang.System.out;
class NewThread extends Thread
{
	String name;
	NewThread(String name)
	{
	this.name=name;
	start();//always search the run method
	}
	public void run()
	{
	Operation.get(name);
	}
}
class Operation
{
	static void get(String name)
	{
	out.println(name+"started");
	try{
	Thread.sleep(500);
	}catch(InterruptedException ex){
	}
	out.println(name+" ended");
	}
}
class Main
{
	static public void main(String... ar)throws Exception
	{
	NewThread th1=new NewThread("First Thread");
	th1.join();
	NewThread th2=new NewThread("Second Thread");
	}
}