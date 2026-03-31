package com.sist.lang;
/*
 *  포장클래스 => 데이터형을 쉽게 다루기 위해서 만들어진 클래스
 *  		   제네릭에서 사용이 가능하게 만든 클래스
 *  
 *  <클래스> : 제네릭 데이터형 통일    <int> x  <Integer> o
 *  
 *  기본형 -> 클래스화
 *  -------------
 *  byte -> Byte
 *  short -> Short
 *  **int -> Integer
 *  **long -> Long
 *  --------------
 *  문자형
 *  char -> Character
 *  실수형
 *  float -> Float
 *  **double -> Double
 *  논리형
 *  **boolean -> Boolean
 *  문자배명
 *  **char[] -> String
 *  
 *  양쪽의 호환성
 *  ---------
 *  AutoBoxing / UnBoxing
 *  
 *  Integer i = new Integer(10);
 *  ----------------------------> Integer i = 10;  AutoBoxing // 클래스에 실제 값을 주입
 *  
 *  int ii = i.intValue();
 *  --------------------> int ii = i;  UnBoxing  //기본형에 클래스 객체 주입     객체 주소가 아닌 값이 들어감
 */
public class Wrapper_1 {

	public static void main(String[] args) {
//		Integer i = 10;
//		Integer j = 20;
//		System.out.println(i+j);
//		
//		int k = 10;
//		int m = 20;
//		System.out.println(k+m);
		
		// 주요 메소드
		// => 웹 / 윈도우 => 넘어오는 모든값 String
		// 네트워크는 정수x 문자열로 전송
		// String page= request.getParameter("page")
		//	=> 정수형으로 변환 
		/*
		 *  값을 받았을 때
		 *  parse
		 *   정수형 변환: Integer.parseInt("10")
		 *   실수형 변환: Double.parseDouble("10.5")
		 *   논리형 변환: Boolean.parseBoolean("true")
		 *   
		 *  값을 전송할때
		 *   String.valueOf()
		 */
		
		int a = 10;
		System.out.println(Integer.toBinaryString(a)); //2진법 출력
		System.out.println(0b1010); //2진법을 10진법으로
		// 우분투에서 2진법 사용
		/*
		 *  ---	---	---
		 *   0	 0	 0
		 *   
		 *  r-- w-- x--
		 *   4   4   4  
		 *   
		 *  rwx w-x x-w    chmod 755
		 *   7   5   5
		 */
		
		System.out.println(Integer.toHexString(a)); //16진법   0x
		System.out.println(Integer.toOctalString(a));//8진법    0
	}

}
