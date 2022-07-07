package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TCPTimeClient {
public static void main(String[] args) throws Exception{
	DatagramSocket clientSocket = new DatagramSocket();
	//gan cong
	InetAddress IPAddress = InetAddress.getByName("localhost");
	byte[] sendData= new byte[1024];
	byte[] recieveData = new byte[1024];
	sendData = "getDate".getBytes();
	//tao datagram co noi dung yeu cau loai du lieu gui len server
	DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,IPAddress,9134);
	//gui dl len server
	clientSocket.send(sendPacket);
	//tao datagram rong de nhan du lieu tu server
	DatagramPacket recievePacket =new DatagramPacket(recieveData,recieveData.length);
	//nhan dl tu server		
	clientSocket.receive(recievePacket);
	String str=new String(recievePacket.getData());
	System.out.println(str);
	clientSocket.close();
}
}
