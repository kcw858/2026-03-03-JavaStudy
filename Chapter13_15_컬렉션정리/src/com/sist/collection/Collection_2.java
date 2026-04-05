package com.sist.collection;
/*
 *  제네릭(13장)
 *   => 코드 재사용 / 타입 안정성을 위한 도구
 *   => 클래스<클래스 타입>
 *   1. 제네릭을 사용하는 이유
 *   	ArrayList list = new ArrayList();
 *   	--------- 모든 데이터 저장 가능 Object
 *   	list.add("java");
 *   	list.add(10);
 *   	
 *   	=>String srt = list.get(0); -> 오류 발생
 *   					Object get(index 0)
 *   					=> (String)list.get(0)
 *   	=> int a = list.get(1);
 *   			  =>(Integer)list.get(1)
 *   	=> 어떤 데이터 타입이 첨부되었는지 알 수 없다
 *   	=> 데이터를 읽을때마다 형변환 필요
 *   	=> 잘못하면 ClassCastException발생
 *   2. 프로그램에서는 데이터타입(형)을 반드시 고정
 *   3. 불필요한 형변환은 가급적이면 안하는것이 좋다
 *   
 *   제네릭의 핵심
 *    - 데이터형 고정 => 데이터를 한가지만 설정, 가독성
 *    - 컴파일시 오류방지
 *    - 형변환 없이 사용 => 소스가 간결해진다
 *    
 *    class Box<T>
 *    {
 *    	T t;
 *    	public void setT(T t)
 *    	{
 *    		this.t = t;
 *    	}
 *    	public void getT()
 *    	{
 *    		return t;
 *    	}
 *    }
 *    
 *    Box box = new Box(); T: Object
 *    Box<String> box = new Box<String>(); T: String
 *    -> 클래스에 있는 테이터를 한번에 통일화
 *    
 *    class Pair<K,V>
 *    {
 *    	K key;
 *    	V value;
 *    }
 *    
 *    Pair<String,Integer> p = new Pair<>();
 *    -> 먼저 만들고 나중에 데이처형을 변경해서 사용
 *    
 *    => 제네릭을 사용하지 않는다면 경고가 뜬다
 *    
 *   4. 제한된 제네릭
 *   	
 *   	class Box<t extends Number>
 *   	{			-------
 *   		T value
 *   	}
 *   
 *   	Box<String> -> 오류 숫자만 입력
 *   	Box<Integer>
 *   	Box<Double>
 *   	Box<Float>
 *   
 *   5. 데이터형을 모르는 경우: 와일드 카드 -> <?> 
 *   	ArrayList<?> -> 경고가 없다
 *   	=> 와일드 카드는 읽기 전용 get()
 *   
 *   
 *   	-> extend 제한된 제네릭 -> 꺼내기 전용
 *   		 ? 	  타입을 모르는 경우 -> Only 읽기
 *   	  ------> 자바라이브러리에서 주로 나온다
 *   
 */
import java.util.*;
public class Collection_2 {
	public static void print(List<?> list)
	{
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
	
	//더하기는 숫자가 들어와야한다 
	/*
	 * 			Number
	 * 			  |
	 * 		-----------------------------
	 * 		|		|		|	  |		|
	 * 	Integer  Double  Float  Long  Byte
	 * 
	 */
	public static double sum(List<? extends Number> list)
	{
		double total = 0;
		for(Number n:list)
		{
			total += n.doubleValue();
		}
		
		return total;
		
	}
	public static void main(String[] args) {
		
		print(List.of("A","B","C"));
		print(List.of(1,2,3));
		//어떤 데이터형이든 관계없고
		//읽기만 가능 => 출력용
		//추가는 불가능
		
		System.out.println(sum(List.of(10,20,30,10)));
		System.out.println(sum(List.of(10.5,20.5,30.5)));
		
		/*
		 *  출력 => <?>
		 *  계산 => extends
		 *  ================> 람다 (스트림)
		 *  추가 => super
		 */
	}

}
