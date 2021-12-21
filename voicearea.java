import java.util.Scanner;
import java.util.Date;
import javax.media.Manager;
import javax.media.Player;
import java.io.File;
class Area
{
	public static void main(String... ar)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Player play=Manager.createRealizedPlayer(new File("D:/voice/voice 002.wav").toURI().toURL());
		play.start();
		/*System.out.println("You have following choice::");
		System.out.println("1 for area of circle");
		System.out.println("2 for area of triangle");
		System.out.println("3 for area of rectangle");
		System.out.println("Enter your choice");*/
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
			//System.out.println("Enter radious of circle");
		Player play1=Manager.createRealizedPlayer(new File("D:/voice/voice 003.wav").toURI().toURL());
			play1.start();
			System.out.print("Radius=");
			float rad=sc.nextFloat();
			double area=3.14*rad*rad;
		Player play2=Manager.createRealizedPlayer(new File("D:/voice/voice 008.wav").toURI().toURL());
		play2.start();
			System.out.println("\nArea of circle="+area);
			break;

			case 2:
		Player play3=Manager.createRealizedPlayer(new File("D:/voice/voice 004.wav").toURI().toURL());
		play3.start();
			System.out.print("Base=");
			float base=sc.nextFloat();
		Player play4=Manager.createRealizedPlayer(new File("D:/voice/voice 005.wav").toURI().toURL());
		play4.start();
			System.out.print("\nHeight=");
			float ht=sc.nextFloat();
			float tArea=(base*ht)/2;
		Player play5=Manager.createRealizedPlayer(new File("D:/voice/voice 008.wav").toURI().toURL());
		play5.start();
			System.out.println("Area of triangle="+tArea);
			break;

			case 3:
		Player play9=Manager.createRealizedPlayer(new File("D:/voice/voice 006.wav").toURI().toURL());
		play9.start();
			System.out.print("length=");
			float len=sc.nextFloat();
		Player play10=Manager.createRealizedPlayer(new File("D:/voice/voice 007.wav").toURI().toURL());
		play10.start();
			System.out.print("\nBreadth=");
			float brth=sc.nextFloat();
			float rArea=len*brth;
		Player play11=Manager.createRealizedPlayer(new File("D:/voice/voice 008.wav").toURI().toURL());
		play11.start();
			System.out.println("Area of rectangle="+rArea);
			break;
		}
	}
	static
	{
	Date currentDate=new Date();
	System.out.println(currentDate);
	}
}




	
	
