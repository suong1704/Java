import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Bai1Server extends Thread{
	private ServerSocket server;
	private Socket socket;
	private DataInputStream din ;
	private DataOutputStream dos ;
	private int port=9999;
//	public static ArrayList<Socket> listSK ;
	public static void main(String[] args) throws Exception{
//		Bai1Server bai1 = new Bai1Server();
//		bai1.open();
//		bai1.start();
		Thread server1 = new Thread(new Bai1Server());
		server1.start();
	}
	public Bai1Server() throws Exception {
		server = new ServerSocket(port);
		socket = server.accept();
		din = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("Ket noi den cong "+ port);
	}
	@Override
	public void run() {
		while (true) {
			try {
//				Socket socket = server.accept();
//				DataInputStream din = new DataInputStream(socket.getInputStream());
//				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//				Socket socket = new Socket();
//				socket = server.accept();
//				din = new DataInputStream(socket.getInputStream());
//				dos = new DataOutputStream(socket.getOutputStream());
				double a = 0.0;
				double b = 0.0;
				String c = null;
				a = Double.parseDouble(din.readUTF());
				b = Double.parseDouble(din.readUTF());
				c = din.readUTF();
				double kq = TinhToan(a, b, c);
				dos.writeUTF(Double.toString(kq));
				dos.flush();
			} catch (Exception e) {
				System.out.print("Server: " + e.getMessage());
			}
			
		}
	}
	public double TinhToan(double a , double  b , String c) {
		double kq = 0.0;
		switch (c.trim()) {
		case "Cong": {
			kq = a+b;
			break;
		}
		case "Tru": {
			kq = a-b;
			break;
		}
		case "Nhan": {
			kq = a*b;
			break;
		}
		case "Chia": {
			kq = a/b;
			break;
		}
		default:
			kq=1.0;
			break;
		}
		return kq;
	}
	
}