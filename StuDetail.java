import java.util.Scanner;
import static java.lang.System.out;
class StudentDetail
{
	public static void main(String...ar)
	{
	Scanner sc=new Scanner(System.in);
	out.print("Enter student name::");
	String name=sc.next();
	out.print("Enter student rollno::");
	int rNo=sc.nextInt();
	out.print("Enter college name::");
	String college=sc.next();
	out.print("Enter cource::");
	String cource=sc.next();
	out.print("Enter Branch::");
	String branch=sc.next();
	out.print("Enter Semester::");
	String sem=sc.next();
	out.println("Enter subject name::");
	out.print("Sub1::");
	String subOne=sc.next();
	out.print("Sub2::");
	String subTwo=sc.next();
	out.print("Sub3::");
	String subThree=sc.next();
	out.print("Sub4::");
	String subFour=sc.next();
	out.print("Sub5::");
	String subFive=sc.next();
	final int MAX_MRK=100;
	final int MIN_MRK=30;
	
	out.print("Enter obtain marks in "+subOne+"=");
	int obMrkOne=sc.nextInt();
	out.print("Enter obtain marks in "+subTwo+"=");
	int obMrkTwo=sc.nextInt();
	out.print("Enter obtain marks in "+subThree+"=");
	int obMrkThree=sc.nextInt();
	out.print("Enter obtain marks in "+subFour+"=");
	int obMrkFour=sc.nextInt();
	out.print("Enter obtain marks in "+subFive+"=");
	int obMrkFive=sc.nextInt();
	int total=5*MAX_MRK;
	float totObMrk=obMrkOne+obMrkTwo+obMrkThree+obMrkFour+obMrkFive;
	float percent=(totObMrk*100)/total;
	

	out.println("Name::"+name);
	out.println("Rollno::"+rNo);
	out.println("College name::"+college);
	out.println("Cource::"+cource);
	out.println("Branch::"+branch);
	out.println("Semester::"+sem);
	out.println("Sub1::"+subOne);
	out.println("Sub2::"+subTwo);
	out.println("Sub3::"+subThree);
	out.println("Sub4::"+subFour);
	out.println("Sub5::"+subFive);
	out.println("maximum mark of "+subOne+"="+MAX_MRK);
	out.println("maximum mark of "+subTwo+"="+MAX_MRK);
	out.println("maximum mark of "+subThree+"="+MAX_MRK);
	out.println("maximum mark of "+subFour+"="+MAX_MRK);
	out.println("maximum mark of "+subFive+"="+MAX_MRK);
	out.println("minimum mark of "+subOne+"="+MIN_MRK);
	out.println("minimum mark of "+subTwo+"="+MIN_MRK);
	out.println("minimum mark of "+subThree+"="+MIN_MRK);
	out.println("minimum mark of "+subFour+"="+MIN_MRK);
	out.println("minimum mark of "+subFive+"="+MIN_MRK);
	out.println("Total mark of all sub="+total);
	out.println("Total obtained mark="+totObMrk);
	out.println("Grade according to marks=");
	out.println("Percentag of marks="+percent);
	if(percent<30)
	{
	out.println("Grade D");
	}
	if(percent>30||percent<50)
	{
	out.println("Grade C");
	}
	if(percent>50 || percent<70)
	{
	out.println("Grade B");
	}
	else
	{
	out.println("Grade A");
	}
	}
}