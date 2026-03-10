// 문자열 비교 => equals

import java.util.Scanner;
public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// 로그인 처리
		
		Scanner scan = new Scanner(System.in);
		//admin/1234 입력시 로그인
		System.out.print("아이디 입력: ");	
		String id = scan.next();
		
		System.out.print("비밀번호 입력: ");	
		String pwd = scan.next();
		
		if(id.equals("admin") && pwd.equals("1234"))
		//if(id == "admin" && pwd == "1234") //문자열은 주소값 비교로 틀리다고 나온다.
		{
			System.out.println("로그인 되었습니다!!");
		}
		else
		{
			System.out.println("ID나 password가 틀립니다!!");
			
		}
		
		
	}

}
