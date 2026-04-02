package com.sist.collection;
/*
 *  CRUD
 *   => add, get, remove, set
 *   => 두개의 list에서 중복된 데이터 관리
 *   	containsAll() 		오라클:(UNION)
 *    	=> JOIN
 *   => retainAll -> 교집합	오라클:(INTERSECT)
 *   addAll() -> 전체 데이터	오라클:(UNION ALL)
 *   =>subList: 부분적 복사(중복구매)
 */
import java.util.*;
public class Collection_2 {

	public static void main(String[] args) {
		
		// => 모든 데이터 Object
		ArrayList list = new ArrayList();
		
		list.add(3);//0
		list.add(4);//1
		list.add(8);//2
		list.add(7);//3
		list.add(9);//4
		list.add(1);//5
		list.add(2);//6
		list.add(5);//7
		list.add(6);//8
		
		System.out.println("==== 데이터 출력 ====");
		
		//=> 실제 데이터값 ->데이터형이 같거나 큰 데이터형 사용
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== 일부만 추출 ====");
		//ArrayList list2 = new ArrayList();
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		//잘라서 가져온다
		//subList(start,end) end-1 인덱스 번호가 1,2,3
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		for(Object obj:list2)
		{
			System.out.println(obj);
		}
		
		//정렬  ==> sort
		System.out.println("==== 정렬 ====");
		Collections.sort(list);
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== 같은 데이터 추출 ====");
		//retainAll => 교집합
		//list를 list2와 교집합인 값으로 변경
		list.retainAll(list2);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== 전체 복사 ====");
		ArrayList list3 = new ArrayList();
		list3.addAll(list); //list데이터 전체를 list3에 넣어라
		
		for(Object obj:list3)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== containsAll ====");
		list.containsAll(list2);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		/*
		 *  subList(int start,int end)
		 *  		=> start ~ end-1 까지
		 *   -> 페이징시 많이 사용
		 *   
		 *  addAll(): list에 있는 모든 데이터 복사
		 *  
		 *  retainAll(): 두개의 list에 공통 데이터 추출
		 *  
		 *  Collections.sort() => 정렬
		 *  -------------------------------------> 표준화 (모든 개발자가 동일하게 사용)
		 */
	}

}
