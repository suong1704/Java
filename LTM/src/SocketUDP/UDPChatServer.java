package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;


public class UDPChatServer {
public static void main(String[] args) throws Exception{
	DatagramSocket serverSocket = new DatagramSocket(9127);
	System.out.println("Server is started");
	byte[] recieveData= new byte[50000];
	byte[] sendData=new byte[50000];
	Scanner kb= new Scanner(System.in);
	while(true) {
		DatagramPacket recievePacket = new DatagramPacket(recieveData, recieveData.length);
		serverSocket.receive(recievePacket);
		InetAddress IPAddress= recievePacket.getAddress();
		int port = recievePacket.getPort();
		String string=new String(recievePacket.getData(),"UTF-8");
		System.out.println("Client: "+string);
		//gui den client
		System.out.println("Server: ");
		sendData = kb.nextLine().toString().getBytes();
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
		kb.reset();
		serverSocket.send(sendPacket);
		
	}
}
}
