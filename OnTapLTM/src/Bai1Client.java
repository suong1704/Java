import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai1Client extends JFrame{
	private JTextField jTextField1 ;
	private JTextField jTextField2 ;
	private JTextField jTextField3 ;
	private JButton cong;
	private JButton tru;
	private JButton nhan;
	private JButton chia;
	
	static ServerSocket server;
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dos;
	static int port=9999;
	
	
	public static ArrayList<Socket> listSK ;
	
	public static void main(String[] args) throws Exception{
		new Bai1Client();
	}
	public Bai1Client() throws  IOException{
		
		socket = new Socket("localhost",port);
		System.out.println(socket.getLocalPort());
		din = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		
		this.setTitle("Client");
		this.setSize(400,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4,1));
		
		JPanel l2 = new JPanel();
		l2.setLayout(new GridLayout(3,2));
		
		JLabel p1 = new JLabel("Nhap a:");
		l2.add(p1);
		jTextField1 = new JTextField();	
		l2.add(jTextField1);
		
		JLabel  p2 = new JLabel("Nhap b:");
		l2.add(p2);
		jTextField2 = new JTextField();
		l2.add(jTextField2);
		JLabel p3= new JLabel("Ket qua:");	
		l2.add(p3);
		jTextField3 = new JTextField();
		l2.add(jTextField3);
		this.add(l2);
		
		JPanel l3= new JPanel();
		cong= new JButton("Cong");
		cong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					dos.writeUTF(jTextField1.getText().toString());
					dos.writeUTF(jTextField2.getText().toString());
					dos.writeUTF(cong.getText().toString());				
					dos.flush();
					jTextField3.setText(din.readUTF());
				} catch (Exception e1) {
					System.out.println("client :"+e1.getMessage());
					
				}
				
			}
		});
		l3.add(cong);
		tru = new JButton("Tru");
		tru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					dos.writeUTF(jTextField1.getText());
					dos.writeUTF(jTextField2.getText());
					dos.writeUTF(tru.getText());
					dos.flush();
					jTextField3.setText(din.readUTF());
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
					
				}
				
			}
		});
		l3.add(tru);
		nhan = new JButton("Nhan");
		nhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					dos.writeUTF(jTextField1.getText());
					dos.writeUTF(jTextField2.getText());
					dos.writeUTF(nhan.getText());
					dos.flush();
					jTextField3.setText(din.readUTF());
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
					
				}
				
			}
		});
		l3.add(nhan);
		chia = new JButton("Chia");
		chia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					dos.writeUTF(jTextField1.getText());
					dos.writeUTF(jTextField2.getText());
					dos.writeUTF(chia.getText());
					dos.flush();
					jTextField3.setText(din.readUTF());
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
					
				}
				
			}
		});
		l3.add(chia);
		this.add(l3);
		this.setVisible(true);
	}
}
