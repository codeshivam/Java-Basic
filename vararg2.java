import static java.lang.System.out;
class VarLogic
{
	static void add(int...var)
	{
		int ADD=0;
		for(int data:var)
		{
		out.println(data);
		ADD=ADD+data;
		}
	out.println("addition of array="+ADD);
	}
}
class MainClass
{
	public static void main(String...args)
	{
	VarLogic.add(23,4,23,12,21,76);
	}
}