package com.sist.regex;
/*
 *  정규표현식: 특수기호를 활용한 복잡한 문자 패턴을 효율적으로 매칭하는 방법
 *  		 -----> 관련된 데이터 검색 (검색용) -> 웹 , 다중검색
 *  
 *  리플렉션: 클래스의 정보에 접근해서 동적으로 제어
 *  		=> 객체 생성 / 변수값 주입 / 메소드 호출 / 생성자 호출
 *  		=> 클래스명으로만 접근이 가능
 *  		=> 보안(private)접근 문제, 속도 저하
 *  		=> 결합성을 낮출 수 있다
 *  		=> 라이브러리를 사용하기 때문에 new 사용 불가
 *  
 *  어노테이션: 구분다를 달아서 찾기 쉽게 만든다
 *  		=> 자동화 처리
 *  
 *  프로그램
 *  	=> 추가, 삭제 , 수정과 상관없이 자동화 -> 서버는 수정없이 기능만 추가
 *  
 *  정규식
 *  --------
 *  1. 임의의 한문자 => .
 *     --------> 한글 / 알파벳 / 특수문자
 */
public class 정규식_1 {

	public static void main(String[] args) {
		
		//H 뒤에 임의의 한글자 , 두글자 주려면 .두개
		System.out.println("Hkkllo".matches("H..llo"));
		System.out.println("H#llo".matches("H.llo"));
		System.out.println("Hello".matches("....."));
		System.out.println("홍길동".matches("홍.."));
		System.out.println("맛있고".matches("맛있."));
		// 빅데이터 => AI
		// 데이터 수집 -> 데이터 분석 -> 시각화 -> 예측(AI)
	}

}
