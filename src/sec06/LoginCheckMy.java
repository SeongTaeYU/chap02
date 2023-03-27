package sec06;

import java.util.Scanner;

public class LoginCheckMy {// c s

	public static void main(String[] args) {// m s
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========로그인===========");
		String id = "java";
		String password = "1234";

		System.out.println("아이디 : ");
		String srtid = sc.nextLine();

		System.out.println("패스워드 : ");
		String pwd = sc.nextLine();
		int num1 = Integer.parseInt(pwd);
		
		if(id.equals(srtid)) {
			if(password.equals(pwd)) {
				System.out.println(srtid+"님 환영합니다.");
				
			}else {
				System.out.println("PASSWORD를 잘못입력하셨습니다.접속에 실패하셨습니다.");
			}
			
		}else {
			System.out.println("ID를 잘못 입력하셨습니다.접속에 실패하셨습니다.");
		}
		sc.close();
		

	}// m e

}// c e
