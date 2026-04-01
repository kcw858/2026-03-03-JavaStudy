package com.sist.regex;
//0개 이상 반복 => *
public class 정규식_2 {

	public static void main(String[] args) {
		
		System.out.println("HHHello".matches("H*ello"));
		//.* 임의의 글자가 있을수도있고 여러개 있을 수 있다
		System.out.println("hsdsddo".matches("h.*o"));
		System.out.println("hheeeeeee".matches("h*.*"));
		System.out.println("hello".matches(".*"));
		System.out.println("".matches(".*"));
	}

}
