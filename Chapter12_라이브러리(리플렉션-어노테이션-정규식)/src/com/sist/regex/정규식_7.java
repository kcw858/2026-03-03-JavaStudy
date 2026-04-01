package com.sist.regex;
// or => |
public class 정규식_7 {

	public static void main(String[] args) {
		
		System.out.println("dog".matches("dog|cat|pig"));
		System.out.println("gif".matches("gif|jpg|png"));//확장자를 찾을때
		
		System.out.println("yes".matches("y(es)?"));
		
		System.out.println("ye".matches("y(es)?"));
		//오라클: REGEXP_LIKE(name,"[가-힣]+")
		/*
		 * 가나다 REGEXP_LIKE(name,"가나다")
		 * 
		 * name LIKE '%가%'
		 * OR name LIKE '%나%'
		 * OR name LIKE '다%'
		 */
	}

}
