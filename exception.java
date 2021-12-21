import static java.lang.System.out;
class Test
{
	static public void main(String...arg)
	{
	try{
	out.println("Statment 1");
	out.println("Statement 2");
	out.println(10/0);
	out.println("Statement 4");
	}
	catch(ArithmeticException e)
	{
	out.println(10/2);
	}
	out.println("Statement 5");
	}
}