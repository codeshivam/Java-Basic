import java.util.Date;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class DateLogic
{
	public static void main(String...arg)
	{
	Date date=new Date();
	System.out.println(date);
	
	//SimpleDateFormat sdf=new SimpleDateFormat();
	//out.println(sdf.format(date));

	/*SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
	out.println(sdf.format(date));*/

	//DateFormat df=DateFormat.getDateInstance();
	//out.println(df.format(date));

	/*DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
	out.println(df.format(date));*/

	/*DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
	out.println(df.format(date));*/
	
	/*DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
	out.println(df.format(date));*/

	DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL);
	out.println(df.format(date));

	}
}