import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ServerBai1 {
	public static final int NUM_OF_THREAD = 4;
	public static void main(String[] args) throws Exception{
		ExecutorService executor = Executors.newFixedThreadPool(NUM_OF_THREAD);
		ServerSocket server = new ServerSocket(7999);
		System.out.println("Server is started");
		while (true) {
			Socket socket = server.accept();
			Handler handler = new Handler(socket);
			executor.execute(handler);
//			DataInputStream din= new DataInputStream(socket.getInputStream());
//			DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
//			Scanner kb= new Scanner(System.in);
//			double a = 0.0;
//			double b = 0.0;
//			String c = null;
//			a = Double.parseDouble(din.readUTF());
//			b = Double.parseDouble(din.readUTF());
//			c = din.readUTF();
//			double kq = TinhToan(a, b, c);
//			System.out.println(kq);
//			dos.writeUTF("Ket qua: "+Double.toString(kq));
//			dos.flush();
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
}
