package com.sist.main;

/*
 *  1. 생성자의 매개변수 여부 확인
 *  2. 상속은 extends
 *  3. 클래스는 변수. 생성자는 메소드
 */
class Human
{
	String name;
	String sex;
	public Human() //생성자는 상속에서 예외
	{
		name = "심청이";
		sex = "여자";
		System.out.println("Human() Call...");
	}
}

//class Student extends Human
//{
//	
//	public Student(String name,String sex)
//	{
//		this.name = name;
//		this.sex = sex;
//	}
//	public void display()
//	{
//		System.out.println("이름: " + name);
//		System.out.println("성별: " + sex);
//	}
//}

//상속내림 클래스 => 메모리 할당(상위 클래스의 생성자를 부름) 
//상속받은 클래스 => 메모리 할당

class Sawon extends Human
{
	String name,sex; // 변수의 오버라이딩 
	public Sawon()
	{
		super(); //자동으로 호출 (생략가능) 
		/*
		 *  return / 생성자 / super() / import java.lang / extends Object
		 */
		System.out.println("Sawon() Call...");
		this.name ="박문수";
		this.sex = "남자";
	}
	public void display()
	{
		System.out.println("이름: " + super.name);
		System.out.println("성별: " + super.sex);
		System.out.println("이름: " + this.name);
		System.out.println("성별: " + this.sex);
	}
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student std = new Student("홍길동", "성별");
		//std.display();
		Sawon s =new Sawon();
		s.display();
	}

}
