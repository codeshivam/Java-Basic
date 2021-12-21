import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
class VarArg
{
	static void fact(int...arr)
	{
		int FACT=1;
		for(int i=0;i<arr.length;i++)
		{
		out.print(arr[i]+" ");
		FACT=FACT*arr[i];
		}
	out.println("\nfactorial="+FACT);
	}
	static void oddEven(int...arr)
		{
		int EVEN=0;
		int ODD=0;
		for(int data:arr)
		{
		out.println(data);
		if(data%2==0)
		++EVEN;
		else
		++ODD;
		}
	out.println("no of even   no of odd");
	out.println("   "+EVEN+"     "+ODD);
	}
	static void sorting(int...arr)
	{
		out.println("element of array=");
		for(int data:arr)
		{
		out.println(data);
		}
		Arrays.sort(arr);
		out.println("sorted array=");
		for(int data:arr)
		{
		out.println(data);
		}
	}
}
class MainClass
{
	public static void main(String...args)
	{
	out.println("you have 3 choice");
	out.println("1 for factorial");
	out.println("2 for even odd");
	out.println("3 for sorting array");
	out.print("Enter your choice=");
	Scanner sc=new Scanner(in);
	int ch=sc.nextInt();
	
		switch(ch)
		{
		case 1:
		VarArg.fact(1,2,3,4,5);
		break;

		case 2:
		VarArg.oddEven(22,32,43,67,68,65,55,97,609);
		break;

		case 3:
		VarArg.sorting(76,87,5,76,32,1,321,54,56,98);
		break;

		default:
		out.println("wrong input");
		}
	}
}