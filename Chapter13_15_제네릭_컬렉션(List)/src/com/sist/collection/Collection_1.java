package com.sist.collection;
/*
 *  1. 컬렉션이란?
 *     ---- 데이터(값)를 담아두는 상자들 모음
 *     예) 친구 이름 / 전화 번호 / 맛집 정보..
 *     => 쉽게 관리하기 위해 만들어 준 것
 *     	  ----------------------> 컬렉션 프레임워크
 *     							       -------
 *     								    -> 표준화 (통일화)
 *     									-> 기본 틀
 *  2. 사용하는 이유
 *   = 배열
 *    1) 크기 고정 (늘리거나 줄이는게 어렵다), 고정적
 *    	 일반 목록 출력은 편하지만 검색이 어렵다
 *    2) 기능 부족 (정렬 / 검색 직접 구현)
 *    
 *   = 배열 보완 (단점)
 *    1) 크기 자동 조절
 *    2) 정렬, 검색 기능 제공
 *    3) 모든 개발자가 동일하게 사용 (소스) => 표준화
 *    
 *  3. 컬렉션의 종류
 *  	 Collection -- interface
 *  		  |
 *   ---------------------
 *   |		  |			 |
 *  List	 Set	    Map		----- interface
 *   |		  |			 |
 *   |	 -----------	 -----------------
 *   |	 |		   |	    |			 |
 *   | HashSet   TreeSet    HashTable  HashSet
 *   | 구현된 클래스 
 *   | (메소드 동일)
 *   -----------------------
 *   |			  |		   |
 *   ArrayList  Vector	LinkedList -> Queue
 *   
 *   
 *   => 기준점
 *   	List : 순서가 있다 (추가시마다 자동으로 인덱스번호 부여)
 *   		   데이터 중복을 허용
 *    		   대표적: ArrayList
 *   	Set : 순서가 없다 
 *   		  데이터 중복이 없다
 *   		  대표적: HashSet
 *   		  => 오라클은 DISTINCT	
 *   	Map : 목차 -> 키,값을 동시에 저장
 *   		  대표적: HashMap
 *   		  => 클래스 관리 / SQL문장 관리
 *   		  => Spring / MayBatis 
 *   	--------------------------------------------
 *   			순서		중복
 *   	--------------------------------------------
 *   	List	O		 O		목록 / 전화번호
 *   	--------------------------------------------
 *   	Set     X		 X      로또번호 / 수험번호 / 파일
 *   	--------------------------------------------
 *   	Map    	 key-value      전화번호		key 중복 x / value 중복 o
 *   	--------------------------------------------
 *   	
 *   	=> 데이터를 편하게 저장해서 관리하기 위한 목적 (표준화)
 *   	=> 프로그램에서 가장 중요한 것
 *         변수 : 데이터 관리
 *         ------------- React / Vue: 증권
 *         
 *      List
 *       사용처: 순차적으로 데이터를 저장
 *       	   인덱스 통해서 접근이 필요한 경우
 *       	   ---- 게시판 / 예약정보 / 장바구니
 *       구현된 클래스
 *       ArrayList: DB (웹 핵심)
 *       			=> 비동기
 *       Vector: 네트워크
 *       	     => 접속자 관리
 *       		 => 동기화
 *       LinkedList: 파일 관리 
 *       			 => C언어
 *      ----------------------------------------------
 *      ArrayList
 *      	배열기반 / 검색속도가 빠르다 / 순차적으로 저장 
 *      	조회 위주 / 접근 속도가 빠르다
 *      	=> 추가나 삭제시에 속도가 느리다
 *      ----------------------------------------------
 *      LinkedList
 *      	노드기반 / 추가,삭제시에 속도가 빠르다
 *      	파일 기반 => 접근 속도가 늦다
 *      	=> 추가,수정이 많은 경우
 *      ----------------------------------------------
 *      Vector
 *      	동기화: 멀티 쓰레드 (네트워크, 게임)
 *      	Vector를 보완 -> ArrayList
 *      ----------------------------------------------
 *      
 *      회원 관리 시스템
 *      	회원 ID 저장 =====> 중복x Set
 *      	회원 정보 저장 =====> (id,정보) Map
 *        게시판
 *        	목록 =====> ArrayList
 *        	댓글 순서 관리  ===> LinkedList
 *          검색엔진 =====> HashMap
 *          랭크 시스템 =====> TreeSet 자동정렬
 */

//ArratList
import java.util.*;
/*
 *  순서를 가지고 있다 (추가시마다 -> 자동 인덱스) => 배열 기반
 *  => 인데스 번호는 0번부터 시작
 *  저장된 데이터 중복 허용
 *  메모리상에 저장 => CRUD
 *  비동기적 프로그램 => DB연결 최적화
 *  항상 순서를 유지하고 있다 => 반복문 사용 용이
 *  주요기능
 *   추가 : add(데이터) -> 맨뒤에 추가
 *   	   add(int index,데이터) -> 지정된 위치에 추가
 *   삭제 : remove(int index)
 *   수정 : set(int index,변경될 데이터)
 *   읽기 : get(int index)
 *   갯수 : size()
 *   전체삭제: clear()
 *   데이터 존재여부: isEmpty()
 *   
 *  주로 사용처
 *   - 오라클 데이터를 읽어서 브라우저에 전송
 *   - 쿠키를 읽어서 브라우저에 전송
 */
public class Collection_1 {

	public static void main(String[] args) {
		
		//저장 공간을 만들기
		ArrayList list = new ArrayList();
		
		//추가
		list.add("홍길동"); // 인덱스 0
		list.add("심청이"); // 인덱스 1
		list.add("박문수"); // 인덱스 2
		list.add("춘향이"); // 인덱스 3
		list.add("이순신"); // 인덱스 4
		
		//저장된 데이터 출력
		for(int i = 0; i < list.size() ; i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//저장
		System.out.println("==== 지정된 위치에 저장 ====");
		list.add(2,"김두한");
		for(int i = 0; i < list.size() ; i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//삭제 remove(int index)
		System.out.println("==== 삭제 ====");
		list.remove(3);
		for(int i = 0; i < list.size() ; i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//수정 set(int index,값)
		System.out.println("==== 수정 ====");
		list.set(2, "강감찬");
		for(int i = 0; i < list.size() ; i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//인원 size()
		System.out.println("==== 갯수 ====");
		System.out.println("현재인원: " + list.size());
		
		//전체 인원 삭제
		System.out.println("==== 전체 삭제 ====");
		list.clear();
		System.out.println("현재인원: " + list.size());
		
		// 검색 결과 / 장바구니 등등
		if(list.isEmpty())
		{
			System.out.println("저장된 데이터가 없습니다");
		}else
		{
			System.out.println("저장된 데이터가 존재합니다");
		}
	}

}
