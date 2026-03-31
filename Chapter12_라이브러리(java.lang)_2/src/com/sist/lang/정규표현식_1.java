package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//정규표현식 => 원하는 패턴을 가지고 있는 문자열을 검색, 검사하는 클래스
// 문자열 패턴 검색
// 특정 규칙 -> 정규식
/*
 *  정규식 => 자바스크립트, 자바, 오라클
 */
public class 정규표현식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "abc123";
		
		//숫자 포함 여부
		boolean result = msg.matches(".*\\d+.*"); // 여러개의 문자에서 숫자가 포함되어있는지
		
		System.out.println(result);
		
		/*	[] 한개의 문자 => [abc] abc중에 한개
		 * 				  [^abc] abc외의 다른 한문자
		 * 				  [a-zA-Z] 알파벳중에 한개
		 *  숫자: [0-9], \d => (\를 쓰려면 \\로 써야한다)
		 *  \s : 공백
		 *  \w : 한개 알파벳 => [a-zA-Z]
		 *  . : 임의의 한글자
		 *  ? : 한개거나 없음
		 *  * : 0개 이상
		 *  + : 1개 이상
		 *  {n} : n개
		 *  {n,m} : n부터 m까지 (범위)
		 *  a | b : a이거나 b인 경우
		 *  () : 그룹
		 *  
		 *  ((238.142.63).89) => group(1)  group
		 *  					 -------   -----	
		 *  					 1번 그룹     전체
		 *  => replaceAll , split 정규표현식 사용
		 */
		
		String res = "맛있는거,맛있고,맛있게,맛있소,맛있다,맛없다";
		Pattern p = Pattern.compile("맛있.");
		// . => 맛있 뒤에 한글자 존재
		Matcher m = p.matcher(res);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
		System.out.println("===== 데이터 추출 ======");
		String won = "가격: 30000 원";
		String change = won.replaceAll("[^0-9]",""); //숫자빼고 지워라 
		System.out.println(change);
		/*
		 * 이메일 / 전화번호 / 비밀번호 검증
		 * 로그 분석
		 * 크롤링 / 텍스트 마이닝
		 * 문자열 필터링
		 * 
		 * 문자의 규칙(패턴) => 다루는 언어
		 * 
		 * => ^ : 시작
		 * => $ : 끝
		 * 
		 * 	[^0-9] 			^[0-9]
		 *  -----  			------
		 *  |숫자 제외			|숫자로 시작
		 */
	}

}
