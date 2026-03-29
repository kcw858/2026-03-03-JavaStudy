package com.sist.commons;

import com.sist.vo.FoodVO;
/*	interface I
 * 	{
 * 		void aaa();
 * 		void bbb();
 * 		default void ccc(){}
 * 		default void ddd(){}
 * 		default void eee(){}
 * 	}
 * 
 * class A implements I
 * {
 * 		// 강제 구현
 * 		void aaa(){}
 * 		void bbb(){}
 * }
 * 
 *  인터페이스 
 *   = 서로 다른 클래스를 연결해서 사용
 *     ---------------------- 결합성이 낮은 프로그램 구현
 *     A === I  === B
 *     				-> B 수정시 I로 간다 
 *   = 공통으로 사용되는 기능을 모아서 재사용, 확장
 *   = 독립적으로 사용이 가능
 *   ---------------------------------------------------------
 *   
 *   구성요소
 *   public interface InterfaceName
 *   {
 *   	------------------------------------------
 *   	변수: 상수형 변수
 *   	 - 변수를 설정하면 반드시 초기값을 부여
 *   		(public static final) int a = 10;
 *   		=> 생략이 되면 자동 초기화
 *   	------------------------------------------
 *   	메소드 (구현(X))
 *   	 - 선언만 된 메소드 => 상속을 내려서 구현 후 사용이 가능
 *   		(public abstract) void display();
 *   		=> 강제성 
 *   		=> 구현이 불가능한 경우 -> 개발자가 구현
 *   		=> 버튼 클릭 / 목록
 *   		=> 자유롭게 처리
 *   	------------------------------------------
 *   	메소드 (구현(O))
 *   	 - default 메소드
 *   		=> 공통으로 사용되는 내용이 있는 경우
 *   		=> 있는 그대로 사용 / 변경해서 사용이 가능(오버라이딩)
 *   		=> 강제성이 없다
 *   		(public) default 리턴형 메소드명(매개변수 값..)
 *   		{
 *   			구현
 *   		}
 *   	------------------------------------------
 *   	메소드 (구현(O))
 *   	 - static 메소드
 *   		=> 메모리 할당 없이 접근이 가능 => 사용빈도 거의 없다
 *   		(public) static 리턴형 메소드명(매개변수 값..)
 *   		{
 *   			구현
 *   		}
 *   	------------------------------------------
 *   	자체처리 => 공통으로 사용하는 부분 => 메소드화
 *   		private 리턴형 메소드명(매개변수 값..)
 *   		{
 *   			구현
 *   		}
 *   	-------------------------------------------
 *   	**only public 
 *   	** public을 쓰지 않으면 자동 추가
 *   	=> 관련된 클래스를 여러개 모아 인터페이스 하나로 제어
 *   }
 *   
 *   
 *   	=> 상속
 *   		interface A 
 *   			|		
 *   		interface B extends A
 *   
 *   
 *   		interface A interface B
 *   			|			|
 *   			-------------
 *   				  |
 *   		interface C extends A,B
 *   
 *   
 *   		interface A 
 *   			|		
 *   		class B implements A
 *   
 *   		class A interface B interface C
 *   		   |		|			|
 *   		   ----------------------
 *   						|
 *   			class D extends A implements B,C
 *   
 *   	=> 기존의 기능을 재사용
 *   		=> 필요시에 변경해서 사용이 가능
 *   				 ------------> 오버라이딩
 *   
 *   	클래스
 *   		변경					추가
 *   		|오버라이딩				|오버로딩
 *   		---------------------------
 *   		메소드명이 동일 			메소드명이 동일
 *   		매개변수 동일			매개변수의 값이나 데이터형, 순서가 달라야한다
 *   		리턴형 동일				리턴형이 관계없다
 *   		접근지정어는 확대만 가능 	접근지정어 관계 없다
 *   		---------------
 *   			  |
 *   	public > protected > default > private
 *   
 *   	*** 클래스: 다른 클래스와 연결 => public / default
 *   	*** 멤버변수: 데이터 보호 => private
 *   				접근시 (수정 , 읽기)=> 기능상으로 메소드화  getter/setter
 *   				------------------------------------------------>변수+메소드 => 캡슐화
 *   	*** 메소드: 다른 클래스 연결 (통신 담당) => public
 *   	*** 생성자: 다른 클래스 객체 생성 => public
 */
public interface Manager {
	// 목록 
	public FoodVO[] food_list(int page);
	public int food_total();
	
	// 상세보기
	public FoodVO food_detail(int no);
	
	// 검색 
	// 1. 주소 2. 음식종류 3. 맛집명
	public FoodVO[] food_find(String type,String fd);
	
	// 필터링 => 한식 / 중식 / 양식 / 일식 / 분식
	public FoodVO[] food_filter(String type);
}
