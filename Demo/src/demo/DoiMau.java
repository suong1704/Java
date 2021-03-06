package demo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DoiMau extends JFrame{
	public static void main(String[] args) {
		new DoiMau();
	}
	public DoiMau() {
		this.setTitle("Doi Mau");
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		final DoiMau tDoiMau = this;
		
		JButton b1 = new JButton("Green");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tDoiMau.getContentPane().setBackground(Color.green);				
			}
		});
		this.add(b1);
		this.setVisible(true);
	}
	
}
