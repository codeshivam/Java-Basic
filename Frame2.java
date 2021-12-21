import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Test
{
	public static void main(String...arg)
	{
	Frame frame=new Frame();
	frame.setVisible(true);
	frame.setSize(300,300);
	frame.setTitle("Techologies");
	//frame.setBackground(Color.yellow);
	frame.setLayout(new FlowLayout());
	
	Label l1=new Label("Technologies");
	Label l2=new Label("Cities:");
	Button b=new Button("Search");

	List list=new List(2,true);
	list.add("c");
	list.add("cpp");
	list.add("Java");
	list.add(".net");
	list.add("php");
	
	Choice ch=new Choice();
	ch.add("Hydrabad");
	ch.add("Banglore");
	ch.add("chennai");
	ch.add("Pune");

	frame.add(l1);
	frame.add(list);
	frame.add(l2);
	frame.add(ch);
	frame.add(b);
	frame.addWindowListener(new MyListener());
	}
}
class MyListener extends WindowAdapter
{
	public void windowClosing(WindowEvent args0)
	{
	System.exit(0);
	}
}