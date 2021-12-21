import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Choice;
import java.awt.List;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Test extends Frame
{
	Test()
	{
	setVisible(true);
	setSize(300,300);
	setTitle("Techologies");
	setBackground(Color.yellow);
	setLayout(new FlowLayout());
	
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

	add(l1);
	add(list);
	add(l2);
	add(ch);
	add(b);
	addWindowListener(new MyListener());
	b.addActionListener(new Set());
	}
	
}
class Set implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
	Frame frame2=new Frame();
	frame2.setVisible(true);
	frame2.setSize(500,500);
	frame2.setBackground(Color.yellow);
	frame2.setLayout(new FlowLayout());
	Label label1=new Label("you clicked");
	frame2.add(label1);
	}
}

class MyListener extends WindowAdapter
{
	public void windowClosing(WindowEvent args0)
	{
	System.exit(0);
	}
}
class Main
{
	public static void main(String...ar)
	{
	new Test();
	}
}