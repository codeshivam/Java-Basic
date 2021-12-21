import static java.lang.System.out;
class ConstLogic
{
	static
	{
	out.println("static block");
	}
	ConstLogic()
	{
	out.println("default constructor block");
	}
	ConstLogic(int roll,String name)
	{
	out.println(roll+" "+name);
	}
	ConstLogic(ConstLogic ref)
	{
	out.println("copy constructor");
	}
}
class OopsConcept
{
	static public void main(String...ar)
	{
	new ConstLogic(212,"Shivam");
	new ConstLogic(new ConstLogic(new ConstLogic()));
	}
}