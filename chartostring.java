import static java.lang.System.out;
class CharToStr
{
	public static void main(String...ar)
	{
	char ch[]={'s','h','i','v','a','m'};
	String str=new String(ch);
	out.println(str);
	out.println(str.toUpperCase());
	String str1=str.toUpperCase();
	out.println(str1.toLowerCase());
	//out.println(str.toUpperCase().toLowerCase());
	}
}