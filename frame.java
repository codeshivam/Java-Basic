import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Color;
class MyFrame
{
	public static void main(String...arg)
	{
	Frame frame=new Frame();
	frame.setVisible(true);
	frame.setSize(300,300);
	frame.setTitle("MyFrame");
	frame.setBackground(Color.yellow);
	frame.setLayout(new FlowLayout());

	Label label1=new Label("Username");
	Label label2=new Label("Password");

	TextField tx1=new TextField(30);
	TextField tx2=new TextField(30);

	Button button=new Button("Login");

	frame.add(label1);
	frame.add(tx1);
	frame.add(label2);
	frame.add(tx2);
	frame.add(button);
	}
}