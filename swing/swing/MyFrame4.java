import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame4 extends JFrame implements ActionListener , MouseListener
{	
	JButton btnadd,btnsub;
	JTextField txtf ,txts;
	JLabel lblf ,lbls,lblans;
	
	public void init()
	{	
		setVisible(true);
		this.setTitle("MyFrame");
		setBounds(100,100,400,400);
		setLayout(new FlowLayout());

		lblf=new JLabel("F No");
		lbls=new JLabel();
		lbls.setText("S No");
		lblans=new JLabel("answer");

		txtf=new JTextField(10);
		txts=new JTextField(10);

		 btnadd=new JButton("add");
		 btnsub=new JButton("sub");

		add(lblf);
		add(txtf);
		add(lbls);
		add(txts);
		add(btnadd);
		add(btnsub);
		add(lblans);

		btnadd.addActionListener(this);
		btnsub.addActionListener(this);
		btnadd.addMouseListener(this);

		pack();
	}
	

	public static void main(String args[])
	{
		MyFrame4 f =new MyFrame4();
		f.init();
	}


	public void actionPerformed(ActionEvent ae)
	{
		String s1=txtf.getText();
		String s2=txts.getText();
		
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		if(ae.getSource()==btnadd)
		{
			Integer c=a+b;
			lblans.setText(c.toString());		
		}
		if(ae.getSource()==btnsub)
		{
			Integer c=a-b;
			lblans.setText(c.toString());		
		}

		
	}


	public void mouseClicked(MouseEvent ke) {}
	public void mouseEntered(MouseEvent ke) {lblans.setText("Hello");}
	public void mouseExited(MouseEvent me) {lblans.setText("By......");}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}


}