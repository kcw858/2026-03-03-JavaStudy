package com.sist.collection;
/*
 *			Set
 *			 |
 *		--------------
 *		|			 |
 *	  HashSet     TreeSet
 *	  | 중복제거		| 검색(속도가 빠르다)
 *
 *	=> 중복제거
 *
 *	특징
 *	 - 중복을 허용하지 않는다
 *	 - 순서가 존재하지 않는다
 *   - 오라클: PRIMARY KEY
 *   - 웹에서는 사용빈도는 거의 없다
 *   
 *   사용법
 *   	Set<> set = new HashSet();
 *   	Set<> set = new TreeSet();
 *   
 *   	=> add(): 데이터 추가
 *   	=> remove(): 데이터 삭제
 *   	=> clear(): 데이터 전체 삭제
 *   	=> List에서 중복을 제거
 *   	=> 데이터를 한번에 모아서 관리 -> **iterator()
 */
// => 중복 제거
import java.util.*;

public class Collection_4 {

	public static void main(String[] args) {
		
		//중복없는 데이터를 저장하는 저장소
		Set<String> set = new HashSet<String>();
		
		//값추가
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("딸기");
		set.add("배");
		set.add("수박");
		set.add("참외");
		
		System.out.println("===== 과일 종류 =====");
		// 인덱스를 사용하지 않는다 -> for-each
		for(String f :set)
		{
			System.out.println(f);
		}
		System.out.println("===== 제거 ======");
		set.remove("배"); // 인덱스가 없어서 저장 값을 지정
		for(String f :set)
		{
			System.out.println(f);
		}
	}

}
