package com.sist.collection;
/*
 * 				Map
 * 				 |
 * 		---------------------
 * 		|					|		구현된 클래스
 * 	HashMap				HashTable	
 * 	  비동기					동기 -> HashTable의 단점을 보완한게 HashMap
 * 
 * 	List / Set 은 Collection이기 때문에 메소드가 같다
 *  Map은 독립
 *  
 *  특징
 *   - 두개를 동시에 저장 (key,value)
 *   				 ----------> key를 가지고 value를 얻어온다
 *   							 key는 중복허용 x / value는 중목 허용 o
 *   							 같은 키를 쓰면 덮어 쓴다
 *   							 => 응용: Spring / MyBatis / 웹 라이브러리
 *   											  ------ SQL(id, "SQL문장")
 *   									 ------				--------- Session / Cookie / Request / Response
 * 										클래스 찾기(id,클래스찾기)
 * 
 *  사용처: 클래스 관리
 *  	  --------
 *  	  메모리 할당 후 관리 -> 메모리 주소
 *  map.put("a",new A())
 *  			--------> 한번 메모리 할당 (싱글턴) - 메모리 주소 하나만 가지고 활용 (메모리 누수 x)
 */
import java.util.*;

class AA
{
	 public void disp()
	 {
		 System.out.println("AA:disp() Call");
	 }
}
public class Collection_9 {

	public static void main(String[] args) {
		Map<String,AA> map = new HashMap<String,AA>();
		
		map.put("aa", new AA());
		
		//같은 주소값만 이용해 메모리 누수가 없다
		AA a = map.get("aa");
		
		AA b = map.get("aa");
		
		AA c = map.get("aa");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		

	}

}
