import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.*;


class FrameLogic extends Frame {
	Button button;
	Label label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
	TextField tx1,tx2,tx3,tx4,tx5,tx6;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	
	public FrameLogic() {
		setVisible(true);
		setSize(300,400);
		setBackground(Color.CYAN);
		setLayout(new FlowLayout());
		setTitle("Login Page");
		
		
		label1=new Label("First Name:");
		label2=new Label("Last Name:");
		label3=new Label("Gender:");
		label4=new Label("Qualification:");
		label5=new Label("Username:");
		label6=new Label("Password:");
		label7=new Label("Conform password:");
		label8=new Label("Address:");
		label9=new Label("Cource:");
		label10=new Label("Branch:");
		label11=new Label("Year:");
		label12=new Label("Semester:");
		
		
		tx1=new TextField(20);
		tx2=new TextField(20);
		tx3=new TextField(100);
		tx4=new TextField(20);
		tx5=new TextField(10);
		tx6=new TextField(10);
		
		
		Choice ch=new Choice();
		ch.add("BE");
		ch.add("BA");
		ch.add("Bsc");
		ch.add("BCA");
		ch.add("MCA");
		
		
		Choice ch1=new Choice();
		ch1.add("CS");
		ch1.add("IT");
		ch1.add("ME");
		ch1.add("CE");
		ch1.add("EX");
		ch1.add("Ec");
		
		
		Choice ch2=new Choice();
		ch2.add("1st");
		ch2.add("2nd");
		ch2.add("3rd");
		ch2.add("4th");
		
		
		Choice ch3=new Choice();
		ch3.add("1st");
		ch3.add("2nd");
		ch3.add("3rd");
		ch3.add("4th");
		ch3.add("5th");
		ch3.add("6th");
		ch3.add("7th");
		ch3.add("8th");
		
		CheckboxGroup cbg=new CheckboxGroup();
		cb5=new Checkbox("Male",cbg,true);
		cb6=new Checkbox("Female",cbg,false);
		
		
		cb1=new Checkbox("10th");
		cb2=new Checkbox("12th");
		cb3=new Checkbox("Graduate");
		cb4=new Checkbox("Master");
		
		button=new Button("Sign up");
		
		
		add(label1);
		add(tx1);
		
		add(label2);
		add(tx2);
		
		add(label3);
		add(cb5);
		add(cb6);
		
		add(label4);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		
		add(label5);
		add(tx4);
		
		add(label6);
		add(tx5);
		
		add(label7);
		add(tx6);
		
		add(label8);
		add(tx3);
		
		add(label9);
		add(ch);
		
		add(label10);
		add(ch1);
		
		add(label11);
		add(ch2);
		
		add(label12);
		add(ch3);
		add(button);
	addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent arg0)
	{
	System.exit(0);
	
	}
	});

	button.addActionListener(new Action());
	}
}



class Action implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
	Frame fr=new Frame();
	fr.setVisible(true);
	fr.setSize(300,400);
	fr.setBackground(Color.CYAN);
	fr.setLayout(new FlowLayout());
	fr.setTitle("Profile");

	Label l1=new Label("you are logged in");
	fr.add(l1);

	}
}



class Main
{

	public static void main(String[] args) {
		
		new FrameLogic();
	}

}
