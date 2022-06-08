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
	// 서비스를 제공하는 

	public static void main(String[] args) throws IOException {
	
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다립니다");
	
			Socket sock = server.accept(); 
			// accept : 사용자의 연결 (client)
			System.out.println("접속 되었습니다");
			
			// 숫자 전송 
			/*
			InputStream in = sock.getInputStream();
			// Stream : 연결해주는 통로 
			System.out.println("수신 대기 ...");
			int readData = in.read();
			System.out.println("수신 데이터 : " + readData);
			*/
			
			// 문자열 전송 
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			// 기본 Stream 을 받고서 변형을 한 상황 
			System.out.println("수신 대기 ...");
			String readData = dis.readUTF();
			System.out.println("수신 데이터 : " + readData);
			
			OutputStream os = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			Scanner input = new Scanner(System.in);
			
			String str; 
			System.out.println("서버에서 입력");
			str = input.next();
			dos.writeUTF(str);
			System.out.println("서버 종료");
	}
}
