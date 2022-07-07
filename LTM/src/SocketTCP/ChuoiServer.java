package SocketTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ChuoiServer {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(7999);
		System.out.println("Server is started");
		Socket socket = server.accept();
		DataInputStream din= new DataInputStream(socket.getInputStream());
		DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
		Scanner kb= new Scanner(System.in);
		while (true) {
			//nhan chuoi tu client
			String string = din.readUTF();
			String msg="";
			String msg1 = string.toUpperCase() + "\n";
			String msg2 = string.toLowerCase()+"\n";
			String msg3 = HoaThuong(string) +"\n";
			String msg4 = "Chuoi co "+ SoTu(string) +" tu.\n";
			String msg5 = "Chuoi co "+ NguyenAm(string) +" nguyen am.\n";
			msg=msg1+msg2+msg3+msg4+msg5;
			dos.writeUTF("Ket qua server tra ve: "+msg);
			dos.flush();
			kb=kb.reset();		
		}
	
	} 
	public static String HoaThuong(String s) {
		String string ="";
		for(int i=0; i<s.length();i++) {
			String st = Character.toString(s.charAt(i));
			if(st==st.toLowerCase()) string+=st.toUpperCase();
			else string+=st.toLowerCase();
		}
		return string;
	}
	public static int SoTu(String s) {
		int count=0;
		s=s.trim()+" ";
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' ') count++;
		}
		return count;
	}
	public static int NguyenAm(String s) {
		int count =0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='u' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='i')
				count++;
		}
		return count;
	}
	
}
