package com.sist.lang;
//복제 => clone()
/*
 *  얇은 복사 => Call By Reference
 *  	-> 같은 메모리 주소를 사용 => 양쪽 값이 다 바뀜
 *  		class A
 *  		A a = new A();
 *  		A b = a;
 * 
 *  깊은 복사 => 새로운 메모리 생성
 */
class Member implements Cloneable
{
	String name = "홍길동";


	public void display()
	{
		System.out.println("이름: " + name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}

class CallByReference
{
	public void change(Member m)
	{
		m.name = "박문수";
	}
}
public class Object_2 {

	public static void main(String[] args) throws Exception{
//		//객체 생성
//		Member m1= new Member();
//		m1.display();
//		
//		//객체 주소를 복사
//		Member m2 = m1; // 별칭 => Call By Reference
//		//매개변수에 주소를 넘겨주는 방식
//		
//		// -> 주소가 같은 경우에는 m1,m2는 같은 메모리 주소를 제어
//		m2.name = "심청이";
//		m1.display();
//		System.out.println("m1= " + m1);
//		System.out.println("m2= " + m2);
//		
//		CallByReference c = new CallByReference();
//		c.change(m1);
//		m1.display();
//		m2.display();
		
		
		//ex) 게임 아바타 복사시  Adapter 패턴 
		Member m1 = new Member();
		m1.name = "이순신"; // clone 복사 전
		//clone은 리턴형이 Object이다
		Member m2 = (Member) m1.clone();
		
		System.out.println("m1= "+ m1);
		System.out.println("m2= "+ m2);
		System.out.println("m1.name= "+ m1.name);
		System.out.println("m2.name= "+ m2.name);
		
		//git clone
		// => 기존에 있는 모든 데이터를 복사해서 새로운 메모리에 저장
	}

}
