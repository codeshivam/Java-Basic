import static java.lang.System.out;
class Gen<nti,pti>
{
	nti var1;
	pti var2;
	void get(nti va1,pti va2);
	{
	var1=va1;
	var2=va2;
	}
	void show();
	{
	out.println(nti+" "+pti);
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