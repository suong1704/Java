import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Handler extends Thread{
	private Socket socket;
	public Handler(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
		try {
			DataInputStream din= new DataInputStream(socket.getInputStream());
			DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
			Scanner kb= new Scanner(System.in);
			double a = 0.0;
			double b = 0.0;
			String c = null;
			a = Double.parseDouble(din.readUTF());
			b = Double.parseDouble(din.readUTF());
			c = din.readUTF();
			double kq = TinhToan(a, b, c);
			System.out.println(kq);
			dos.writeUTF("Ket qua: "+Double.toString(kq));
			dos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Server: "+e.getMessage());
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
