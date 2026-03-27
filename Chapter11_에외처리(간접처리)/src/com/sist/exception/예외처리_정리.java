package com.sist.exception;
/*
 *  1. 예외 복구
 *  	-try
 *  	 = 정상 실행이 가능 코딩
 *  	 = 에러가 발생할 수 있다 (실수, 입력) => 사전에 방지
 *  	 = 에러가 나면 skip후 catch로 이동
 *  	 1
 *  	 2
 *  	 ------
 *       3 = 에러 ==> catch
 *       4
 *       5
 *       ------skip
 *       
 *  	-catch
 *  	  1. 에러 확인이 가능
 * 			 printStackTrace / getMessage
 * 			 | 에러 위치 확인	   | 에러 메세지만 전송
 * 			 | 실행되는 과정	   
 * 		  2. 에러 복구가 가능
 * 			=> 이동: goto (사용 금지)
 * 
 *  	-finally
 *  	  생략이 가능
 *  		= try/catch 상관없이 무조건 수행
 *  		= 서버/DB/파일 닫기
 *  
 *  	** catch: 에러 발생시 처리
 *  		=> 다중 catch 가능
 *			=> 통합: 나열하지말고 Exception/Throwable  하나만 쓰기
 *		** 자동 close호출
 *			=> try-with-resource
 *  
 *  2. 에외 회피: 에러를 등록해서 컴파일시에 통과
 *  	throws => 특별한 경우가 아니면 throws문장은 많이 없다
 *  	------ 한글변환
 *  
 *  	자바글자 ---- 브라우저 
 *  			Encoding ------ Decoding  ------ 자바글자
 *  							=>UTF-8
 *  	
 *  	=> 소스가 긴 경우 / try~catch 위치 설정이 안되는 경우
 *  	   ----------유지 보수
 *  	
 *  	=> 메소드() throws ....
 *  	 - 사용자 메소드보다 라이브러리에 많이 있다 
 *  
 *  3. 임의 발생 : catch찾기:-> throw
 *   => 필요시에는 직접 예외를 만들어서 사용
 *   			------ 호출시는 반드시 throw new 클래스()
 *   	throws: 예상되는 에러를 선언한다
 *   			=> 메소드 호출시 예외처리를 한 다음 사용
 *   			=> throws / try~catch
 *   	throw: 견고한 프로그램인지 확인
 */
public class 예외처리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
