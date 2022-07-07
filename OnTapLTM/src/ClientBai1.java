import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
///// TCP
public class ClientBai1 {
	public static void main(String[] args) {
		Socket socket=null;
		try {
			socket = new Socket("localhost", 7999);
			DataInputStream din= new DataInputStream(socket.getInputStream());
			DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
			Scanner kb= new Scanner(System.in);
			while (true) {
				System.out.println("a= ");
				//Nhap chuoi gui len server
				String msg = kb.nextLine();
				dos.writeUTF(msg);
				System.out.println("b= ");
				//Nhap chuoi gui len server
				String msg1 = kb.nextLine();
				dos.writeUTF(msg1);
				System.out.println("toan tu:  ");
				//Nhap chuoi gui len server
				String msg3 = kb.nextLine();
				dos.writeUTF(msg3);
				dos.flush();
				//CLient nhan du lieu tu server gui lai
				String string=din.readUTF();
				System.out.println(string);
				kb=kb.reset();
			}
		} catch (Exception e) {
			System.out.println("Client: "+e.getMessage());
		}
	}
}
