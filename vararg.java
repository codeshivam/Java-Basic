import static java.lang.System.out;
import java.util.Arrays;
class VarArg
{
	static void get(int...ar)
	{
	//for(int i=0;i<ar.length;i++)
	  for(int data:ar)
	  {
	   out.println(data);
	  }
	/*Arrays.sort(ar);
	out.println("sorted array");
	for(int data:ar)		//OR
	  {
	   out.println(data);
	  }*/
	out.println("reverse array");
	for(int i=ar.length-1;i>=0;i--)
	  {
	  out.println(ar[i]);
	  }
	}
}
class MainClass
{
	public static void main(String...arg)
	{
	VarArg.get(12,43,21,76,34,65);
	}
}