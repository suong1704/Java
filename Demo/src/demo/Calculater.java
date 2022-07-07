package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculater extends JFrame{
	public static void main(String[] args) {
		new Calculater();		
	}
	public Calculater() {
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 400);
		
		
		this.setLayout(new BorderLayout());
		
		JTextField p1 = new JTextField("0");
		p1.setFont(new Font("arial" , Font.BOLD , 50));
		p1.setHorizontalAlignment(JTextField.RIGHT);
		p1.setEditable(false);
		this.add(p1 , BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		this.add(p2 , BorderLayout.CENTER);
		
		String nut[][] = new String[][] {{"CE" , "C" , "BACK" , "/"},
			{"7", "8", "9" , "*"},
			{"4" , "5" , "6" , "-"},
			{"1" , "2" , "3" , "+"},
			{"+/-" , "0" , "." , "="}
		};
		
		p2.setLayout(new GridLayout(5,4));
		for(int i=0 ; i<5 ; i++  )
			for (int j = 0 ; j<4 ; j++) {
				JButton button = new JButton(nut[i][j]);
				button.setBackground(Color.gray);
				p2.add(button);
			}
		this.setVisible(true);
	
	}
	
}
