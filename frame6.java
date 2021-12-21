//program to create frame by extanding Frame class



import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Color;
class MyFrame extends Frame
{
	MyFrame()
	{
	setVisible(true);
	setSize(300,300);
	setTitle("MyFrame");
	setBackground(Color.yellow);
	setLayout(new FlowLayout());

	Label label1=new Label("Username");
	Label label2=new Label("Password");

	TextField tx1=new TextField(30);
	TextField tx2=new TextField(30);

	Button button=new Button("Login");

	add(label1);
	add(tx1);
	add(label2);
	add(tx2);
	add(button);
	}
	
	public static void main(String...ar)
	{
	new MyFrame();
	}
}
