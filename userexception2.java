import static java.lang.System.out;
import java.util.Scanner;
class MarkException extends RuntimeException
{
	
}
class Marks
{
	int mark;
	Marks(int mark)
	{
	this.mark=mark;
	}

	void show()
	{
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
	Marks ref=new Marks(98);
	
	try{
		ref.show();
	}
	catch(MarkException me)
	{
	me.printStackTrace();
	out.println("Invalid marks");
	}
	}
}