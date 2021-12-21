import java.util.Scanner;
class RepublicGuest
{
public static void main(String...ar)
	{
	System.out.println("you have following list of years");
	System.out.println("2000");
	System.out.println("2001");
	System.out.println("2002");
	System.out.println("2003");
	System.out.println("2004");
	System.out.println("2005");
	System.out.println("2006");
	System.out.println("2007");
	System.out.println("2008");
	System.out.println("2009");
	System.out.println("2010");
	System.out.println("2011");
	System.out.println("2012");
	System.out.println("2013");
	System.out.println("2014");
	System.out.println("2015");
	System.out.println("2016");
	System.out.println("2017");
	Scanner sc=new Scanner(System.in);
	System.out.println("Plz select year for republic day guest name");
	int ch=sc.nextInt();

	switch(ch)
	{
	case 2000:
	System.out.println("Olesegun Obasanjo");
	break;

	case 2001:
	System.out.println("Abdelaziz bouteflica");
	break;

	case 2002:
	System.out.println("Cassam uteem");
	break;

	case 2003:
	System.out.println("Mohammed khatami");
	break;
	
	case 2004:
	System.out.println("Jigme singye wangchuck");
	break;

	case 2005:
	System.out.println("Luiz inacio lula dasilva");
	break;
	
	case 2006:
	System.out.println("Abdullah bin Abdulazi alsaud");
	break;

	case 2007:
	System.out.println("Vladimir Putin");
	break;

	case 2008:
	System.out.println("Nicolas sarkozy");
	break;

	case 2009:
	System.out.println("Nursultan Najarbayev");
	break;

	case 2010:
	System.out.println("Lee Myung Bak");
	break;

	case 2011:
	System.out.println("susilo Bambang Yadhoyono");
	break;
	
	case 2012:
	System.out.println("Yingluck Shinawatra");
	break;

	case 2013:
	System.out.println("Jigme Khesar Nangyel Wangchuck");
	break;
	
	case 2014:
	System.out.println("Shinzo abe");
	break;

	case 2015:
	System.out.println("Brack Obama");
	break;

	case 2016:
	System.out.println("Francoic Hollande");
	break;

	case 2017:
	System.out.println("mohammed bin zayed Al Nahyan");
	break;

	default:
	System.out.println("Wrong Input");
	break;
	}
      }
}