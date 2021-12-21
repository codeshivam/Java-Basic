//thread without constructor and without static method.




import static java.lang.System.out;
class NewThread extends Thread
{
	String name;
	void set(String name)
	{
	this.name=name;
	start();
	}
	public void run()
	{
	Operation.get(name);//for static get method
	//new Operation().get(name);
	}
}
class Operation
{
	static void get(String name)
	//void get(String name)
	{
	out.println(name+" started");
	try{
	Thread.sleep(500);
	}catch(InterruptedException ex)
	{}
	out.println(name+" ended");
	}
}
class Main
{
	static public void main(String...ar)throws Exception
	{
	NewThread th1=new NewThread();
	NewThread th2=new NewThread();
	th1.set("First thread");
	th2.set("Second thread");
	}
}