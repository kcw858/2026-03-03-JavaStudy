package com.sist.exception;

import java.io.FileReader;

/*
 *  String id,pwd,name
 *  int age
 *  double ki
 *  ....
 *  
 *  IllegalArgumentException
 */
public class 예외처리_6 {

	public static void main(String[] args) {
		//UncheckedException
		//=> NumberFormatException
		//웹/윈도우/모바일 -> 서버에서 데이터 전송 / 브라우저에서 전송 받으면
		//모든 데이터가 문자열로 들어온다
		// ?no=10 -> String no = request.getParameter("no")
		
		//=> NullPointerException
		//-> 500 자바코드 에러
		
		//=> IllegalArgumentException
		//-> 매개변수값이 다른경우
		
		String image = null;
		// => 오라클: IS NOT NULL
		try 
		{
			System.out.println(image.length());//catch절 수행
			System.out.println("image를 브라우저에 출력");
		} catch (NullPointerException e) 
		{
			System.out.println("이미지 없을을 보내라");
		}
		
		/*
		 *  String page = request.getParameter("page");
		 *  => 문제
		 *  if(page == null)
		 *  	page="1";    default는 1
		 */
		
		//FileReader in = new FileReader("");
		//CheckedException 반드시 예외처리
		
	}

}
