package BT_TCP;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChuoiClient  extends JFrame {
	static Socket socket = new Socket();
	static DataOutputStream dos;
	static DataInputStream din;
	static int port=9999;
	
	private JTextArea textArea= new JTextArea();
	private JTextField textField = new JTextField();
	private JButton button = new JButton("Send");
	
	public static void main(String[] args) throws Exception {
		new ChuoiClient();
	}
	// moi lan nhan Send se tao ra mot socket
	public ChuoiClient() throws Exception{
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
		p1.add(button);
		this.add(p1, BorderLayout.NORTH);
		
		this.add(textArea, BorderLayout.CENTER);
		this.setVisible(true);
	}
}

