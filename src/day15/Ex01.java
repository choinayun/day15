package day15;

class A01 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("A01 : " + i);
		}
	}
}

class B01 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("B01 : " + i);
		}
	}	
}

public class Ex01 {

	public static void main(String[] args) {
		 
		// Thread
		// ���α׷� �����ų�� �ݵ�� �ʿ�
		// ��ӹ޾Ƽ� ��� �Ѵ� 
		A01 a = new A01();
		B01 b = new B01();
		// a.run();
		// b.run();
		
		a.setDaemon(true);
		b.setDaemon(true);
		// ������ ���ᰡ �Ǹ� �ٸ� Thread �� �����ض� 
		
	
		a.start();
		b.start();
		// start ��� �޼ҵ带 �ݵ�� ����ؾ��Ѵ� 
		// run�̶�� �޼ҵ嵵 �ݵ�� ��� 
		
		System.out.println("���α׷� ����");
		System.out.println("���α׷� ����");
		System.out.println("���α׷� ����");
		System.out.println("���α׷� ����");
		

	}
}
