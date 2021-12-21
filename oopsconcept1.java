import static java.lang.System.out;
class StuDetail extends java.lang.Object
{
	int roll;
	String name;
	String branch;

	StuDetail(int roll,String name,String branch)
	{
	this.roll=roll;
	this.name=name;
	this.branch=branch;
	}

	void show()
	{
	out.println(roll+" "+name+" "+branch);
	}
}
class OopsConcept
{
	static public void main(String...ard)
	{
	StuDetail sd=new StuDetail(234,"Shivam","B.E");
	sd.show();
	}
}