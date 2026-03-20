package com.sist.oop;
/*
 *  접근지정어 / 제어자
 *  -------------
 *  	구분 => 패키지 => 안에 있는 클래스를 가지고 오기 => import
 *   1.package : 한번만 사용
 *   2.import : 여러번 사용 가능
 *   3.class 
 *     -----
 *     |접근지정어 => public / default
 *   -----------------------------------클래스 제작 순서
 *   
 *   4. 클래스 구조
 *   
 *   	(public) class ClassName
 *   	{
 *			---------
 *			변수 => private
 *			--------
 *			생성자 => 다른 클래스와 연결 => public
 *			---------
 *			메소드 => 다른 클래스와 통신 => public
 *			----------   
 *   	}
 *   
 *   1) static / instance
 *   	
 *   	static 특징
 *   	 공유 목적 => 사이트 (동일한 내용이 나온다)
 *   			   ----- 공통CSS
 *   	 객체 생성없이 사용 가능
 *   	 컴파일시에 메모리 저장
 *   	 독립적으로 사용이 가능 ==> 클래스.변수명 / 클래스.메소드()
 *   	 공유 멤버변수를 가지고 있다 : 회사명, 학교명 ...
 *   	 --------- 변경이 되면 모든 인스턴스 한번에 변경
 *   	 --------- 오라클 저장되는 데이터
 *       사용제한
 *       -----static 메소드 안에서는 staic만 사용이 가능
 *       -----인스턴스를 사용하려면 반드시 new를 이용해서 객체 생성후에 사용이 가능
 *       사용목적 : 전역변수 / 전역함수
 *       
 * 	 2) instance 변수
 * 		객체변수 => 따로 메모리를 만들어서 저장 후 사용
 * 				 다른 주소에 저장된 데이터는 접근이 불가능하다
 * 				 반드시 저장시에 new 생성자()
 * 							--- 새로운 메모리
 * 		
 * 		=> static / instance => 프로그램 종료시까지 메모리 유지
 * 		=> instance변수 구분 => this.변수명
 * 		=> **static은 this를 사용할 수 없다
 * 		
 * 		class A
 * 		{
 * 			int a,b;
 * 			Static int c;	//메모리 크기에서 제외
 * 
 * 			static void disp()
 * 			{
 * 				a,b(x) 사용불가 영역이 다르다
 * 			}
 * 			=> 지역변수 / 매개변수가 우선
 * 			   --------------
 * 					다음이 멤버변수
 * 			void display()
 * 			{
 * 				System.out.println(a) //this.a 구분할 변수명이 없는경우 this가 생략되어있다.
 * 				System.out.println(b) //this.b 구분할 변수명이 없는경우 this가 생략되어있다.
 * 				System.out.println(c) //A.c 생략되어 있다.
 * 			}
 * 		}
 * 		-------------------실제로 저장되는 메모리 크기: 8byte
 *    
 *   	A aa = new A();
 *   
 *   				  Heap		MethodArea
 *   		aa  -->  ------		-----c----
 *   				  -a-			0
 *   				   0		----------
 *   				  ---		
 *   
 *   				  -b-
 *   				   0
 *   				  ---
 *   				--------
 *   	
 *   	생성자
 *   		=> 클래스를 저장 => 객체를 생성시에 호출
 *   		=> 생성자 호출시 앞에 반드시 new 
 *   		=> 클래스명과 동일
 *   		=> 리턴형이 없다
 *   		=> 오버로딩 지원
 *   			
 *   		class A
 *   		{
 *				pubic A(){}   
 *   		}
 *   		
 *   		오버로딩
 *   		 => 같은 이름의 메소드로 새로운 기능 제작
 *   		 => 메소드명 동일
 *   		 => 매개변수의 갯수나 데이터형이 달라야한다.
 *   		 => 리턴형 / 접근지정어는 관계없다
 *   		 => 생성자에서 오버로딩을 지원
 *   			-> 초기화를 다르게 만드는 경우
 *   
 *   		class A
 *   		{
 *   			String name; // null
 *   			int a; => 0
 *   
 *   			명시적 초기화
 *   			-------------------
 *   			String name ="홍길동";
 *   			int age = 20;
 *   			String compony;
 *   			Long pay;
 *   			-------------------
 *   
 *   			초기화 블록
 *   			{
 *   				name = "심청이";
 *   				age =25;
 *   			}
 *   			
 *   			//생성자 이용
 *   			A()
 *   			{
 *   				name = "박문수";
 *   				age =27;
 *    				compony = "SIST";
 *    				pay = 3000;
 *   			}
 *   
 *   			//초기값을 다르게 저장시 사용
 *   			A(String n,int a) 
 *   			{
 *   				this(); //compony,pay는 A()생성자 값 사용   중복제거시 사용
 *   				name = n;
 *   				age = a;
 *   			}
 *   		}
 *   
 *   		this() => 생성자 안에서 호풀
 *   				  반드시 첫번째 줄
 *   				  생성자 안에서 다른 생성자 호출
 *   				  중복코딩을 제거
 *   		-------------------------------------------------
 *   		this = > 자신의 객체
 *   				 컴파일시 생성
 *   				 매개변수와 인스턴스변수 구분
 *   				 static으로 되어있다
 *   				 모든 클래스가 가지고있다
 *   			A a = new A() => this=a
 *   			A b = new A() => this=b
 *   			현재 사용하고 있는것이 this다
 *   			----------------------- 컴파일러가 처리
 *   
 *   		**static => 클래스 전체에서 공통으로 사용되는 변수 정의
 *   		  --------------------------------------------
 *   		  this() => 생성자간의 연결을 통해서 효율적인 초기화 수행
 *   		  this   => 자신의 객체 -> 모든 클래스가 가지고 있다.
 *   		  -------------------------------------------- 인스턴스 변수 / 인스턴스 메소드에서만 적용이가능 (static은 제외)
 *   
 *   
 *   프로그램
 *   -----
 *   1. 기능설정 : 메소드
 *   	=> 메소드 안에서 공통으로 사용되는 변수
 *   				---------------- 인스턴스 변수
 *   	요구사항
 *   	----------------------
 *   	  기능   기능에 필요한 요소
 *   	----------------------
 *   	 로그인      id,pwd
 *   	----------------------
 *   
 *   2. 화면UI => 변수의 초기화
 *   	---------------------------------------
 *   	=> 명시적 초기화 : 알고 있는 상태
 *   		-> 목록 - 페이지 나눠짐 처음은 page1
 *   	=> static 블록 : 객체 생성없이 화면에 출력
 *   					static변수만 사용이 가능
 *   	=> instance 블록 : 파일 / DB / 크롤링
 *   	--------------------------------------- 자동호출
 *   	=> 생성자 : 가지고 와여하기 때문에 public
 *   		** static => static 블록
 *   		** instance => 생성자
 *   		** 모든 변수는 은닉화 => private
 *   
 *   3. 구현
 *   	메소드 : 다른클래스와 연결해야하기 떄문에 public
 *   	= static 메소드 : 공통으로 적용되는 기능
 *   	**= instance 메소드 : 각 객체마다 따로 수행하는 기능
 *   	**= abstract 메소드 : 개발자에게 맡긴다 -> 미완성 : 선언
 *   					  설계 도구 => 추상클래스 / 인터페이스
 *   
 *   	=> static 메소드: 클래스명.메소드()  ex) Math.random()
 *   	=> instance 메소드: 객체명.메소드() ex) Sacanner sc = new Scanner();
 * ------------------------------------------------------------------------
 *     
 * 1. 자바의 접근 지정어
 *   = public
 *  	어디서든 상관없이 접근 => 공개
 *  	-> 클래스, 생성자, 메소드
 *   = protected
 *   	같은 패키지에서 접근 / 다른 패키지는 상속을 받으면 가능
 *   	-> 사용 빈도가 거의 없다
 *   = default
 *   	같은 패키지에서 접근
 *   	------- 폴더
 *   = private
 *   	비공개 (은닉화)
 *   	-> 자신의 클래스 내에서만 접근이 가능
 *   	-> 인스턴스 변수
 *   
 * 2. public > protected > default > private
 * 	=> 오버라이딩시에 접근지정어는 축소할 수 없다. (확대는 가능)
 * 
 * 	class A
 * 	{
 * 		void display(){}
 * 	}
 * 
 *  class B extends A
 * 	{
 * 		private void display(){}
 * 		-------
 * 		default보다 작기때문에 오류 발생
 * 	}
 *
 *
 *	------------------------------------------------------
 *			 같은 클래스	같은 폴터   다른 클래스(상속)	  모든 클래스	
 *	------------------------------------------------------
 *	private		O		 
 *	------------------------------------------------------
 *	default		O		 O
 *	------------------------------------------------------
 *	protected	O		 O			   O
 *	------------------------------------------------------
 *	public		O		 O			   O			O
 *	------------------------------------------------------
 */

//모든 변수에 private 사용(x)

class Sawon
{
	private int sabun; //은닉화
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
	
	//캡슐화
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
}
public class 접근지정어_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong = new Sawon();
		hong.dept = "개발부";
		hong.job  = "사원";
		hong.loc  = "제주";
		// => 메소드 이용 접근
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		// => 변수를 저장 시 setter,읽을 때 getter
		
		System.out.println("이름: " + hong.getName());
		System.out.println("사번: " + hong.getSabun());
		System.out.println("연봉: " + hong.getPay());
		System.out.println("부서: " + hong.dept);
		System.out.println("직위: " + hong.job);
		System.out.println("근무지: " + hong.loc);
	}

}
