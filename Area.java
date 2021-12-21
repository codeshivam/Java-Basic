import java.util.Scanner;
import java.util.Date;
class Area
{
	public static void main(String... ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("You have following choice::");
		System.out.println("1 for area of circle");
		System.out.println("2 for area of triangle");
		System.out.println("3 for area of rectangle");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
			System.out.println("Enter radious of circle");
			float rad=sc.nextFloat();
			double area=3.14*rad*rad;
			System.out.println("Area of circle="+area);
			break;

			case 2:
			System.out.println("Enter base of triangle");
			float base=sc.nextFloat();
			System.out.println("Enter height of triangle");
			float ht=sc.nextFloat();
			float tArea=(base*ht)/2;
			System.out.println("Area of triangle="+tArea);
			break;

			case 3:
			System.out.println("Enter length of rectangle");
			float len=sc.nextFloat();
			System.out.println("Enter breadth of rectangle");
			float brth=sc.nextFloat();
			float rArea=len*brth;
			System.out.println("Area of rectangle="+rArea);
			break;
		}
	}
	static
	{
	Date currentDate=new Date();
	System.out.println(currentDate);
	}
}




	
	
