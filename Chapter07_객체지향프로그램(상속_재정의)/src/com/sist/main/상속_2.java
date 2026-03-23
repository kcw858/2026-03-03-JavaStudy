package com.sist.main;
/*
 *  상속 => 다른 클래스의 변수 / 메소드는 사용이 가능
 *  					  ----
 *  					 |프로그램에 맞지 않으면 변경해서 사용 (오버라이딩)
 *  오버라이딩: 변경해서 덮어쓴다
 *   1. 상속이 존재
 *   2. 메소드명이 동일
 *   3. 매개변수 동일
 *   4. 리턴형이 동일
 *   5. 접근지정어 => 확대는 가능. 축소는 불가능
 *   	public > protected > default > private
 *   				<===== 확대
 *   				축소 =====>
 *   
 *    	void aaa()
 *    		|
 *    	private void aaa()	- 오류
 *    
 *    		|
 *    	protected void aaa() 가능
 *    	public void aaa() 가능
 *    	void aaa() 가능
 *    	
 */
//class A
//{
//	void disp() {}
//}
//
//class B extends A
//{
//	void disp() {}
//}

/*				오버로딩				오버라이딩
 * -----------------------------------------------------
 * 메소드명		 동일 			 	  동일
 * -----------------------------------------------------
 * 상태			같은 클래스내			상속이 된 상태
 * -----------------------------------------------------
 * 매개변수	개수,데이터형이 다르다 		  동일
 * -----------------------------------------------------
 * 리턴형			관계없음				  동일
 * -----------------------------------------------------
 * 접근지정어		관계없음	    확대만 가능 / 동일 가능 / 축소 불가능
 * -----------------------------------------------------
 * 
 *  오버로딩 => 같은 메소드를 이용해서 새로운 기능 생성
 *  오버라이딩 => 상속해서 받은 기능을 변경하는 역할
 *  상속 => 오버라이딩(변경해서 사용이 가능)
 *  
 *  상속을 내리면 메소드나 상수를 복사하는 것이 아니다.
 *  따로 메모리에 저장 후 사용이 가능하게 연결만 시킨다
 *  -------
 *  	super
 *  	this
 *  
 *   class A
 *   {
 *   	int a,b
 *   }
 *   
 *   class B extends A
 *   {
 *   	int c
 *   }
 *   
 *   b b = new B();
 *   
 *   ---- super
 *   a,b <----
 *   ----	 |
 *   		 | 연결이 가능하게 만들어준다
 *   ---- this
 *    c
 *    super.a = 100, super.b = 200	->  둘다 같이 부모클래스의 변수를 가리킨다
 *    this.a=1000  , this.b=2000	----|
 *    
 *    a,b// super의 변수와 따로 주면 a,b는 this가 제어하고 super a,b와 따로 제어된다
 *   ----
 */
class Animal
{
	public void run()
	{
		System.out.println("두발로 걷는다");
	}
	public void eat() 
	{
		System.out.println("수저로 먹는다");
	}
}

class Dog extends Animal
{

	@Override 
	public void run() {
		System.out.println("네발로 걷는다");
	}

	@Override
	public void eat() {
		System.out.println("개같이 먹는다");
	}
	
}

class Pig extends Animal
{

	@Override
	public void run() {
		System.out.println("네발로 걷는다");
	}
	
	//오버로딩
	public void run(int a) {
		System.out.println("네발로 걷는다");
	}

	@Override
	public void eat() {
		System.out.println("돼지같이 먹는다");
	}
	
}



class Super
{
	int a,b;
	public void display()
	{
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
class Sub extends Super
{
	int a,b; //변수 오버라이딩
	int c;
	//초기화
	public Sub()
	{
		super.a = 100;
		super.b = 200;
	}
	
	public void print()
	{
		super.display();
		System.out.println("a= " + this.a);
		System.out.println("b= " + this.b);
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog dog = new Dog();
//		dog.run();
//		dog.eat();
//		
//		Pig pig = new Pig();
//		pig.run();
//		pig.eat();
		Sub s = new Sub();
		s.print();
	}

}
