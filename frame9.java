import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame
{
	{
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(500,500);
	setVisible(true);
	setLayout(new FlowLayout());
	JLabel l=new JLabel("SWING");
	add(l);
	JTextField t=new JTextField(5);
	add(t);
	}
	public static void main(String...affs)
	{
	new MyFrame();
	}
}