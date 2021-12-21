import java.awt.Color;
import java.io.File;
import javax.media.Player;
import javax.media.Manager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
class WindowConcept extends JFrame implements MouseListener,MouseMotionListener{
	{
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.GRAY);
		setSize(500,500);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args)throws Exception {
		new WindowConcept();
	Player play=Manager.createRealizedPlayer(new File("D:/java/src/electro.wav").toURI().toURL());
	play.start();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		float red=(float)Math.random();
		float green=(float)Math.random();
		float blue=(float)Math.random();
		getContentPane().setBackground(new Color(red,green,blue));
	}
	
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
//method of 
	public void mouseMoved(MouseEvent e) {
		float red=(float)Math.random();
		float green=(float)Math.random();
		float blue=(float)Math.random();
		getContentPane().setBackground(new Color(red,green,blue));
	}
	public void mouseDragged(MouseEvent e) {
		
	}
	
	

}
