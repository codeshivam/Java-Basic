import static java.lang.System.out;
import java.util.Scanner;
class JavaMarksException extends RuntimeException
{
	JavaMarksException()
	{
	}
}
class CMarksException extends RuntimeException
{
	CMarksException()
	{
	}
}

class Marks
{
	void getMarks()
	{
	Scanner sc=new Scanner(System.in);
	out.println("Enter java marks::");
	float javaMarks=sc.nextFloat();
	
	if(javaMarks<0||javaMarks>100)
	{
	JavaMarksException ex=new JavaMarksException();
	throw ex;
	}
	else
	{
	out.println("thats good!!!");
	}

	out.println("Enter c lang marks:::");
	float cMarks=sc.nextFloat();
	if(cMarks<0||cMarks>100)
	{
	CMarksException ex=new CMarksException();
	throw ex;
	}
	else
	{
	out.println("thats good!!!");
	}

	}
}
class MainClass
{
	static public void main(String... ar)
	{
	Marks ref=new Marks();
	
	try
	{
	ref.getMarks();
	}
	catch(JavaMarksException | CMarksException ex)
	{
	ex.printStackTrace();
	out.println("Invalid marks input");
	}

	}
}