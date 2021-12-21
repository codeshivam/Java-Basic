class StuDetail extends java.lang.Object
{
	int roll;
	String branch;
	String sem;
	StuDetail(int roll,String branch,String sem)
	{
	this.roll=roll;
	this.branch=branch;
	this.sem=sem;
	}

	public String toString()
	{
	return roll+" "+branch+" "+sem;
	}
}
class OopsConcept
{
	static public void main(String... ar)
	{
	System.out.println(new StuDetail(212,"cs","4th"));
	}
}