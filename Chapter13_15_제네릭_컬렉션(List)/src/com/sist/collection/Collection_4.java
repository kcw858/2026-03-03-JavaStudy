package com.sist.collection;
/*
 *  제네릭(13장)
 *  
 *  1. 정의
 *   = 클래스나 메소드를 정의 할떄 사용할 데이터형을 표준화해서 사용
 *   = 데이터형의 안정성, 가독성
 *   = 재사용성이 좋다
 *   = 데이터형을 통일화 시킨다
 *   = 소스가 간결해진다 => 형변환없이 사용이 가능 (가독성)
 *   ArrayList list<String> = new ArrayList();
 *   list.add("홍길동"); // String만 넣을 수 있다
 *   list.add(30);
 *   list.add('A');
 *   list.add(180.5);
 *   
 *   => let a =10
 *   	a = 10.5
 *   	a = ""
 *   	a = {}
 *   	a = []
 *   	----------> 데이터형의 안정성이 없다
 *   
 *  2. 사용법
 *  	<쿨래스만 사용이 가능> 
 *  	 ----
 *  	<int> <double> X
 *  	<Integer> <Double> O Wrapper
 *  
 *  3. 메소드 (매개변수,리턴형) , 변수 -> 정체가 한번에 변경이 된다
 *   
 *   
 */
//사용자 정의 제네릭
class Box<T>
{
	T t;
	public void setT(T t)
	{
		this.t =t;
	}
	public T getT()
	{
		return t;
	}
}
/*
 *  Box box = new box() => T: Object
 */
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		Box<String> box1 = new Box<String>();
		/*
		 *  T: Type (클래스형)
		 *  E: Element
		 *  ----------------
		 *  K: Key
		 *  V: Value
		 *  ----------------> Map  Map<String,String)
		 *  
		 *  Object를 프로그램에 필요한 데이터형으로 변환해서 사용
		 */
	}

}
