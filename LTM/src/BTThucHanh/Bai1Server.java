package BTThucHanh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Bai1Server implements Runnable{
	static ServerSocket server;
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dos;
	static int port=9999;
	public static void main(String[] args) throws Exception{
				Thread server1 = new Thread(new Bai1Server());
				server1.start();		
	}
	// moi socket moi duoc chap nhan -> tao ra mot luong moi
	public Bai1Server() throws Exception{
		server = new ServerSocket(port);
		System.out .print("Ket noi den cong "+ port);
	}
	@Override
	public void run() {
		try {

				socket = server.accept();
				System.out.print(socket);
				din = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				String string = din.readUTF();
				System.out.print("\nserver: " +string +"\n");
				String msg=TinhToan(string);

				//for(Socket item : listSK) {
				//	if (item == socket) {
						dos.writeUTF(msg);
						System.out.print("\nserver: " +msg +"\n");
						dos.flush();
					//}
				//}
			
		} catch (Exception e) {
			System.out.println("Server "+e.getMessage());
		}
	}
	public static String TinhToan(String s) {
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

