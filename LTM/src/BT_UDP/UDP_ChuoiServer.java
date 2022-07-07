package BT_UDP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class UDP_ChuoiServer implements Runnable{
	static DatagramSocket serverSocket ;
	static DatagramPacket receivePacket;
	static DatagramPacket sendPacket;
	static InetAddress IPAddress;
	static int port=9999;
	
	//public static ArrayList<Socket> listSK ;
	public static void main(String[] args) throws Exception{
			//listSK = new ArrayList<Socket>();
			Thread server1 = new Thread(new UDP_ChuoiServer());
			server1.start();		
	}
	// moi receivePacket moi duoc chap nhan -> tao ra mot luong moi -> nhan va gui du lieu di
	public UDP_ChuoiServer() throws Exception{
		
	//	System.out .print("Ket noi den cong "+ port);
	}
	@Override
	public void run() {
		try {
				serverSocket = new DatagramSocket();
				
				while(true) {
					byte[] recieveData= new byte[500000];
					byte[] sendData=new byte[500000];
					receivePacket = new DatagramPacket(recieveData, recieveData.length);
					serverSocket.receive(receivePacket);
					IPAddress= receivePacket.getAddress();
					port = receivePacket.getPort();
					System.out.println(IPAddress+"\n"+port);
					String string=new String(receivePacket.getData(),"UTF-8");
					System.out.println(string);
					String msg="";
					String msg1 = "In hoa: "+string.toUpperCase() + "\n";
					String msg2 = "In thuong: "+string.toLowerCase()+"\n";
					String msg3 = "Hoa thuong: "+HoaThuong(string) +"\n";
					String msg4 = "Chuoi co "+ SoTu(string) +" tu.\n";
					String msg5 = "Chuoi co "+ NguyenAm(string) +" nguyen am.\n";
					msg=msg1+msg2+msg3+msg4+msg5;
					sendData=msg.toString().trim().getBytes("UTF-8");
					sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
					serverSocket.send(sendPacket);
				}
		} catch (Exception e) {
			System.out.println("Server "+e.getMessage());
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
		s=s.trim();
		for(int i=0; i<s.length();i++) {
			if (i==s.length()-1) count++;
			if(s.charAt(i)==' ' && s.charAt(i+1) != ' ') count++;
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


