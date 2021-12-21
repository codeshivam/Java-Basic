import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
class StrToChar
{
	public static void main(String...ar)
	{
	Scanner sc=new Scanner(in);
	out.println("Enter any string::");
	String str=sc.next();
	char ch[]=new char[str.length()];
	int VOWEL=0;
	int CONS=0;
	for(int i=0;i<str.length();i++)
		{
		ch[i]=str.charAt(i);
		ch[0]=(char)((int)ch[0]-32);
		out.println(ch[i]);
		}
	String str1=new String(ch);
		out.println(str1);
	}
}