package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 	에러가 나는 이유
 * 	 => 컴파일시 에러 / 실행시 에러 -> JavaScript연동
 * 					 파일이동?page=1   <- 띄어쓰기 주의
 * 		-javac       -java
 * 
 * 	 => 1. 사용자 입력 => 유효성 검사 if문
 * 			- 예외처리 선택적
 * 			- UnCheckException
 * 		2. 개발자 실수: 예외처리
 * 			ip주소, URL주소, DB연결, 파일명
 * 			- 예외처리 필수
 * 			- CheckExcepton
 * 		----------------------- 수정이 가능: 예외
 * 		3. 생각하지 못한 에러
 * 		-----------------에러
 *  예외처리
 *   => 소스상에서 수정이 가능한 에러
 *   
 *  예외처리 범위(상속도)
 *  위로 갈수록 범위가 커진다
 *  
 *  				Object
 *  				  |
 *  			   Throwable : 에외처리의 최상위
 *  				  |
 *  		-------------------
 *  		|				  |
 *  	  Error			  Exception
 *  						  |
 *  			-------------------------------
 *  			|							  |
 *  	  -IOException :
 *  		입출력 = 메모리, 네트워크, 파일
 *  				| 표준
 *  			   System.out
 *  			   System.in
 *  	  -ClassNotFoundException :
 *  		 리플렉션: 클래스 정보를 읽어
 *  				메모리 할당 /메소드 호출
 *  				변수값지정, new없이 메모리할당 가능
 *  	  -MalformedURLException :
 *  			URL주소
 *  	  -InterruptedException :
 *  			Thread 충돌 오류
 *  	  -SQLException
 *  	  ----------------------------무조건 예외처리
 *  	  ----------------------------CheckException
 */

class MyException
{
	public void aaa()
	{
		System.out.println("MyException:aaa() Call...");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void bbb()
	{
		System.out.println("MyException:bbb() Call...");
	}
	public void ccc()
	{
		System.out.println("MyException:ccc() Call...");
	}
}

public class 예외처리_1 {

	public static void main(String[] args) {

		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("입력:aaa,bbb,ccc ");
			String m = scan.next();
			Class className = Class.forName("com.sist.exception.MyException");
			Object obj = className.getDeclaredConstructor().newInstance();
			
			Method[] methods = className.getDeclaredMethods();
			
			//메소드 찾기
			for(Method mm : methods)
			{
				if(mm.getName().equals(m))
				{
					mm.invoke(obj, null);
				}
			}
		
		} catch (Exception ex) {}
	}

}
