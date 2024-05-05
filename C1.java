import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hello implements ActionListener{
	JLabel l1, l2;
	JButton b1, b2;
	JTextField t1;
	JPasswordField p1;

	Hello(){
		JFrame f = new JFrame();
		l1 = new JLabel("Enter name");
		f.add(l1);
		t1 = new JTextField(20);
		f.add(t1);
		l2 = new JLabel("Enter password");
		f.add(l2);
		p1= new JPasswordField(20);
		f.add(p1);
		b1=new JButton("Click");
		f.add(b1);
		b2=new JButton("Reset");
		f.add(b2);
		l2=new JLabel();
		f.add(l2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(new FlowLayout());
		
		f.setVisible(true);
		f.setSize(300,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e){
		String name;
		String password;
		if(e.getSource()==b1){
			name=t1.getText();
			password=p1.getText();
			if(password.equals("12345") && name.equals("Ayush")){
				l2.setText("Welcome "+name);
			}
			else{
				l2.setText("Wrong Password");
			}
		}
		else if(e.getSource()==b2){
			t1.setText("");
			p1.setText("");
		}
	}
}
class C1{
	public static void main(String[] args){
		Hello h = new Hello();
	}
}