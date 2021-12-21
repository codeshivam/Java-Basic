import static java.lang.System.out;
class P
{
	P()
	{
	out.println(this.hashCode());
	}
}
class C extends P
{
	C()
	{
	out.println(this.hashCode());
	}
}
class Main
{
	static public void main(String...arg)
	{
	C c=new C();
	}
}