import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.text.NumberFormat;
class Number
{
	public static void main(String...ar)
	{
	Scanner sc=new Scanner(in);
	out.println("enter double no to add");
	double one=sc.nextDouble();
	double two=sc.nextDouble();
	double three=sc.nextDouble();
	double add=one+two+three;
	out.println("add="+add);

	NumberFormat nf=NumberFormat.getNumberInstance();
	nf.setMaximumFractionDigits(2);
	out.println(nf.format(add));
	}
}