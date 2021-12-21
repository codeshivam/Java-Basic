import static java.lang.System.out;
class A
{
	void show()
	{
	out.println("show A");
	}
}
class B extends A
{
	void show()
	{
	out.println("show B");
	}
}
class C extends A
{
	void show()
	{
	out.println("show C");
	}
}
class MainClass
{
	static public void main(String... ar)
	{
	A ref=new B();
	ref.show();
	A ref1=new C();
	ref1.show();

		//OR

	A obj[]={new B(),new C()};
	for(int i=0;i<obj.length;i++)
	{
	obj[i].show();
	}
	}
}