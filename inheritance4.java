import static java.lang.System.out;
class A
{
	void show()
	{
	out.println("show A");
	}
}
interface B
{
	void show();
	void test();
}
class C extends A implements B
{
	public void show()
	{
	super.show();
	out.println("Interface B");
	}

	public void test()
	{
	out.println("test interface B");
	}

	void get()
	{
	out.println("get class C");
	}
}
class MainClass
{
	static public void main(String...ar)
	{
	C c=new C();
	c.show();
	c.get();
	c.test();
	}
}