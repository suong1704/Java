import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientBai1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket clientSocket=null; 
//		try {
			clientSocket = new DatagramSocket();
			InetAddress IPAddress = InetAddress.getByName("localhost");
//			byte[] sendData= new byte[50000];
//			byte[] receiveData = new byte[50000];
			byte[] sendData1= new byte[5000];
			byte[] sendData2= new byte[5000];
			byte[] sendData3= new byte[5000];
			byte[] receiveData = new byte[5000];
			Scanner kb= new Scanner(System.in);
			while (true) {
			
				System.out.println("a= ");
				sendData1 = kb.nextLine().getBytes();
				DatagramPacket sendPacket1= new DatagramPacket(sendData1, sendData1.length,IPAddress,9113);
				clientSocket.send(sendPacket1);
				
				System.out.println("b= ");
				sendData2 = kb.nextLine().getBytes();
				DatagramPacket sendPacket2= new DatagramPacket(sendData2, sendData2.length,IPAddress,9113);
				clientSocket.send(sendPacket2);
				
				System.out.println("Toan tu:  ");
				sendData3 = kb.nextLine().getBytes();
				DatagramPacket sendPacket3= new DatagramPacket(sendData3, sendData3.length,IPAddress,9113);
				clientSocket.send(sendPacket3);
				
				//nhan data tra ve
				DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
				clientSocket.receive(receivePacket);
				String string1=new String(receivePacket.getData(),"UTF-8");
				System.out.println(string1);
//				clientSocket.close();
			}
//		try {
//			clientSocket = new DatagramSocket();
//			InetAddress IPAddress = InetAddress.getByName("localhost");		
//			Scanner kb= new Scanner(System.in);
//			while (true) {
//				byte[] sendData1= new byte[500000];
//				byte[] sendData2= new byte[500000];
//				byte[] sendData3= new byte[500000];
//				byte[] receiveData = new byte[500000];
//				
//				System.out.println("a= ");
//				String a = kb.nextLine();
//
//				
//				System.out.println("b= ");
//				String b = kb.nextLine();
//						
//				System.out.println("Toan tu:  ");
//				String c = kb.nextLine();
//				
//				String string = new String(a+c+b);
//				sendData3 = string.getBytes();
//
//				DatagramPacket sendPacket3= new DatagramPacket(sendData3, sendData3.length,IPAddress,9113);
//				clientSocket.send(sendPacket3);
//				
//				//nhan data tra ve
//				DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
//				clientSocket.receive(receivePacket);
//				String string1=new String(receivePacket.getData(),"UTF-8");
//				System.out.println(string1);
//				clientSocket.close();
//			}
//		}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
	}
	
}

