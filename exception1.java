import static java.lang.System.out;
class Test
{
	public static void main(String...ar)
	{
	try{
	out.println(10/0);
	}
	catch(ArithmeticException e)
	{
	e.printStackTrace();//used to print exception information
	out.println(e);
	out.println(e.getMessage());
	}
	}
}