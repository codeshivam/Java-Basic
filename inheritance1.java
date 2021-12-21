import static java.lang.System.out;
//final class Company //it cannot be inherit in child class
class Company
{
	int reg;
	String college;
	String services;
	final int COUNT=10;
	//int COUNT=10;
	void set(int reg,String college,String services)
	{
	this.reg=reg;
	this.college=college;
	this.services=services;
	}

	//final void show()//it cannot be override in child class
	void show()
	{
	out.println("-----PARENT CLASS------");
	out.println(reg+" "+college+" "+services+" "+COUNT);
	}
}
class Student extends Company
{
	int roll;
	String name;

	void set(int roll,String name)
	{
	super.set(820,"LNCT","Be");
	this.roll=roll;
	this.name=name;
	}

	void show()
	{
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