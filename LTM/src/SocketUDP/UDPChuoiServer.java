package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPChuoiServer {
public static void main(String[] args) throws Exception{
	DatagramSocket serverSocket = new DatagramSocket(9113);
	System.out.println("Server is started");
	byte[] recieveData= new byte[50000];
	byte[] sendData=new byte[50000];
	while(true) {
		DatagramPacket recievePacket = new DatagramPacket(recieveData, recieveData.length);
		serverSocket.receive(recievePacket);
		InetAddress IPAddress= recievePacket.getAddress();
		int port = recievePacket.getPort();
		String string=new String(recievePacket.getData(),"UTF-8");
		System.out.println(string);
		String msg="";
		String msg1 = string.toUpperCase().trim() + "\n";
		String msg2 = string.toLowerCase().trim()+"\n";
		String msg3 = HoaThuong(string).trim() +"\n";
		String msg4 = "Chuoi co "+ SoTu(string) +" tu.\n";
		String msg5 = "Chuoi co "+ NguyenAm(string) +" nguyen am.\n";
		msg=msg1+msg2+msg3+msg4+msg5;
		sendData=msg.toString().getBytes("UTF-8");
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
		serverSocket.send(sendPacket);
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
