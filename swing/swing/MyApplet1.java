import java.awt.*;
import java.applet.*;

public  class MyApplet1 extends Applet
{
	public void init()
	{
		System.out.println("init.......");
	}
	public void start()
	{
		System.out.println("start.......");
	}

	public void paint(Graphics g)
	{
		System.out.println("paint.......");
		g.drawString("hello",200,200);
		g.drawRect(20, 20, 40, 40) ;
		g.drawOval(20, 20, 20, 20); 
		
	}

	public void stop()
	{
		System.out.println("stop.......");
	}

	public void destroy()
	{
		System.out.println("destroy.......");
	}
}