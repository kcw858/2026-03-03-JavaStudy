package com.sist.lang;

import java.util.Objects;

// equals / hashCode
// 객체비교    객체식별자
/*
 * 	라이브러리 / 사용자정의 => Object
 * -------------------------------------------
 *  **1. toString(): 문자열로 변환 -> 생략이가능
 *  **2. clone(): 복제 -> 새로운 메모리 생성
 *  	-> spring => prototype()
 *  3. finalize(): 소멸자 -> 메모리에서 해제 (자동 호출)
 *  	->Sytem.GC() : 직접 호출
 *  **4. equals / hashCode
 *  **5. getClass: 기존 객체 읽기
 *  
 *  java.lang
 *  	-> 자바 소스 기본이 되는 클래스 집합으로 import 생략
 *  	-> 컴파일러가 자동 추가
 *   		1. import java.lang.*
 *   		2. extends Object
 *   		3. 메소드가 void일때 return 
 *   		4. 기본 생성자 추가
 *   		5. 생성자에서 super()
 *  
 *  Object클래스는 모든 클래스에 상속을 내리는 클래스
 *  ------> 데이터형중에 가장 큰 데이터형이다
 *  ------> DB연동시 많이 사용
 *  Object o = new Object();
 *  o = 10, o = 'A' ....
 *  
 *  JS -> let a =10, a= 10.5 ...  => typeScript
 */
//equals: 객체 비교

class Human
{
	String id,name;
	public Human(String id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	//값만 비교 => 재정의 (오버라이딩)
	//문자열 => String은 Object의 equals를 재정의
	//Object는 재정의해서 사용
	@Override
	public int hashCode() {
	
		return Objects.hash(id,name); // 메모리 주소가 동일
	}
	@Override
	public boolean equals(Object obj) {
		
		Human h = (Human)obj;
		
		return name.equals(h.name) && id.equals(h.id);
	}
}
//중복이 없는 객체 생성 => Set
public class Object_5 /*extends Object*/{

	public static void main(String[] args) {
		Human h1 = new Human("hong", "홍길동");
		Human h2 = new Human("hong", "홍길동");
		// equals => 값을 비교하지않고 주소값을 비교
		System.out.println("h1= "+ h1);
		System.out.println("h2= "+ h2);
		
		System.out.println("h1= " + h1.hashCode());
		System.out.println("h2= " + h2.hashCode());
		
		if(h1.equals(h2))
		{
			System.out.println("같은 사람이다");
		}
		else
		{
			System.out.println("다른 사람이다");
		}
	}

}
