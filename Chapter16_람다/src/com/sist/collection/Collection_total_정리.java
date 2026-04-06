package com.sist.collection;
/*
 *  				Collection (데이터 모음) -> 관리하기 쉽게 만든 라이브러리
 *  					|
 *  		-------------------------
 *  		|			|			|
 *  	   List		   Set		   Map
 *  	   -----------------Iterator
 *  	   -----ListIterator
 *  
 *  List: ArrayList / Vector
 *  					| 네트워크 저장
 *  		| DB연동
 *  Set: HashSet / TreeSet
 *  	 | 쿠키 / 세션
 *  Map: HashMap
 *  	 | 웹에서 주로 이용 => 라이브러리 (Spring, MyBatis)
 *  
 *  => 주요 메소드: 웹
 *   List: add() / size() / get() / isEmpty()
 *   	=> for-each 
 *   Set: add() / size() / isEmpty()
 *   	=> 출력보다는 중복 제거용으로 쓴다
 *   Map: put() / size() / get() / isEmpty()
 *   
 *   Iterator: hasNext() / next()
 *   	=> 출력 전용
 *   ListIterator: hasNext() / next()
 *   	=> List 출력
 *   
 *   ===> 반드시 제네릭을 이용해서 데이터형을 통일
 *   	<클래스형>
 *   	------- 기본 데이터형: Wrapper
 */
public class Collection_total_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
