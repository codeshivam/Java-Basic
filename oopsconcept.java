import static java.lang.System.out;
class StuDetail
{
	int rollNo;
	String name;
	String branch;
	long mobNo;

	void set(int rNo,String sName,String sBranch,long mNo)
	{
	rollNo=rNo;
	name=sName;
	branch=sBranch;
	mobNo=mNo;
	}
	
	void show()
	{
	out.println(name+" "+rollNo+" "+branch+" "+mobNo);
	}
}
class OopsConcept
{
	static public void main(String...ar)
	{
	StuDetail sd=new StuDetail();
	sd.set(2465,"Shivam","B.E",9845257);
	sd.show();
	}
}