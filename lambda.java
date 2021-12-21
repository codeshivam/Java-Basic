//program for print data one by one through lambda expression.

/* instead lambda we can also use following:
   for(int i=0;i<list.size();i++)
	{
	out.println(list.get(i));
	}

   for(Integer data:list)
	{
	out.println(data);
	}
*/
import java.util.ArrayList;
import static java.lang.System.out;
class ArraList
{
	public static void main(String...arg)
	{
	ArrayList<Integer> list=new ArrayList<Integer>();//we have used generic concept to 							//bound only integer value
	list.add(5);
	list.add(43231);
	list.add(788);
	list.add(7);
	//out.println(list.size());
	int len=list.size();
	out.println(len);
	list.forEach(anything->out.println(anything));
	}
}

//lambda expression(->)