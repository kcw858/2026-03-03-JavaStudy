package com.sist.regex;
// ? => 0회 또는 1회가 있는 경우
// color => colou?r   : u가 있을수도 있고 없을수도 있다
public class 정규식_4 {

	public static void main(String[] args) {
		
		// color => colou?r   : u가 있을수도 있고 없을수도 있다
		System.out.println("color".matches("colou?r"));
		System.out.println("colour".matches("colou?r"));
		
		System.out.println("colouur".matches("colou?.r"));
		
		System.out.println("cat".matches("c?a?t?"));
		System.out.println("".matches("c?a?t?"));
	}

}
