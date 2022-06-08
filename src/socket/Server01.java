package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server01 {
	// ���񽺸� �����ϴ� 

	public static void main(String[] args) throws IOException {
	
		ServerSocket server = new ServerSocket(12345);
		System.out.println("������ ��ٸ��ϴ�");
	
			Socket sock = server.accept(); 
			// accept : ������� ���� (client)
			System.out.println("���� �Ǿ����ϴ�");
			
			// ���� ���� 
			/*
			InputStream in = sock.getInputStream();
			// Stream : �������ִ� ��� 
			System.out.println("���� ��� ...");
			int readData = in.read();
			System.out.println("���� ������ : " + readData);
			*/
			
			// ���ڿ� ���� 
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			// �⺻ Stream �� �ް� ������ �� ��Ȳ 
			System.out.println("���� ��� ...");
			String readData = dis.readUTF();
			System.out.println("���� ������ : " + readData);
			
			OutputStream os = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			Scanner input = new Scanner(System.in);
			
			String str; 
			System.out.println("�������� �Է�");
			str = input.next();
			dos.writeUTF(str);
			System.out.println("���� ����");
	}
}
