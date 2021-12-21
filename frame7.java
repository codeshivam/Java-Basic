import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Choice;
import java.awt.List;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

class WindowConcept extends JFrame
{
	{
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(500,500);
	setVisible(true);
	setLayout(new java.awt.FlowLayout());
	Button btn1=new Button("awt buttton");
	JButton btn2=new JButton("",new ImageIcon("a.jpg"));
	btn2.setToolTipText("this is swing button");
	Label lb=new Label("Registration Form");
	TextField tx=new TextField(20);
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox cb1=new Checkbox("Female",cbg,true);
	Checkbox cb2=new Checkbox("Male",cbg,false);
	TextArea ta=new TextArea(5,10);
	List lt=new List(1,true);
	lt.add("hardware");
	lt.add("software");
	lt.add("networking");
	lt.add("database");
	Choice ch=new Choice();
	ch.add("select city");
	ch.add("indore");
	ch.add("Ujjain");
	ch.add("Dewas");
	ch.add("Pune");
	add(lt);
	add(ch);
	add(tx);
	add(cb1);
	add(cb2);
	add(ta);
	add(btn2);
	add(lb);
	add(btn1);
	}
	
	public static void main(String...arg)
	{
	new WindowConcept();
	}

}