package BT_TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChuoiServer implements Runnable{
	static ServerSocket server;
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dos;
	static int port=9999;
	public static ArrayList<Socket> listSK ;
	public static void main(String[] args) throws Exception{
			listSK = new ArrayList<Socket>();
				Thread server1 = new Thread(new ChuoiServer());
				server1.start();		
	}
	// moi socket moi duoc chap nhan -> tao ra mot luong moi
	public ChuoiServer() throws Exception{
		server = new ServerSocket(port);
		System.out .print("Ket noi den cong "+ port);
	}
	@Override
	public void run() {
		try {
				socket = server.accept();
				listSK.add(socket);
				System.out.print(socket);
				din = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				String string = din.readUTF();
				String msg="";
				String msg1 = "In hoa: "+string.toUpperCase() + "\n";
				String msg2 = "In thuong: "+string.toLowerCase()+"\n";
				String msg3 = "Hoa thuong: "+HoaThuong(string) +"\n";
				String msg4 = "Chuoi co "+ SoTu(string) +" tu.\n";
				String msg5 = "Chuoi co "+ NguyenAm(string) +" nguyen am.\n";
				msg=msg1+msg2+msg3+msg4+msg5;
				//for(Socket item : listSK) {
				//	if (item == socket) {
						dos.writeUTF("Ket qua server tra ve: \n"+msg);
						System.out.print("\nserver: " +msg +"\n");
						dos.flush();
					//}
				//}
			
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


