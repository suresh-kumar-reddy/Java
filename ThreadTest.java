import java.awt.*;
import java.applet.*;

public class AppletTest extends Applet
{
	int initcount=0;
	int startcount=0;
	int stopcount=0;
	int destroycount=0;

	public void paint(Graphics g) throws NullPointerException
	{
		g.setColor(Color.orange);
		String str = getParameter("msg");
		g.drawString(str,200,25);
		g.setColor(Color.blue);
		g.drawOval(80,250,350,50);
		g.drawOval(81,251,350,50);
		g.setColor(Color.green);
		g.fillOval(100,150,300,200);
		g.setColor(Color.orange);
		g.drawRoundRect(55,130,400,250,40,50);
		g.setColor(Color.red);
		String str1 = getParameter("msg1");
		g.drawString(str1,225,250);
	}
	public void init()
	{
		setBackground(Color.black);
 		initcount++;
 		System.out.println("init");
		repaint();
	}
	public void start()
	{
		startcount++;
 		System.out.println("start");
 		repaint();
	}
	public void stop()
	{
		stopcount++;
		System.out.println("stop");
		repaint();
	}
	public void destroy()
	{
		destroycount++;
		System.out.println("destroy");
  		repaint();
	}
}