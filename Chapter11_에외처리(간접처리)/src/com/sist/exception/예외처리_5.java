package com.sist.exception;
/*
 *  try-catch 기본 구조
 *  throw VS throws 차이
 *  finally 역할
 *  try-with-resource
 *  ------------------------------
 *  
 *  throws
 *  예외 선언 => 예외 회피 => 다음에 호출시 예외처리를 해야한단
 *  					 ----------------------
 *  					=> 예외 떠맡기기: 예상만 한다
 *  => 라이브러리에 많이 등장
 *  => 일반 개발자 -> try-catch를 주로 사용
 *  	=> try~catch:80% throws:20%
 *  => 형식)
 *  	[접근지정어][제어어] 리턴형 메소드명(매개변수..) throws
 *  										Exception,NumberFormatException,....
 *  										---------------------------------------순서가 없다
 *  										기본: throws Exception
 *  											 throws Throwable
 *  => 호출시 예외처리후 사용
 *  
 *  	void div(int a,int b) throws ArimethicException 
 *  	{
 *  		System.out.println(a/b);
 *  	}
 *  
 *  	main()
 *  	{
 *  		div(10,0); //오류가 없다
 *  		//0으로 나누는 에러는 UnCheckedException
 *  		//Exception이 었다면 반드시 예외처리
 *  	}
 *  
 *  	===========================================
 *  	checkedException		UnCheckedException
 *  	| 컴파일시 검사				| 선택사항
 *  	(예외 처리가 되어 있는지)
 *  	필수사항
 *  	=> java.io, java.net
 *  		java.sql...
 *  	=> 예외처리중 가장 큰 클래스 사용
 *  		Exception / Throwable
 *  	=> throws 뒤에 보통 checkedException이 붙는다
 */
public class 예외처리_5 {
	public static void div(int a,int b) throws Exception,ClassNotFoundException,InterruptedException //상위 예외처리가 있으면 하나만 쓴다
	{
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) throws Exception //여러개 떠맡아도 가장 큰거 하나로 다시 떠넘기기 가능
	{
			div(10, 3);
			//직접 처리: try-catch로 처리
			//다음 호출시 처리: throws
	}

}
