import static java.lang.System.out;
class AssertLogic
{
	int var;
	void set(int var)
	{
	this.var=var;
	show();
	}
	void show()
	{
	out.println(var);
	}
}
class MainClass
{
	static public void main(String...ars)
	{
	AssertLogic as=new AssertLogic();
	as.set(100);
	//as.show();
	}
}