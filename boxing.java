import static java.lang.System.out;
class Boxing
{
	static public void main(String...ar)
	{
	Integer re=128;
	Integer re1=128;
		if(re==re1)//== check the range 0 to 127.
		{
		out.println("same");
		}
		else
		{
		out.println("not same");
		}
			if(re.equals(re1))//equals check the value
			{
			out.println("same");
			}
			else
			{
			out.println("not same");
			}
	Integer ref=12443;
	Integer ref1=12443;
	int var1=ref;
	int var2=ref1;
	if(var1==var2)
	{
	out.println("same");
	}
	else
	{
	out.println("not same");
	}
	}
}