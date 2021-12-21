class VarArg
{
	static void evenOdd(int...ar)
	{
	int j;
	int arr[]=new int[j];
	for(int i=0;i<ar.length;i++)
	  {
	   if(ar[i]%2==0)
		{
	  	arr[j]=ar[i];
		}
	   else
		{
		System.out.println(ar[i]+"odd");
		}
	  }
	System.out.println(arr[5]);
	}
}
class MainClass
{
	static public void main(String...arg)throws Exception
	{
	VarArg.evenOdd(21,43,22,46,57,86,36);
	}
}