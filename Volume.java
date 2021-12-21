import java.util.Scanner;
class Volume
{
	public static void main(String... arrr)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter radius of cone=");
	float radOfCone=sc.nextFloat();
	System.out.print("Enter height of cone=");
	float htOfCone=sc.nextFloat();
	System.out.print("Enter radius of sphere=");
	float radOfSph=sc.nextFloat();
	System.out.print("Enter radius of cylinder=");
	float radOfCyl=sc.nextFloat();
	System.out.print("Enter height of cylinder=");
	float htOfCyl=sc.nextFloat();
	float volOfCone=(3.14f*radOfCone*radOfCone*htOfCone)/3;
	float volOfSph=(4*3.14f*radOfSph*radOfSph*radOfSph)/3;
	float volOfCyl=3.24f*radOfCyl*radOfCyl*htOfCyl;
	System.out.println("Volume of cone="+volOfCone);
	System.out.println("Volume of sphere="+volOfSph);
	System.out.println("Volume of cylinder="+volOfCyl);
	}
}