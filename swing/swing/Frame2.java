import java.awt.*;

class Frame2 extends Frame
{	
	Button btnadd,btnsub;
	TextField txtf ,txts;
	Label lblf ,lbls,lblans;
	
	public void init()
	{	
		setVisible(true);
		this.setTitle("MyFrame");
		setBounds(100,100,400,400);
		setLayout(new FlowLayout());

		lblf=new Label("F No");
		lbls=new Label();
		lbls.setText("S No");
		lblans=new Label("answer");

		txtf=new TextField(10);
		txts=new TextField(10);

		 btnadd=new Button("add");
		 btnsub=new Button("sub");

		add(lblf);
		add(txtf);
		add(lbls);
		add(txts);
		add(btnadd);
		add(btnsub);
		add(lblans);

	}
	

	public static void main(String args[])
	{
		Frame2 f =new Frame2();
		f.init();
	}



}