import static java.lang.System.out;
class StrToChar
{
	public static void main(String...arg)
	{
	String str="indore";
	int len=str.length();
	char ch[]=new char[len];
	for(int i=0;i<len;i++)
		{
		ch[i]=str.charAt(i);
		out.println(ch[i]);
		}	
	}
}