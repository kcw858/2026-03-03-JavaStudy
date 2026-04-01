package com.sist.regex;
// 문자 집합 [] [abc] => a|b|c  ,   [(abc)] => abc
// [abdef] => 그대로 사용
// [abcdef] => [a-f] => 순차적으로 들어왔기 때문에
/*
 *  [A-Z] : 대문자 전체
 *  [a-z] : 소문자 전체
 *  [a-zA-z]: 알파벳 전체
 *  [0-9] : 숫자전체
 *  [가-힣] : 한글전체  
 *  {n} : n개의 글자 수
 *  {3,5}: 3글자에서 5글자 사이
 *  
 *  이름
 *  [가-힣]{2,17}  -> 오라클은 한글 하나당 3byte이기때문에 51로 잡아준다
 */
public class 정규식_6 {

	public static void main(String[] args) {
		
		//aat bat cat
		System.out.println("cat".matches("[abc]at"));
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("A".matches("[A-Z]"));
		System.out.println("5".matches("[0-9]"));
		System.out.println("홍".matches("[가-힣]"));
		
		//"코메디"
		System.out.println("코메디".matches("[가-힣]{3}")); //한글이 3글자가 있다
		System.out.println("코메디".matches("^코[가-힣]*")); //.은 특수문자도 들어올 수 있다
	}

}
