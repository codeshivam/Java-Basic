import javax.media.Manager;
import javax.media.Player;
import java.io.File;

class Voice
{
	public static void main(String...arg)throws Exception
	{
	Player play=Manager.createRealizedPlayer(new File("D:/java/src/electro.wav").toURI().toURL());
	play.start();
	//System.exit(0);
	}
}