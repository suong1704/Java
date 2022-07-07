import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class FibonaxiServer {
	public static void main(String[] args) throws Exception {
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
			int s = Integer.parseInt(string);
			if(checkFibo(s)) serverSocket.close();
			System.out.println(string);
			String msg="";
			sendData=msg.toString().getBytes("UTF-8");
			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress, port);
			serverSocket.send(sendPacket);
		}
	}
	public static boolean checkFibo(int s ){
		   int fn1, fn2, fn;
		   fn1 = 0 ; fn2 = 1;
		   if( s == fn1 || s == fn2 )
		       return true;
		   else{
		       while( true ){
		           fn = fn1 + fn2;
		           fn1 = fn2;
		           fn2 = fn;
		           if( s == fn )
		               return true;
		           if( s < fn )
		               return false;
		       }
		   }
		}
}

