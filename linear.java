import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
class LinearSearch
{
	public static void main(String...arg)
	{
	Scanner sc=new Scanner(in);
	out.println("Enter size for array=");
	int size=sc.nextInt();
	int ar[]=new int[size];
	out.println("Enter elements");
	for(int i=0;i<size;i++)
		{
		ar[i]=sc.nextInt();
		}
	out.println("Enter element for search");
	int search=sc.nextInt();
	for(int i=0;i<=size;i++)
		{
		if(ar[i]==search)
		  {
			out.println("Element found");
			break;
		  }
		if(i==size)
		{
		out.println("not found");
		}
		}
		
	}
}
