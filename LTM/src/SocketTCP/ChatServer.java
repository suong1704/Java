package SocketTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class ChatServer {
public static void main(String[] args) throws Exception {
	ServerSocket server = new ServerSocket(7123);
	System.out.println("Server is started");
	Socket socket = server.accept();
	DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
	DataInputStream din = new DataInputStream(socket.getInputStream());
	//NHap chuoi gui den client
	Scanner kb= new Scanner(System.in);
	while(true) {
		//Nhan du lieu tu client
		String string = din.readUTF();
		//Hien thi chuoi nhan duojc tu client
		System.out.println(string);
		System.out.print("Server: ");
		String msg = kb.nextLine();
		dos.writeUTF("Server: "+msg);
		dos.flush();
		kb=kb.reset();
	}
}
}
