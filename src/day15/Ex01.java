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
		// 프로그램 실행시킬때 반드시 필요
		// 상속받아서 사용 한다 
		A01 a = new A01();
		B01 b = new B01();
		// a.run();
		// b.run();
		
		a.setDaemon(true);
		b.setDaemon(true);
		// 메인이 종료가 되면 다른 Thread 도 종료해라 
		
	
		a.start();
		b.start();
		// start 라는 메소드를 반드시 사용해야한다 
		// run이라는 메소드도 반드시 사용 
		
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		

	}
}
