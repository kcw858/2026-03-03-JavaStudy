package com.sist.main;
// => 객체 생성시 사용할 메모리 주소 설정 -> 이 객체는 자신의 메모리주소만 접근이 가능
//  공통으로 사용할 수 있는 메모리가 필요 => static
//다른 클래스 메모리에 접근시 => 메소드를 이용해서 접근 => 상속

class Parent
{
	int a = 10;
	public void display()
	{
		System.out.println("Parent:display() Call");
	}
}

class Child extends Parent
{
	int a = 100;
	public void display()
	{
		System.out.println("Child:display() Call");
	}
}
public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println("P.a= " + p.a);
		p.display();
		Child c = new Child();
		System.out.println("c.a= " + c.a);
		c.display();
		
		Parent pp = new Child();
		System.out.println("pp.a= " + pp.a);//Parent
		pp.display();// Child
		
		//변수는 클래스에 존재하는 변수 Parent pp
		//메소드는 생성자 new Child();
		//상속 => 기본 목적: 객체 한개를 생성해 여러개의 클래스를 모아서 관리
		
	}

}
