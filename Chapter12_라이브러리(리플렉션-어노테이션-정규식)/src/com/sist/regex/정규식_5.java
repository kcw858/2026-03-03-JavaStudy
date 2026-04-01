package com.sist.regex;
// ^ / $  => ^: 시작  $: 끝
public class 정규식_5 {

	public static void main(String[] args) {
		
		System.out.println("hello".matches("^h.*o$"));
		System.out.println("hello".matches("^h.*")); //h로 시작하는 모든 글자
		System.out.println("hello".matches(".*o$")); //o로 끝나는 모든 글자
		//오라클 => CSS
	}

}
