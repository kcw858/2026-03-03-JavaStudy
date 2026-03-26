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
 *  			   Throwable : 에외처리의 최상위, 웹사이트에서 많이 사용
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
 *  
 *  
 *  	UnCheckException : 선택조건
 *  		   |
 *  	RuntimeException
 *  	----------------
 *  			|
 *  	ArrayIndexOutOfBoundsException : 배열범위 초과
 *  	NullpointException: 객체 => null인경우
 *  	ClassCastException: 형변환
 *  	NumberFormatException: 숫자 형변환이 안되는 경우
 *  	ArithmaticException: 0으로 나누는 경우
 *  	---------------------------------------------- 1개만 처리
 *  	
 *  	2. 예외처리 방법
 *  	 1) 직접 처리 => 에러 복구
 *  		try-catch-finally : 가장 많이 사용
 *  	 2) 에러 떠맡기기: 에러 회피
 *  		throws
 *  		선언 => 메소드 호출시에 처리해서 사용
 *  		--------------------------
 *  		소스가 완성이 된 상태 => throws
 *  	 3) 임의 발생: 테스트 (견고한 프로그램)
 *  		throw 
 *  	 4) 사용자 정의 예외처리
 *  		class My extends Exception
 *  		{
 *  		}
 *  		=> throw를 이용해서 호출
 *  	-----------------------------------------
 *  	= 직접처리
 *  		try
 *  		{
 *  			// 정상으로 수행하는 문장
 *  			// 일반 => 처리문장
 *  			// => 예상: 에러 발생에 대한
 *  			
 *  			=>ex) 사용자로부터 문자열 정수를 받아서
 *  						   -------- NumberFormatException
 *  				  배열에 저장
 *  				  ------- ArrayIndexOutOfBoundsException
 *  				  나누기한 값은 출력
 *  				  ----------- ArithmaticException
 *  		}catch(NumberFormatException)
 *  		{
 *  			정수변환오류 =>
 *  		}
 *  		catch(ArrayIndexOutOfBoundsException)
 *  		{
 *  			배열의 범위 초과 =>
 *  		}
 *  		catch(ArithmaticException)
 *  		{
 *  			0으로 나눈경우 =>
 *  		}
 *  		catch(Exception) 
 *  		{
 *  			기타(알 수 없는 예외가 있는 경우) =>
 *  		}
 *  		-------------catch절은 여러개 쓸 수 있지만 상위클래스가 항상 밑에 있는다
 *  		finally
 *  		{
 *  			에러가 있든 없든 무조건 수행
 *  			닫기 (파일 닫기, DB 닫기, 서버 닫기)
 *  				---------------
 *  		}
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

//		try 
//		{
//			Scanner scan = new Scanner(System.in);
//			System.out.print("입력:aaa,bbb,ccc ");
//			String m = scan.next();
//			Class className = Class.forName("com.sist.exception.MyException");
//			Object obj = className.getDeclaredConstructor().newInstance();
//			
//			Method[] methods = className.getDeclaredMethods();
//			
//			//메소드 찾기
//			for(Method mm : methods)
//			{
//				if(mm.getName().equals(m))
//				{
//					mm.invoke(obj, null);
//				}
//			}
//		
//		} catch (Exception ex) {}
		
		try {
			Integer.parseInt("10 ");
		} catch (ArithmeticException e) //0 으로 나누는 에러만 처리하기때문에 처리불가
		{
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
