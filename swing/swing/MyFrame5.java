import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame5 extends JFrame 
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

		btnadd.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			String s1=txtf.getText();
			String s2=txts.getText();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			Integer c=a+b;
			lblans.setText(c.toString());		
		}		
		

		});

		btnsub.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			String s1=txtf.getText();
			String s2=txts.getText();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			Integer c=a-b;
			lblans.setText(c.toString());		
		}
		
		});
		

		pack();
	}
	

	public static void main(String args[])
	{
		MyFrame5 f =new MyFrame5();
		f.init();
	}

}