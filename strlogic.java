import static java.lang.System.out;
class StrLogic
{
	public static void main(String...arg)
	{
	String str="Indore city";
	out.println(str.toUpperCase());
	
	String str1="PUNE CITY";
	out.println(str1.toLowerCase());
	
	String str3="hello chacha how are you";
	out.println("length of string:"+str3.length());
	
	String str4=" honesty is the best policy";
	out.println(str4);
	out.println(str4.trim());

	//String str5="abc";//both same adress and value
	//String str6="abc";

	String str5=new String("abc");//value same but adress different
	String str6=new String("ABC");

		if(str5.equals(str6))//it check the values
		  {
	 	    out.println("Same");
		  }
		else
			{
			out.println("Not same");
			}
	  	if(str5==str6)//it check the adress
		{
		 out.println("Same");
		}
		else
			{
			out.println("Not same");
			}
		if(str5.equalsIgnoreCase(str6))
		{
		out.println("Same");
		}
		else
			{
			out.println("Not same");
			}
	}
}