import static java.lang.System.out;
class ConstLogic
{
	static
	{
	out.println("static block");
	}
	ConstLogic()
	{
	out.println("constructor block");
	}
	{
	out.println("Intialized block");
	}
}
class OopsConcept
{
	static public void main(String...ar)
	{
	new ConstLogic();
	new ConstLogic();
	new ConstLogic();
	}
}