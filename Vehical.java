import static java.lang.System.out;
import java.util.Scanner;
class Vehical
{
	public static void main(String... ar)
	{
	Scanner sc=new Scanner(System.in);
	out.print("Enter average of vehical::");
	float avOfVehi=sc.nextFloat();
	out.print("Enter total fuel fillup capicity of vehical::");
	float totFuel=sc.nextFloat();
	out.print("Enter per day km driven of vehical::");
	float perDayDri=sc.nextFloat();
	float noOfDays=(avOfVehi*totFuel)/perDayDri;
	out.println("Total number of days="+noOfDays);
	}
}