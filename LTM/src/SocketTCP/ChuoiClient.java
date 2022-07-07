package SocketTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ChuoiClient {
public static void main(String[] args) {
	try {
		Socket socket = new Socket("localhost", 7999);
		DataInputStream din= new DataInputStream(socket.getInputStream());
		DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
		Scanner kb= new Scanner(System.in);
		while (true) {
			System.out.println("Nhap chuoi: ");
			//Nhap chuoi gui len server
			String msg = kb.nextLine();
			dos.writeUTF(msg);
			dos.flush();
			//CLient nhan du lieu tu server gui lai
			String string=din.readUTF();
			System.out.println(string);
			kb=kb.reset();
			
			
		}
		
	} catch (Exception e) {
		
	}
	
}
}
