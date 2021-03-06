package BTThucHanh;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Bai1 extends JFrame{
	public static void main(String[] args) {
		new Bai1();
	}
	public Bai1() {
		this.setTitle("Bai 1");
		this.setSize(400,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(4,1));
		
		JLabel l1 = new JLabel("Minh hoa cac phep toan");
		this.add(l1);
		
		JPanel l2 = new JPanel();
		l2.setLayout(new GridLayout(3,2));
		JLabel p1 = new JLabel("Nhap a:");
		l2.add(p1);
		JTextField t1 = new JTextField();	
		l2.add(t1);
		JLabel  p2 = new JLabel("Nhap b:");
		l2.add(p2);
		JTextField t2 = new JTextField();
		l2.add(t2);
		JLabel p3 = new JLabel("Ket qua:");	
		l2.add(p3);
		JTextField t3 = new JTextField();
		l2.add(t3);
		this.add(l2);
		
		JPanel l3= new JPanel();
		JButton b1 = new JButton("Cong");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(t1.getText());
					double b = Double.parseDouble(t2.getText());
					t3.setText(a+b + "");
					
				} catch (Exception e2) {
					t3.setText("ERROR!");
				}
				
			}
		});
		l3.add(b1);
		JButton b2 = new JButton("Tru");
		l3.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(t1.getText());
					double b = Double.parseDouble(t2.getText());
					t3.setText(a-b + "");
					
				} catch (Exception e2) {
					t3.setText("ERROR!");
				}
				
			}
		});
		JButton b3 = new JButton("Nhan");
		l3.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(t1.getText());
					double b = Double.parseDouble(t2.getText());
					t3.setText(a*b + "");
					
				} catch (Exception e2) {
					t3.setText("ERROR!");
				}
				
			}
		});
		JButton b4 = new JButton("Chia");
		l3.add(b4);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(t1.getText());
					double b = Double.parseDouble(t2.getText());
					t3.setText(a/b + "");
					
				} catch (Exception e2) {
					t3.setText("ERROR!");
				}
				
			}
		});
		this.add(l3);
		
		JPanel l4 = new JPanel();
		JButton b5 = new JButton("Edit");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		l4.add(b5);
		JButton b6 = new JButton("Reset");
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		l4.add(b6);
		this.add(l4);
		this.setVisible(true);

	}
}
