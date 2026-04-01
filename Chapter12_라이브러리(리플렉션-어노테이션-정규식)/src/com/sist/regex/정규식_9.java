package com.sist.regex;
// \d  \w   \s   => \d: 숫자 [0-9]   \w: [a-zA-Z]    \s: 공백
// 이스케이프 문자 기호 사용시 -> + => \\+
public class 정규식_9 {

	public static void main(String[] args) {
		
		System.out.println("12345".matches("\\d+"));
		System.out.println("abc123".matches("\\w+")); 
		System.out.println(" ".matches("\\s+")); 
		
		System.out.println("1 2".matches("\\d\\s\\d"));
		
		System.out.println("a b".matches("\\w\\s\\w"));
	}

}
