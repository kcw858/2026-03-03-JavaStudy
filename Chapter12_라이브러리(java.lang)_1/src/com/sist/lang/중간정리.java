package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  java.lang => 기본 클래스가 저장
 *   => 라이브러리 -> 메소드
 *   
 *  Object: 최상위 클래스 / 모든 클래스의 상위 / 가장 큰 데이터형
 *   데이터가 여러개 있는 경우 => 배열
 *   Object[] obj = {10,10.5,'A',"aaa",new A()};
 *   = String toString() => 객체 메모리 주소를 문자열 리턴
 *   		  ---------> 오버라이딩 => 변수값 출력
 *   		  ---------> 생략이 가능 A a = new A();	 System.out.println(a)
 *   = boolean equals(Object o) => 객체 비교 (주소값 비교)
 *   			=> 실제 값을 비교할때 오버라이딩
 *   = Object clone() => 같은 값을 가지고 새로운 메모리 제작
 *   			=> Spring -> prototype
 *   			=> git Clone -> repository를 그대로 복제
 *   = int hashCode(): 구분자 (객체)
 *   
 *  String: 문자열 
 *   = int length(): 문자의 갯수
 *   = boolean equals(String s): 문자 값을 비교
 *   	=> 로그인 / 상세보기 / 아이디 중복
 *   = boolean startsWith(String s): 시작문자열이 같을 때
 *   	=> 쿠키 찾기 / 자동 완성기
 *   = boolean contains(String s): 포합된 문자 찾기
 *   	=> 검색
 *   = int indexOf(문자,문자열): 앞에서부터 문자 찾기
 *   = int lastOfIndex(문자,문자열): 뒤에서부터 문자 찾기
 *   = String replace(문자,문자열): old를 new로 변환
 *   				  ---  ----
 *   				  old   new
 *   = String replaceAll(문자열,변경될 문자열): 정규식 사용
 *   = String valueOf(Object): 모든 데이터형을 문자열로 변환				  
 *   = String substring(int b)
 *   		  substring(int b,int e): 문자열 자르기
 *   = String[] split[String rex): 문자 분리
 *   
 *  StringBuffer / StringBuilder
 *  Wrapper
 *   = Integer: parsrInt()
 *   = Double: parseDouble()
 *   = Boolean: parse Boolean()
 *   = Long: parse Long()
 *  Math
 *   = ceil() / random()
 *  System
 *   = gc() / exit() / currentTimeMillis()
 */
public class 중간정리 {
	public static void main(String[] args) {
		String s = 
				"""
				211.238.142.21,
				211.238.142.22,
				211.238.142.23,
				211.238.142.24,
				211.238.142.25,
				211.238.142.26,
				211.238.142.27,
				211.238.142.28,
				010.111.1111,
				211.238.142.29""";
		//[가-힣]: 한글 전체 , [A-za-z]: 영문 전체, [0-9]: 숫자전체
		//[가-힣]{3}: 3글자   [가-힣]+ : 한글자 이상 [가-힣]* : 0이상
		//웹 사용x => 크롤링시는 사용
		//System.out.println(s);
		Pattern p = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{2}");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}
}
