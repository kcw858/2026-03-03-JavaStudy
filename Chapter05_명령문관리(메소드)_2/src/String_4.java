/*
 * 
 *  변환
 *  
 *   toUpperCase : 대문자 변환
 *   	=> String toUpperCase()
 *   
 *   toLowerCase : 소문자 변환
 *   	=> String toLowerCase()
 *   
 *   replace : 지정된 문자(문자열) 변경
 *   	=> String replace(char c1, char c2)
 *   				   -------  -------
 *   				    찾는 문자  변경할 문자
 *   	=> String replace(String c1,String c2)
 *   	=> ex) "Hello Java".replace('a','b') -> "Hello Jbvb"
 *   	=> ex) "Hello Java".replace("Java,"Orcle") -> "Hello Orcle"
 *   
 *   replaceAll : 정규식을 이용하는 방식  ex) 맛있는 맛있고 맛있는 => 한번에 변환 가능 (맛있*)
 *   ----------> 크롤링 / 어려운 문자가 있는경우 사용
 *   	=> replaceAll(regex,"변경할 문자")
 *   				  -----
 *   				  [A-Z] : 대문자 전체
 *   				  [a-z] : 소문자 전체
 *   				  [0-9] : 숫자 전체
 *   				  ^[A-Z]: 대문자 시작
 *   				  [^A-Z]: 대문 제외
 *   				  [가-힣]: 한글 전체  
 *   					.   : 임의의 한글자
 */
//161page
public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toUpperCase
		//toLowerCase
		//오라클은 대소문자 구분이 없다 / 실제 저장된 데이터는 구분
		String msg = "Hello Java Javb Javc Javn";
		System.out.println("대문자로 변환: " + msg.toUpperCase()); //.은 메모리 주소 접근 연산자
		System.out.println("소문자로 변환: " + msg.toLowerCase());
		// 실제 데이터는 불변
		System.out.println("실제 데이터(불변): " + msg);
		
		//가급적이면 원본은 유지하는게 좋다
		
		//replace
		String s = msg.replace('l', 'k'); //같은 문자 모두 변환
		System.out.println(s);
		
		s = msg.replace("Java", "Spring");
		System.out.println(s);
		
		s = msg.replaceAll("Jav*", "Orar");
		System.out.println(s);
		// 여러개를 한번에 변경
	}

}
