import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.Arrays;
class ArrSort
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
			Arrays.sort(ar);
			out.println("Sorted elements are::");
			/*for(int data:ar)
			{
			out.println(data);
			}*/
			for(int i=0;i<size;i++)
			{
			out.println(ar[i]);
			}	
	}
}
