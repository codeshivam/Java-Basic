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
	for(Integer data:list)
	{
	out.println(data);
	}
	}
}