import static java.lang.System.out;
class Gen<inti,intii>
{
	inti var1;
	intii var2;
	void get(inti va1,intii va2)
	{
	var1=va1;
	var2=va2;
	}
	void show()
	{
	out.println(var1+" "+var2);
	}
}
class MainClass
{
	public static void main(String...arg)
	{
	Gen ref=new Gen();
	ref.get(12,"gst");
	ref.show();
	}
}