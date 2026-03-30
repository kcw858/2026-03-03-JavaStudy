package com.sist.lang;
/*
 *  자바에서 지원하는 클래스의 집합: 라이브러리
 *  
 *   = 라이브러리
 *   	1) 자아에서 지원
 *   	2) 외부 라이브러리 => 자바 개발업체 / 오픈소스
 *   		- mvnrepository.com
 *   		- lombok.jar / jsoup.jar ...
 *   		- spring
 *   	------------------------------------- + 사용자 클래스  => 조립
 *   		
 *    = java.lang
 *    	=> 자바에서 많이 사용되는 클래스의 집합
 *    	=> import를 생략할 수 있다
 *    	=> Object: 모든 클래스에 상속을 내리는 최상위 클래스
 *    		= 모든 클래스에는 extends Object를 포함하고 있다
 *    		= 모든 데이터형 / 모든 클래스를 관리할 수 있다
 *    		= ex) Objsct o = 10; o = 10.5 , o = true, o = 'A', o = new A()
 *    		= 단점: 라이브러리에서 지원하는 메소드의 리턴형과 매개변수형이 Object이다. => 형변환이 중요
 *    		= 주요 메소드
 *    			**1.finalize() -> 객체 소멸 => 자동호출
 *    			**2.clone() -> 복제 => 값이 있는 그래도 복사 후 새로운 메모리에 저장
 *    			**3.equals() -> 객체 비교
 *    			**4.hashCode() -> 객체마다의 고유 식별자
 *    			5.getClass() -> 리플렉션 => 객체의 정보를 얻기
 *    	=> String: 문자열 관리 클래스
 *    	=> StringBuffer / StringBuilder
 *    	=> Math: 수학과 관련
 *    	=> System: 입풀력 / 가비지컬렉션
 *    	=> Wrapper: 데이터형을 쉽게 관리 
 *    		int => Integer, double => Double ....
 *    	=> Thread: 동시성 -> 네트워크 / 애플리케이션 개발
 *    			   웹: Ajax => Vue, React
 *    				  Axios
 *    
 *    = java.util
 *    	=> Date / Calendar / Time
 *    	=> StringTokenizer: 문자를 자를때
 *    	=> Scanner
 *    	=> List / Set / Map
 *    
 *    = java.text
 *    	=> DecimalFormat -> 1,000
 *    	=> SimpleDateFormat	-> 날짜 형식
 *    	=> ChoiceFormat -> switch-case 대체
 *    	=> MessageFormat -> 출력 형식, sql과 관련
 *    
 *    = java.net: 네트워크 관련
 *    	=> URL / Socket / ServerScoket
 *    
 *    = java.io: 파일 관련
 *    
 *    = java.sql: DB 관련
 *    	=> Connection / Statement / ResultSet
 *    ----------------------------javax(jakarata).http.servlet
 *    							  웹서버 : tomcat 9 => javax
 *    										=> spring => sts 3.9
 *    									 tomcat 10 이상 => jakarata
 *    										=> sts 4.x => jakarata
 * 
 * 
 * 	 1. 람다: 함수포인터 => 소스를 간결하게 만들 때 사용
 * 		암다스트림 
 * 		 -> JWT / Spring 보안
 * 		 -> 데이터베이스를 간단하게 출력
 * 
 * 	 2. 제네릭: 데이터형 통일화 => 형변환 없이 사용이 쉽게
 * 		 -> 컬렉션 => 클래스를 모아서 관리 Object
 * 
 * 	 3. 어노테이션: 인덱스 => 검색
 * 		-> 메소드 / 클래스 / 멤버변수를 찾기
 * 		-> Spring
 * 
 * 	 4. 리플렉션: new없이 클래스명으로 메모리 할당
 * 		-> Spring
 * 	
 * 	 5. 정규식: 크롤링(검색) -> 패턴으로 문자열을 찾는 경우
 * 		
 * 		파일 => txt, csv, json
 * 						 ---- 자바에서 데이터 모아서 -> Vue / React
 * 
 * 	1권은 문법
 * 	 변수 / 연산자 / 제어문
 * 	 메소드
 * 	 클래스
 * 	 객체
 * 	 추상클래스 / 인터페이스
 *   예외처리
 *   
 *  2권은 실제 프로그램 개발
 *   네트워크: 흐름파악 (client-server)
 *   데이터베이스
 *   
 *   
 *   499p
 *   
 *   Object 클래스: 모든 클래스의 상위 클래스
 *    => extends Object -> java.lang.Object
 *    					   ----------------
 *    						| System / String / Number / StringBuffer / Thread
 *    
 *    1. 객체 생성 ~ 소멸 담당
 *    	  new	  finalize(): 소멸자 메소드
 *    			  -> 메모리에서 해제
 *    2. 복제 / 비교
 *    3. 문자열
 */
//finalize()
class Sawon
{
	private String name;
	private String dept;
	public Sawon(String name,String dept)
	{
		this.name = name;
		this.dept = dept;
		//this -> Sawon클래스 자신의 객체
		//매개변수와 인스턴스 구분
		//this는 static => 모든클래스에 대입
		//this는 new를 이용해서 객체 생성시에 주소값을 대입
		//변수 충돌이 없는경우 this.을 생략할 수 있다
	}
	/*
	 * this는 클래스{}안에서만 사용 가능
	 * 생성자 / 인스턴스 메소드에서만 사용이 가능
	 * 인스턴스 초기화 블록 / static{} / static메소드에서는 사용 불가
	 */
	public void Print()
	{
		System.out.println("이름: " + name);
		System.out.println("부서: " + dept);
	}
	
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 메모리 해제");
	}
	/* 
	 * 	  설계			객체 생성			객체 활용
	 * class 제작 ===== new 생성자() ==== 객체.메소드()
	 * 									 | 객체소멸
	 * 								   객체 = null
	 * 									 |---finalize()
	 * 									GC()에 의해 해제
	 */
}
public class Object_1 {

	public static void main(String[] args) {
		//객체 생성
		Sawon sa = new Sawon("홍길동", "개발부");
		
		//객체 활용
		sa.Print();
		
		//객체 소멸
		sa = null;
		//->자동으로 GC 호출 => 메모리가 많은상태 => 종료후 나중에 회수
		//finalize가 호출
		
		//바로 해제 
		System.gc();
		
		//Object: 객체 생성부터 객체 소멸까지 담당
	}

}
