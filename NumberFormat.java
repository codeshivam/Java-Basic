import static java.lang.System.out;
import static java.lang.System.in;
import java.text.NumberFormat;
import java.util.Scanner;
class NumberForma
{
	public static void main(String...ar)
	{
	Scanner sc=new Scanner(in);
	out.println("Enter radius of circle::");
	float rad=sc.nextFloat();
	float area=3.14f*rad*rad;
	out.println("area="+area);
	

	NumberFormat nf=NumberFormat.getNumberInstance();
	nf.setMaximumFractionDigits(2);
	out.println(nf.format(area));
	}
}