import static java.lang.System.out;
class Person
{
	String name;
	int age;
	
	Person(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	
	void show()
	{
	out.println(name+" "+age);
	}
}
class Student extends Person
{
	int roll;
	int marks;
	Student(String name,int age,int roll,int marks)
	{
	super(name,age);
	this.roll=roll;
	this.marks=marks;
	super.show();
	}
	void show()
	{
	//super.show();
	out.println(roll+" "+marks);}
}
class Main
{
	static public void main(String...ar)
	{
	Student st=new Student("Shivam",19,101,476);
	st.show();
	}
}