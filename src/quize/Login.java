package quize;

import java.util.HashMap;
import java.util.Scanner;

public class Login {

	public void logfunc() {
			
			int num;
			String id = null, pw, sid, spw ;
			Scanner input = new Scanner(System.in);
			HashMap map = new HashMap();
			
			System.out.println("1. �α��� 2. �� �� 3. �α׾ƿ�");
			System.out.println(">>>");
			num = input.nextInt();
			
			if(num == 3) {
				System.exit(1);
			}else if (num == 2) {
				System.out.println("���̵� �Է�");
				id = input.next();
				System.out.println("��й�ȣ �Է�");
				pw = input.next();
				
				System.out.println("ȸ������ �Ϸ�");
			
			}else if (num == 1) {
				System.out.println("���̵� �Է�");
				sid = input.next();
				System.out.println("��й�ȣ �Է�");
				spw = input.next();
				
				if( spw != map.get(id) && sid != id) {
					System.out.println("�α��� ����");
				}else {
					System.out.println("���� ���");
				}
				
				
			}	
		}
		
}
