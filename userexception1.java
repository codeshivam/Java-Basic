import static java.lang.System.out;
import java.util.Scanner;
class MarkException extends RuntimeException
{
	
}
class Marks
{
	void getMarks()
	{
	Scanner sc=new Scanner(System.in);
	out.println("Enter Marks::");
	float mark=sc.nextFloat();
	if(mark<0||mark>100)
	{
	MarkException me=new MarkException();
	throw me;
	}
	else
	{
	out.println("thats good");
	}

	}
}
class MainClass
{
	static public void main(String...arg)
	{
	Marks ref=new Marks();
	
	try{
		ref.getMarks();
	}
	catch(MarkException me)
	{
	me.printStackTrace();
	out.println("Invalid marks");
	}
	}
}