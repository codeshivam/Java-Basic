import static java.lang.System.out;
class Company
{
	int reg;
	String college;
	String services;

	void set(int reg,String college,String services)
	{
	this.reg=reg;
	this.college=college;
	this.services=services;
	}

	void show()
	{
	out.println("-----PARENT CLASS------");
	out.println(reg+" "+college+" "+services);
	}
}
class Student extends Company
{
	int roll;
	String name;

	void set(int roll,String name)
	{
	this.roll=roll;
	this.name=name;
	}

	void show()
	{
	super.set(820,"LNCT","Be");
	super.show();
	out.println("-------CHILD CLASS--------");
	out.println(roll+" "+name);
	}
}
class MainClass
{
	static public void main(String...ar)
	{
	Student ref=new Student();
	ref.set(3333,"Shivam");
	ref.show();
	}
}