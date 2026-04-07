package com.sist.lambda;
/*
 * 	람다식: 이름 없는 함수 -> 선언이 없다 => 코드가 간결해진다
 * 	 ()  ->  {}
 * 	 함수    구현부
 * 	 --
 * 	매개변수
 * 	
 * 	 = 메소드 참조: 클래스에서 메소드 참조가 가능 (::)
 * 		System.out::println	 
 * 		Customer::getName -> 사용자 정의도 가능
 *   = 스트림
 *   	- 중간처리 : filter(if) / map(format) / sorted(정렬)
 *   	- 최종처리 : forEach(출력) / collect => toList()(데이터를 모아서 전송) / max / min / count
 *   = Null처리
 *   	- Optional
 *   
 *   => 소스가 간결 -> 유지보수가 편리하다 (가독성은 떨어짐)
 *   => 재사용을 목적으로 하거나 복잡한 코드가 나오면 사용하지 않는다
 *   => 람다는 즉석처리 목적
 *   => 스프링부트의 보안처리에서 많이 사용
 *   => Optional은 JPA에서 많이 사용
 *   
 *   --> 최종에서는 보안 / JPA / MyBatis 사용
 *   
 *   주요 메소드
 *    -filter()
 *    -map()
 *    -sorted() => ASC만 가능 (DESC 불가능) -> 역순으로
 *   
 *   ****** 면접
 *   객체 지향 프로그램
 *   	-> 객체들이 협력해서 상호작용 기준 - 객체들을 조립하는 조립식 프로그램
 *   	-> 코드의 재사용성 / 유지보수 / 확장 / 신뢰성
 *   함수형 프로그램 (람다)
 *   	-> 결과값이 오직 => 입력값에 영향
 *    	-> 검증이 쉽다, 성능의 최적화, 캐시 메모리를 사용해 빠르다
 *    							-------> 임시 메모리 -> 메모리 리소스를 아낄수 있다
 *    	-> 임시 메모리에서 데이터를 가지고 온다 -> 스트림
 *    	-> 스트림: 데이터 처리에 초점
 *    			 --------> 조건 / 출력 / 데이터를 모아서 사용
 *    
 *   람다: 코드를 짧게 쓴다 (함수를 한줄로 사용)
 *   	  자바 (->)
 *   	  자바스크립트(=>)
 *   
 *   핵심
 *    (매개변수) -> {실행코드}
 */
import java.util.*;
public class Lambda_1 {

	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//		
//		numbers.stream()
//				.filter(n -> n % 2 == 0)
//				.forEach(n -> System.out.println(n));
		
//		String name = null;
//		System.out.println(name.length()); //오류  웹:500
//		System.out.println("프로그램 종료");
		
		//null값을 방지하는 클래스 Optional
		Optional<String> name = Optional.ofNullable(null);
		System.out.println(name.orElse("이름 없음")); //null일 경우 default값
		//검색을 하거나 DB프로그램
		// 데이터베이스 => isNotNull()  isNull()    NVL()
		
		Optional<String> userName = Optional.of("홍길동");
		
		//값이 있는 경우 실행
		userName.ifPresent(n -> System.out.println(n));
		
		/*
		 *  orElse("기본값") -> 값이 없는 경우(null) 대신 사용
		 *  ifPrrsent() -> 값이 있는 경우에만 수행
		 *  isPresent() -> 값 있는지 확인
		 *  
		 *  
		 *  람다 => 코드를 줄인다
		 *  스트림 => 임시메모리(캐시)에 데이터를 한개씩 읽는 것
		 *  Optional => null 안전하게처리
		 *  
		 *  Optional<String> a = Optional.of("hello") => null값이 아니다
		 *  Optional<String> a = Optional.ofNullable(null) => null값인 가능성이 있다
		 *  Optional<String> a = Optional.empty() => 빈값
		 *  
		 *  데이터베이스에서 데이터를 읽어 올 때 사용
		 */
		
		//값 변경 
		Optional<String> opt = Optional.of("hello");
		//map => 값을 변경해서 사용
		Optional<Integer> len = opt.map(s -> s.length());
		System.out.println(len.get());
		
		//Optional안 Optional 첨부
		Optional<String> opt2 = Optional.of("hello");
		Optional<Integer> result = opt2.flatMap(s -> Optional.of(s.length()));
		
		//flatMap: Optional 제거
		System.out.println(result.get());
		
		//필터링
		Optional<Integer> opt3 = Optional.of(10);
		opt3.filter(n -> n > 5) //if(n > 5) -> true / false
			.ifPresent(n -> System.out.println("5보다 큼"));
		//filter의 조건이 true일때만 수행
		
		//null은 String이나 클래스만 있다
		Optional<String> opt4 = Optional.ofNullable(null);
		//값이 있는지 확인 (있으면 true / 없으면 false)
		System.out.println(opt4.isPresent());
		//비어있는지 확인
		System.out.println(opt4.isEmpty());
	}

}
