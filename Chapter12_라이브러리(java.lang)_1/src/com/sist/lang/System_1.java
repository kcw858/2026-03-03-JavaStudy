package com.sist.lang;
/*
 *  System
 *  	1) 프로그램 종료
 *  		= System.exit(0) => 0: 정상종료, 나머지: 비정상 종료
 *  		  -------------> 윈도우 종료(웹에서는 사용하지 않는다)
 *  	2) 입출력
 *  		= System.in 
 *  		= System.out
 *  		----------------> 자바 표준 입출력
 *  		System.in.read() : 키보드 입력값을 받을 경우
 *  		---------------> 반드시 예외처리
 *  						 리턴형이 int
 *  			in: InputStream
 *  		System.out.println(): 화면 출력
 *  			out: OutputStream
 *  	3) 메모리 회수
 *  		= System.gc(): 가비지 컬렉션
 *  	4) 시간 측정
 *  		= System.currentTimeMillis()
 *  		  -> 웹 로그파일 만들 때 사용
 *  		  -> System: 대부분이 static으로 만들어져 있다
 */
/*
 *  애플리케이션 개발 => ERP: 윈도우 => GPT
 *  				-> 윈도우폼 공부 x  이벤트 처리 o
 *  웹 개발 : 윈도우 사용없이 브라우저 출력
 */
public class System_1 {

	public static void main(String[] args) {
		int a = 5;
		for(int i = 1; i <= 10 ; i++)
		{
			if(i == a)
			{	
				System.out.println("프로그램 종료");
				System.exit(0); // main 종료 -> 윈도우에서 주로 사용
				//break -> for문 종료
			}
			System.out.println("i= " +i);
		}
		System.out.println("시작");
		System.out.println("GO");
	}

}
