//SIZE-to find out size of data type
//size()-to find out size or length of dynamic array
//length-keyword used to find out length or size of static array
//length()-used to find out the lngth of any string


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
	//out.println(list.size());
	int len=list.size();
	out.println(len);
	for(int i=0;i<len;i++)
	{
	out.println(list.get(i));
	}
	}
}