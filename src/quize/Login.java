package quize;

import java.util.HashMap;
import java.util.Scanner;

public class Login {

	public void logfunc() {
			
			int num;
			String id = null, pw, sid, spw ;
			Scanner input = new Scanner(System.in);
			HashMap map = new HashMap();
			
			System.out.println("1. 로그인 2. 가 입 3. 로그아웃");
			System.out.println(">>>");
			num = input.nextInt();
			
			if(num == 3) {
				System.exit(1);
			}else if (num == 2) {
				System.out.println("아이디 입력");
				id = input.next();
				System.out.println("비밀번호 입력");
				pw = input.next();
				
				System.out.println("회원가입 완료");
			
			}else if (num == 1) {
				System.out.println("아이디 입력");
				sid = input.next();
				System.out.println("비밀번호 입력");
				spw = input.next();
				
				if( spw != map.get(id) && sid != id) {
					System.out.println("로그인 실패");
				}else {
					System.out.println("인증 통과");
				}
				
				
			}	
		}
		
}
