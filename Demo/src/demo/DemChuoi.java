package demo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemChuoi extends JFrame{
	public static void main(String[] args) {
		new DemChuoi();
	}
	public DemChuoi() {
		this.setTitle("");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2,1));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2));
		JLabel l1 = new JLabel("Nhap chuoi:");
		p1.add(l1);
		JTextField t1 = new JTextField();
		t1.setSize(100, 50);
		p1.add(t1);
		JLabel l2 = new JLabel("Thuc hien:");
		p1.add(l2);
		String[] s = {"Dem tu", "Dem tu trung lap" , "Dao Chuoi"};
		JComboBox<String> t2= new JComboBox<String>(s);
		t2.setSize(200, 100);
		p1.add(t2);
		JLabel l3 = new JLabel("Ket Qua:");
		p1.add(l3);
		JTextField t3 = new JTextField();
		//t3.setEditable(false);
		p1.add(t3);
		this.add(p1);
		
		JPanel p2 = new JPanel();
		JButton b1 = new JButton("View");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String s ;
					s= t2.getItemAt(t2.getSelectedIndex());
					String chuoiString = t1.getText();
					String[] string = chuoiString.split("\\s");
					switch (s) {
					case "Dem tu":
						
						t3.setText(string.length +"");
						break;
					case "Dao Chuoi":{
						String daoString = new String();
						for(int i = string.length-1 ; i >=0 ; i--) {
							daoString +=  " "+  string[i];
						}
						t3.setText(daoString);
					}	
					case "Dem tu trung lap":{
						String[] tam = string;
						int dem=1;
						for(int i = 0 ; i< string.length-1 ; i++) {
							for(int j =i+1 ; j<string.length ; j++) {
								if(tam[j] == tam[i]) {
									tam[j] = tam[j+1];
								}
									System.out.println( tam[i] + ": " +dem +" lan");
								
							}
						}
						
					}
					
						break;
					default:
						break;
					}
					
					
				}catch (Exception e2) {
					t3.setText("ERROR!");
				}
				
			}
		});
		p2.add(b1);
		JButton b2 = new JButton("Edit");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		p2.add(b2);
		JButton b3 = new JButton("Reset");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t3.setText("");
				
			}
		});
		p2.add(b3);
		this.add(p2);
		this.setVisible(true);
		}

	
	
}
