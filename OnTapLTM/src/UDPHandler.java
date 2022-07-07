import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPHandler extends Thread{
	private DatagramSocket serverSocket;
	DatagramPacket recievePacket1 =null;
	DatagramPacket recievePacket2 =null;
	DatagramPacket recievePacket3 =null;
	DatagramPacket sendPacket=null;
	byte[] recieveData1= new byte[5000];
	byte[] recieveData2= new byte[5000];
	byte[] recieveData3= new byte[5000];
	byte[] sendData=new byte[5000];
	public UDPHandler(DatagramPacket datagramPacket1 , DatagramPacket datagramPacket2 , DatagramPacket datagramPacket3, DatagramPacket sendpacket) {
		this.recievePacket1=datagramPacket1;
		this.recievePacket2=datagramPacket2;
		this.recievePacket3=datagramPacket3;
		this.sendPacket=sendpacket;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		while(true) {
//			DatagramPacket recievePacket1 = new DatagramPacket(recieveData1, recieveData1.length);
//			serverSocket.receive(recievePacket1);
//			InetAddress IPAddress= recievePacket1.getAddress();
//			int port = recievePacket1.getPort();
//			String string1=new String(recievePacket1.getData(),"UTF-8");
//			System.out.println(string1);
//			
//			
//			String string = new String(TinhToan1(string1));
//			System.out.println(string);
//			
//			sendData=string.toString().getBytes("UTF-8");
//			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
//			serverSocket.send(sendPacket);
//		}
//		byte[] recieveData1= new byte[5000];
//		byte[] recieveData2= new byte[5000];
//		byte[] recieveData3= new byte[5000];
//		byte[] sendData=new byte[5000];
		try {
			recievePacket1 = new DatagramPacket(recieveData1, recieveData1.length);
			serverSocket.receive(recievePacket1);
			InetAddress IPAddress= recievePacket1.getAddress();
			int port = recievePacket1.getPort();
			String string1=new String(recievePacket1.getData(),"UTF-8");
			System.out.println(string1);
			
			recievePacket2 = new DatagramPacket(recieveData2, recieveData2.length);
			serverSocket.receive(recievePacket1);
			String string2=new String(recievePacket1.getData(),"UTF-8");
			System.out.println(string2);
			
			recievePacket3 = new DatagramPacket(recieveData3, recieveData3.length);
			serverSocket.receive(recievePacket3);
			String string3=new String(recievePacket3.getData(),"UTF-8");
			System.out.println(string3);
			
			
			double a = 0.0;
			double b = 0.0;
			a = Double.parseDouble(string1);
			b = Double.parseDouble(string2);
			double kq = TinhToan(a, b, string3);
			System.out.println(kq);
			String string = new String("Ket qua: "+Double.toString(kq));
			sendData=string.getBytes("UTF-8");
			sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
			serverSocket.send(sendPacket);
//		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static double TinhToan(double a , double  b , String c) {
		double kq = 0.0;
		switch (c.trim()) {
		case "+": {
			kq = a+b;
			break;
		}
		case "-": {
			kq = a-b;
			break;
		}
		case "*": {
			kq = a*b;
			break;
		}
		case "/": {
			kq = a/b;
			break;
		}
		default:
			kq=0.0;
			break;
		}
		return kq;
	}
	public static String TinhToan1(String s) {
		String a = "",b="",x="",kq=" ";
		double n = 0.0;
		int count=0;
		s=s.trim();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
				continue;
			}
			if (count == 0) {
				String st = Character.toString(s.charAt(i));
				a+=st;
				System.out.print("\na: " +a +"\n");
			}
			if (count == 1) {
				String st = Character.toString(s.charAt(i));
				x+=st;
				System.out.print("\nx: " +x +"\n");
			}
			if (count == 2) {
				String st = Character.toString(s.charAt(i));
				b+=st;
				System.out.print("\nb: " +b +"\n");
			}
		}
		
		if(x.trim().charAt(0)=='+') n = (Double.parseDouble(a.trim()) + Double.parseDouble(b.trim()));
		if(x.trim().charAt(0) =='-') n = (Double.parseDouble(a.trim()) - Double.parseDouble(b.trim()));
		if(x.trim().charAt(0) =='*') n = (Double.parseDouble(a.trim()) * Double.parseDouble(b.trim()));
		if(x.trim().charAt(0) =='/') n = (Double.parseDouble(a.trim()) / Double.parseDouble(b.trim()));
		System.out.print("\nb: " +n +"\n");
		System.out.print("\nb: " +Double.parseDouble(a.trim()) +"\n");
		kq = Double.toString(n);
		return kq;
	}
}
