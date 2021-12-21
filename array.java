import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
class ArrLogic
{
	public static void main(String...arg)
	{
	Scanner sc=new Scanner(in);
	out.println("enter size of array");
	int size=sc.nextInt();
	int ar[]=new int[size];
	out.println("Enter elements=");
	for(int i=0;i<size;i++)
	  {
	   ar[i]=sc.nextInt();
	  }
	out.println("Elements are::");
	for(int i=0;i<size;i++)
	  {
	   out.println(ar[i]);
	  }
	out.println("---------------");

	out.println("Enter no of rows and no of column");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	out.println("Enter elements=");
	for(int i=0;i<row;i++)
	  {
	   for(int j=0;j<col;j++)
	    {
		arr[i][j]=sc.nextInt();
	    }
	  }
	out.println("Elements are");
	for(int i=0;i<row;i++)
	  {
	    for(int j=0;j<col;j++)
		{
		  out.print(" "+arr[i][j]);
		}
	    out.println();
	  }
	}
}