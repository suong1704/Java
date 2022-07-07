package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;


public class UDPTimeServer {
public static void main(String[] args) throws Exception{
	//gan cong cho ct
	DatagramSocket serverSocket = new DatagramSocket(9134);
	System.out.println("Server is started");
	byte[] recieveData= new byte[1024];
	byte[] sendData=new byte[1024];
	while(true) {
		//tao goi rong de nha du lieu tu client
		DatagramPacket recievePacket = new DatagramPacket(recieveData, recieveData.length);
		//nhan du lieu tu client
		serverSocket.receive(recievePacket);
		//Lay dia chi Ip cua client
		InetAddress IPAddress= recievePacket.getAddress();
		//Lay port cua client
		int port = recievePacket.getPort();
		//lay ngay gio gui cho client
		String request=new String(recievePacket.getData());
		System.out.println(request);
		if(request.trim().equals("getDate"))
			sendData= new Date().toString().getBytes();
		else sendData="Server not know what you want?".getBytes();
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
		//gui dl cho client
		serverSocket.send(sendPacket);
	}
}
}
