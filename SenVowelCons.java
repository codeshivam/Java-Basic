import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
class StrToChar
{
	public static void main(String...ar)
	{
	String str="honesty is the best policy";
	char ch[]=new char[str.length()];
	int VOWEL=0;
	int CONS=0;
	for(int i=0;i<str.length();i++)
		{
		ch[i]=str.charAt(i);
		     if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		       {
			VOWEL++;
		       }
		     else
			{
			CONS++;
			}
		}
	out.println("NO of vowel="+VOWEL);
	out.println("NO of vowel="+CONS);
	}
}