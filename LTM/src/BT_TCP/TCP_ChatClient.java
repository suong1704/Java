package BT_TCP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class TCP_ChatClient extends JFrame{
	static Socket socket = new Socket();
	static DataOutputStream dos;
	static DataInputStream din;
	static int port=9999;
	
	private JTextArea textArea= new JTextArea();
	private JTextField textField = new JTextField(20);
	private JButton btSend = new JButton("Send");
	private JButton btBye = new JButton("Bye");
	private JButton btConnect = new JButton("Connect");
	
	public static void main(String[] args) throws Exception {
		new TCP_ChatClient();
	}
	public TCP_ChatClient()  throws Exception{
		
		this.setTitle("Client");
		this.setSize(450,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.add(textArea, BorderLayout.CENTER);
		 
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(btBye);
//		p1.add(btConnect);
		p1.add(textField);
		p1.add(btSend);
		btSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					while (textField.getText().trim() != "") {
						socket = new Socket("localhost",port);
						System.out.print(socket);
						din = new DataInputStream(socket.getInputStream());
						dos = new DataOutputStream(socket.getOutputStream());				
						dos.writeUTF(textField.getText().trim());
						dos.flush();
						 // CLient nhan du lieu tu server gui lai
						String string =din.readUTF();
						textArea.setText(textArea.getText()+"\n"+string);
						textField.setText(" ");
					}
				} catch (Exception e1) {
					System.out.println("Client "+e1.getMessage());
				}
			}
		});
		btBye.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
//				try {
//					socket.close();
//				} catch (IOException e1) {
//					System.out.println("Client1 "+e1.getMessage());
//				}
				
			}
		});
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					while (textField.getText().trim() != "") {
//						socket = new Socket("localhost",port);
//						System.out.print(socket);
//						din = new DataInputStream(socket.getInputStream());
//						dos = new DataOutputStream(socket.getOutputStream());				
//						dos.writeUTF(textField.getText().trim());
//						dos.flush();
//						 // CLient nhan du lieu tu server gui lai
//						String string =din.readUTF();
//						textArea.setText(textArea.getText()+"\n"+string);
//						textField.setText(" ");
//					}
//				} catch (Exception e1) {
//					System.out.println("Client "+e1.getMessage());
//				}
//			}
//		});
		this.add(p1, BorderLayout.SOUTH);
		
		this.setVisible(true);
}
}



