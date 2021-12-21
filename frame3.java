import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Swing2 
{
	static public void main(String[] args)
	{
	JFrame frame=new JFrame("test");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	JPanel panel=new JPanel();
	frame.add(panel);
	JButton button=new JButton("Click here");
	frame.add(button);
	}

}