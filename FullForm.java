import java.util.Scanner;
class FullForm
{
public static void main(String...ar)
	{
	System.out.println("you have following choice::");
	System.out.println("AM");
	System.out.println("PM");
	System.out.println("GMT");
	System.out.println("CD");
	System.out.println("DVD");
	System.out.println("JPEG");
	System.out.println("JPG");
	System.out.println("BMP");
	System.out.println("ICO");
	System.out.println("GIF");
	System.out.println("VCR");
	System.out.println("J2SE");
	System.out.println("J2EE");
	System.out.println("J2me");
	Scanner sc=new Scanner(System.in);
	System.out.println("Plz enter your choice");
	String ch=sc.next();

	switch(ch)
	{
	case "pdf":
	System.out.println("Portable Document Format");
	break;

	case "AM":
	System.out.println("Ante meridiem");
	break;

	case "PM":
	System.out.println("Post meridiem");
	break;

	case "GMT":
	System.out.println("Greenwich Mean Time");
	break;
	
	case "CD":
	System.out.println("Compact Disk");
	break;

	case "DVD":
	System.out.println("Digital Versatile Disk");
	break;
	
	case "JPEG":
	System.out.println("Joint Protographic Expert Group");
	break;

	case "JPG":
	System.out.println("Joint Protographic Group");
	break;

	case "BMP":
	System.out.println("Both Macs and PCs");
	break;

	case "ICO":
	System.out.println("Initial Coin Offering");
	break;

	case "GIF":
	System.out.println("Graphics Interchange Format");
	break;

	case "VCR":
	System.out.println("Vedeo Cassete Recorder");
	break;
	
	case "J2SE":
	System.out.println("Java 2 Standard Edition");
	break;

	case "J2EE":
	System.out.println("Java 2 Enterprise Edition");
	break;
	
	case "J2ME":
	System.out.println("Java 2 Micro Edition");
	break;

	default:
	System.out.println("Wrong Input");
	break;
	}
      }
}