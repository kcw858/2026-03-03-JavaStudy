package com.sist.collection;
/*
 *  사용자 요청 ===== 오라클 ====== List / Set ===== 브라우저 전송
 * 
 *  ListIterator: List전용
 *   = 데이터를 모아서 순차적으로 출력할 목적
 *   = 양방향
 *   = haaNext() / next() => 처음 - 마지막
 *   = hasPrevious() / previous() => 마지막 - 처음
 *   = add() , set(), remove()
 *   ------------------------------------같은 구조: JDBC
 *   = 인덱스 위치 확인이 가능
 *   = nextIndex / PreviousIndex()
 *  
 */
import java.util.*;
public class Collection_total_2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(List.of("A","B","C","D","E"));
		
		ListIterator<String> it = list.listIterator();
		
		//순서대로 출력
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//역순으로 출력
		System.out.println("===== 역순으로 출력 ======");
		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		// => 오라클에서 실제데이터를 가져올때 ASC / DESC
		// => DB연동이 아닌 순수 자바에서 사용
		
	}

}
