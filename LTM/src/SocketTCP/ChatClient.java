package SocketTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class ChatClient {
public static void main(String[] args) throws Exception{
	Socket socket = new Socket("localhost",7123);
	DataInputStream din = new DataInputStream(socket.getInputStream());
	DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
	//Nhap chuoi gui den server
	Scanner kb = new Scanner(System.in);
	while (true) {
		System.out.print("Client: ");
		//Nhap chuoi gui len server
		String msg=kb.nextLine();
		dos.writeUTF("Client: "+msg);
		dos.flush();
		//CLient nhan du lieu tu server gui lai
		String string=din.readUTF();
		System.out.println(string);
		kb=kb.reset();
	}
}
}
