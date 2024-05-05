import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hello implements ActionListener{
	JLabel l1, l2, l3, l4, l5;
	JButton b1, b2;
	JTextField t1, t2;
	JRadioButton r1, r2;
	JCheckBox c1, c2, c3;
	JTextArea a1, a2;
	JComboBox cb1;	
	ButtonGroup g1;
	JFrame f;
	String[] fav={"Mumbai", "Goa", "Hyderabad", "Banglore", "Silicon Valley", "Gudgaon"};	

	Hello(){
		f = new JFrame();
		l1=new JLabel("Name: ");
		f.add(l1);
		t1 = new JTextField(10);
		f.add(t1);
		l2=new JLabel("Gender: ");
		f.add(l2);
		r1=new JRadioButton("Male");
		f.add(r1);
		r2=new JRadioButton("Female");
		f.add(r2);
		g1= new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		l3=new JLabel("Interest: ");
		f.add(l3);
		c1=new JCheckBox("Music");
		f.add(c1);
		c2=new JCheckBox("Gaming");
		f.add(c2);
		c3=new JCheckBox("Reading");
		f.add(c3);
		l4=new JLabel("Few Places ");
		f.add(l4);
		cb1= new JComboBox(fav);
		f.add(cb1);
		l5=new JLabel("Details: ");
		f.add(l5);
		a1= new JTextArea(10,10);	
		f.add(a1);
		b1=new JButton("Submit");
		f.add(b1);
		b2=new JButton("Exit");
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		a2= new JTextArea(10,10);	
		f.add(a2);

		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(200,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e){
		String salutation;
		String[] interest = new String[3];
		if(e.getSource()==b1){
			String name=t1.getText();
			String details = a1.getText();
			if(r1.isSelected()==true){
				salutation="Mr. ";
			}
			else{
				salutation="Ms. ";
			}

			if(c1.isSelected()==true){
				interest[0]="Music, ";
			}
			else if(c2.isSelected()==true){
				interest[1]="Gaming, ";
			}
			else if(c3.isSelected()==true){
				interest[2]="Reading, ";
			}
			
			String place = (String)cb1.getSelectedItem();
			
			a2.setText("Name:"+salutation+name+"\nInterest: "+interest[0]+interest[1]+interest[2]+"\nFav Place:"+place+"\n Details: "+details);
		}
		else if(e.getSource()==b2){
			f.dispose();
		}
	}
}
class C3{
	public static void main(String[] args){
		Hello h = new Hello();
	}
}