import java.awt.*;

class Frame1 
{
	public static void main(String args[])
	{
		Frame f=new Frame("MyFrame");
		f.setVisible(true);
		f.setSize(400,400);
		f.setBounds(100,100,200,200);
		f.setTitle("Hello");
	}
}