package com.sist.reflect;

import java.lang.reflect.Field;

/*
 *  자바는 시점
 *   = 컴파일 시점 (javac)
 *   = 실행 시점 (java)
 *   = 리플렉션 실행시점에 클래스의 모든 정보를 읽어서 조작이 가능
 *     -----
 *     	Spring / MyBatis / Hibernate
 *     	=> 동적 객체 생성 / 어노테이션 처리
 *      => 메소드를 자동호출하게 만드는
 *   = 클래스 정보
 *   	클래스 구조
 *   	class ClassName
 *   	{
 *   		------------
 *   			변수
 *   		------------
 *   			생성자
 *   		------------
 *   			메소드
 *   		------------
 *   	}
 *   
 *   
 *   	1. 주요클래스 / 메소드
 *   	 = Class: 클래스 자체 저장
 *   	 = 변수정보 => Field
 *   	 = 메소드 => Method
 *   	 = 생성자 => Constructor
 *   	
 *   	2. Class 객체 얻기
 *   	 = Class cls = String.class
 *   	 = String str = ""
 *   	   Class cls = str.getClass()
 *   	 ***= Class cls = Class.forName("java.lang.String")
 *   
 *   	3. 장점
 *   	 = 프레임워크 개발시 사용
 *   		-> 코드의 재사용 / 유연성(수시로 수정 / 추가 / 삭제)
 *   						-----------------------
 *   						유지보수
 *   
 *   	4. 단점
 *   	 = 직접 호출보다 속도가 늦다 (성능 저하)
 *   	 = 보안 문제 -> private에 접근이 가능
 *   	 = 코드의 가독성이 떨어진다 -> 자동 호출하기 때문에 동작순서 파악이 어려움
 *   
 */
class student
{
	private String name ="홍길동";
	
}
public class 리플렉션_2 {

	public static void main(String[] args) {
		
		try
		{
			student std = new student();
			Class cls = std.getClass();
			Field f = cls.getDeclaredField("name");
			f.setAccessible(true); //private 변수에 접근이 가능
			System.out.println(f.get(std)); //std가 가지고 있는 변수를 가져와라
			f.set(std, "박문수");//변수값 변경
			System.out.println(f.get(std));
			
		} catch (Exception ex) {}
	}

}
