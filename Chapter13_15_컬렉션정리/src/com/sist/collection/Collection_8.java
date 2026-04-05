package com.sist.collection;
/*
 *  웹 : 처음 ~ 예외처리 -> 기본문법
 *      라이브러리
 *       java.lang
 *        - Object: toString()
 *        - String
 *        - StringBuufer: append
 *        - Math: ceil()
 *        - Wrapper: Integer, Double, Boolean 
 *       java.util
 *        - StringTokenizer: counterTokens, hashMoreTokens, nextToken
 *        - Random: nextInt
 *        - date / Calendar
 *        - simpleDateFormmat: 날짜 변환
 *        - DecimalFormat: 숫자변환
 *       Collection
 *        - List: add, get, set, isEmpty, clear
 *        - Set: add, remove, isEmpty
 *        - Map: put, get
 *    ---------------------------------------------> 9장, 12장, 13장, 15장
 */
import java.util.*;
public class Collection_8 {

	public static void main(String[] args) {
			
		TreeSet<String> set = new TreeSet<>();
//		set.add("apple");
//		set.add("banana");
//		set.add("grape");
//		System.out.println(set.ceiling("blue")); //같거나 크다 (알파벳으로 비교)
//		System.out.println(set.floor("blue"));
		
		set.add("박문수");
		set.add("홍길동");
		set.add("심청이");
		set.add("춘향이");
		set.add("이순신");
		set.add("강감찬");
		set.add("김두한");
		set.add("이산");
		// => AI
		for(String name:set)
		{
			System.out.println(name);
		}
		System.out.println("=====================");
		System.out.println(set.ceiling("이순호"));
		System.out.println(set.floor("이순호"));
		
		// ceiling, floor
		// 보통 오라클을 이용
	}
}