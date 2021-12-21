import java.util.ArrayList;
import static java.lang.System.out;
class ArraList
{
	public static void main(String...arg)
	{
	ArrayList list=new ArrayList();
	list.add("Arun");
	list.add(5);
	list.add(43231);
	list.add('c');
	list.add(788.321f);
	list.add(7.9);
	//out.println(list);
	//out.println(list.get(2));
	//list.remove(2);
	//out.println(list);
	//list.removeAll(list);
	if(list.isEmpty())
	   {
		out.println("list is empty");
	   }
	else
	   {
		out.println(list);
		out.println(list.get(2));
	   }
	}
}