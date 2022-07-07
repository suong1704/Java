package BT_UDP;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.source.tree.WhileLoopTree;


public class UDP_ChuoiClient  extends JFrame {
	static DatagramSocket clientSocket ;
	static DatagramPacket receivePacket;
	static DatagramPacket sendPacket;
	static InetAddress IPAddress;
	static int port=9999;
	
	private JTextArea textArea= new JTextArea();
	private JTextField textField = new JTextField();
	private JButton button = new JButton("Send");
	
	public static void main(String[] args) throws Exception {
		
		new UDP_ChuoiClient();
	}

	public UDP_ChuoiClient() throws Exception{
		
		
		this.setTitle("Client");
		this.setSize(300,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout());
		p1.add(textField);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					clientSocket = new DatagramSocket();
					IPAddress = InetAddress.getByName("localhost");
					byte[] sendData= new byte[50000];
					byte[] receiveData = new byte[50000];
					//while(true) {
						sendData =textField.getText().trim().getBytes();
						sendPacket= new DatagramPacket(sendData, sendData.length,IPAddress,port);
						clientSocket.send(sendPacket);
						receivePacket=new DatagramPacket(receiveData, receiveData.length);
						String string=new String(receivePacket.getData(),"UTF-8");
						textArea.setText(textArea.getText() + "\n" +string);
			
						//clientSocket.close();
					//}
						
						
						
						
//						System.out.println(port);
//						System.out.println(IPAddress);
//						//gui sendPacket cho server 
//						
//						//tao receiPacket nhan du lieu
//						
//						//nhan du lieu
//						clientSocket.receive(receivePacket);
//						//in du lieu
						
					
				} catch (Exception e1) {
					System.out.println("Client "+e1.getMessage());
				}
			}
		});
		p1.add(button);
		this.add(p1, BorderLayout.NORTH);
		
		this.add(textArea, BorderLayout.CENTER);
		this.setVisible(true);
	}
}

