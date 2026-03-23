package com.sist.main;
/*
 * 	7장
 * 	----상속 / this / super / this() / super()
 * 	----메모리 할당
 * 
 *  this: 자신의 객체 => 모든 클래스는 this를 가지고 있다
 *  	  this는 객체가 생성시에 주소값 저장
 *  	  this는 static으로 되어있다.
 *  	  A a = new A(); 
 *  	  this = a => JVM에서 자동화
 *  
 *  class A
 *  {
 *  	1. this사용처 -> 클래스에서만 사용이 가능
 *  	   생성자, 인스턴스 메소드에서만 사용가능
 *  	   static 메소드, 블록에서는 사용 불가능
 *  	2. 보통 -> 매개변수 / 인스턴스변수가 중복인 경우 구분을 위해서 사용
 *  		private int a;
 *  		public void display(int a)
 *  		{
 *  			a = a; => 둘가 매개변수로 구분 불가
 *  			this.a = a;
 *  			=> 지역변수와 매개변수 우선순위
 *  		}
 *  		public void display(int b)
 *  		{
 *  			a = b; => 구분이 가능해서 this생략 가능
 *  		}
 *  }
 * 	==> 윈도우: 자신의 윈도우 (this)
 * 
 * 
 * 	접근지정어
 * 	 => 사용자 정의는 없다
 * 		public: 모든 클래스 접근이 가능 -> 클래스 / 생성자 / 메소드  => 다른 클래스와 연결 
 * 		protected: 같은패키지, 상속받은 클래스가있는경우 다른 패키지 접근가능 => 상속이 많은 클래스 (거의 사용 빈도가 없다)
 * 		default: 같은패키지에서 접근이 가능 -> 연습용으로 패키지가 없는상태에서 많이 사용
 * 		private: 자신의 클래스 안에서만 사용이 가능 -> 인스턴스 변수: getter/setter (캡슐화)
 * 	
 * 		메소드 / 클래스 / 인터페이스 / 생성자 => public
 * 		인스턴스 변수 => private
 * 
 * 		==> 제어자
 * 			static   /  final   /   abstract
 * 			------		------		--------
 * 		공통으로 사용		상수			선언만 된 (미완성)
 * 									- 추상클래스, 인터페이스
 * 
 *  재사용 기법
 *   1. 상속
 *   	 상속 키워드: extends => 보통 라이브러리 상속
 *   	 단일 상속만 가능
 *   	 클래스의 크기가 가능하다 (상속/포함시 가능)
 *   	 class A  
 *   	 class A extends B    A > B
 *   
 *   	 class A
 *   	 {
 *   		B b = new B();
 *   	 }
 *       class B
 *       {
 *       }						A > B
 *       
 *       ==> 형변환:
 *       		상속을 내리는 클래스
 *       		상속을 받은 클래스
 *       *** 모든 클래스는 Object상속이다
 *       			   ------ 최상위 클래스
 *       => 상속은 이미 만들어진 클래스의 변수 / 메소드를 받아서 새로운 기능의 확장된 클래스를 만든다
 *          예외) static / 생성자 / 초기화블록 / private
 *       => 무조건 상속 보다는 필요한 경우에만 상속
 *       	class A
 *       	{
 *       		글쓰기
 *       		수정
 *       		상세보기
 *       		삭제
 *       		목록
 *       		추가
 *       		검색
 *       	}
 *       
 *       	class B
 *       	{
 *       		글쓰기
 *       		수정
 *       		상세보기
 *       		삭제
 *       		목록
 *       		추가
 *       		검색
 *       		업로드/다운로드
 *       	}
 *   	
 *   	목적
 *   		=> 코드 재사용
 *   		=> 유지보수가 편리: 기능을 미리 알고있다
 *   		=> 소스가 간결해진다
 *   		=> 반복 제거
 *   		=> 가독성 / 재사용 / 수정용이
 *   		=> 최적화(x) 메모리 비대 / 속도가 느려진다 / 결합성이 높아진다
 *   		=> 관련된 클래스를 모아서 한개의 객체명으로 관리
 *   
 *   2. 추상클래스
 *   3. 인터페이스
 *   클래스간의 공통사용
 *    1.내부클래스
 *     ------
 *     = 멤버사용: 공통사용
 *     = 익명사용: 오버라이딩 => 상속
 *     			익명사용은 상속 없이 오버라이딩 가능
 *    
 */
class Animal
{
	String name ="동물";
	public void run() 
	{
		System.out.println("걷는다");
	}
	public void eat() 
	{
		System.out.println("먹는다");
	}
}

class Dog extends Animal
{
//	String name ="동물";
//	public void run() 
//	{
//		System.out.println("걷는다");
//	}
//	public void eat() 
//	{
//		System.out.println("먹는다");
//	}
	public void eat() 
	{
		System.out.println("개가 먹는다");
	}
	int age = 3;
}
/*
 *  Dog d = new Dog(); // Dog에 있는 데이터나 메소드
 *  Animal a = new Dog(); // 변수는 Animal, 메소드는 Dog
 *  // 변수는 클래스, 메소드는 생성자를 따라간다
 *  // 여러개의 클래스를 한개로 통합
 *  Animal b = new Animal(); //Animal에 있는 데이터나 메소드
 */

class Cat extends Animal
{
//	String name ="동물";
//	public void run() 
//	{
//		System.out.println("걷는다");
//	}
//	public void eat() 
//	{
//		System.out.println("먹는다");
//	}
	int age = 3;
	public void eat() 
	{
		System.out.println("고양이가 먹는다");
	}
}

class Pig extends Animal
{
//	String name ="동물";
//	public void run() 
//	{
//		System.out.println("걷는다");
//	}
//	public void eat() 
//	{
//		System.out.println("먹는다");
//	}
	int age = 3;
	public void eat() 
	{
		System.out.println("돼지가 먹는다");
	}
}
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
		Pig pig = new Pig();
		pig.eat();
		System.out.println("==================");
		// 주소값만 변경한다
		Animal a = new Dog();
		a.eat();
		a = new Pig();
		a.eat();
		a = new Cat();
		a.eat();
	}

}
