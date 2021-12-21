import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.lang.System.out;
class DateLogic
{
	public static void main(String...arg)
	{
	Date date=new Date();
	/*SimpleDateFormat sdf=new SimpleDateFormat("YY/MM/DD");*/
	//SimpleDateFormat sdf=new SimpleDateForma();
	SimpleDateFormat sdf=new SimpleDateFormat("MM/DD/YYYY");
	out.println(sdf.format(date));
	DateFormat df=DateFormat.getDateInstance();
	out.println(df.format(date));
	}
}