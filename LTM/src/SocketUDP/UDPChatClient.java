package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class UDPChatClient {
public static void main(String[] args) throws Exception{
	DatagramSocket clientSocket = new DatagramSocket();
	InetAddress IPAddress = InetAddress.getByName("localhost");
	byte[] sendData= new byte[50000];
	byte[] receiveData = new byte[50000];
	Scanner kb= new Scanner(System.in);
	while (true) {
		System.out.print("Client: ");
		//Nhap chuoi gui len server
		sendData=kb.nextLine().toString().getBytes();
		DatagramPacket sendPacket= new DatagramPacket(sendData, sendData.length,IPAddress,9127);
		clientSocket.send(sendPacket);
		//nhan chuoi tra ve
		System.out.print("Server: ");
		DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		String string=new String(receivePacket.getData(),"UTF-8");
		System.out.println(string);
		kb.reset();
		clientSocket.close();
	}
}
}
