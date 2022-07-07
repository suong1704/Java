package SocketTCP;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPTimeServer {
 public static void main(String[] args) throws Exception {
	ServerSocket server = new ServerSocket(7788);
	System.out.println("Server is stared");
	while (true) {
		Socket socket= server.accept(); // ket noi duowc thiet lap
		DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
		String time = new Date().toString();
		dos.writeUTF("Server tra lai ngay gio = "+time);
		socket.close();
	}
}
}
