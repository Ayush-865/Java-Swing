import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hello implements ActionListener{
	JLabel l1, l2, l3;
	JButton b1;
	JTextField t1, t2;

	Hello(){
		JFrame f = new JFrame();
		l1=new JLabel("Enter first number");
		f.add(l1);
		t1 = new JTextField(20);
		f.add(t1);
		l2=new JLabel("Enter first number");
		f.add(l2);
		t2 = new JTextField(20);
		f.add(t2);
		b1=new JButton("Click to add");
		f.add(b1);
		b1.addActionListener(this);
		l3=new JLabel();
		f.add(l3);

		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(300,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			l2.setText(""+(a+b));
		}
	}
}
class C2{
	public static void main(String[] args){
		Hello h = new Hello();
	}
}