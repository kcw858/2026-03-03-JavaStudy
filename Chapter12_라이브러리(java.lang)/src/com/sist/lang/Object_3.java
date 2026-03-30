package com.sist.lang;
/*
 * toString(): 객체를 문자열화 시키는 경우 사용
 *  -오버라이딩 -> 가장 많이 사용되는 클래스
 *  -변수값 출력
 *  -생략이 가능
 *  
 *  
 *  
 *  class A
 *  {
 *  	O X
 *  } 
 *  class B extends A
 *  {
 *  	//O X
 *  	P H K
 *  }
 *  
 *  A a = new A(); -> O X
 *  	-> A가 가지고 있는 메소드
 *  B b = new B(); -> O X P H K
 *  	-> B가 가지고 있는 메소드
 *  A c = new B(); -> O X
 *  	-> B가 가지고 있는 메소드
 *  
 *  => 메소드는 생성자
 *  => 상속을 내리는 클래스는 상속 받은 클래스를 제어할 수 없다
 *  				   ------------
 */
class Student
{
	private String name = "홍길동";
	private String sex = "남자";
	private int age = 20;
	
	@Override
	public String toString() {
		
		String info ="이름:" + name
				+"\n성별:" + sex
				+"\n나이:" + age;
		return info;
	}
	
}
public class Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		//주소 => new 생성 -> 생성자 -> 생성된 메모리에 인스턴스 변수값 주입
		
		//객체 주소 확인 뒤에 toString 생략
		System.out.println("std주소: " + std);
		System.out.println("std주소: " + std.toString());
		
		//변수 값을 확인하기 위해 toString오버라이딩 많이 사용
		
		
		//Object o = new Student();
		//상위클래스로 생성은 추상클래스 / 인터페이스인경우
		
	}

}
