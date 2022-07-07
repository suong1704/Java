package BT_TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class TCP_ChatServer implements Runnable{
	static ServerSocket server;
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dos;
	static int port=9999;
	public static ArrayList<Socket> listSK ;
	public static void main(String[] args) {
		
	}
	@Override
	public void run() {
		try {
			socket = server.accept();
			listSK.add(socket);
			System.out.print(socket);
			din = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			String string = din.readUTF();
			String msg="";
			
			for(Socket item : listSK) {
				String nString = Integer.toString(item.getLocalPort());
				msg = nString +string;
				dos.writeUTF("Ket qua server tra ve: \n"+msg);
				System.out.print("\nserver: " +msg +"\n");
				dos.flush();
			}
		
	} catch (Exception e) {
		System.out.println("Server "+e.getMessage());
	}
		
	}
		
}

