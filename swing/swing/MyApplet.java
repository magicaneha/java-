import java.awt.*;
import java.applet.*;

public  class MyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("hello",200,200);
		g.drawRect(20, 20, 40, 40) ;
		g.drawOval(20, 20, 20, 20); 
		
	}
}