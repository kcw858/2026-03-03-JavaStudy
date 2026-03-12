/*
 *  지역변수 : {}안에서만 사용가능
 *  		-> 자동 메모리 해제
 *  		-> 초기화가 된 상태에서 사용이 가능
 *  		-> char c = '' (오류) char c = ' '(가능)
 *  
 *  전역변수 : 다른 클래스에서 사용가능
 *  		-> 사용자가 삭제,GC사용해서 삭제
 */
public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용해서 ABCDE출력
		char c = 'A';
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.print(c++);
		}
		System.out.println();
		
		for(int i = 0 ; i < 5 ; i++)
		{
			char d = 'A';
			System.out.print(d++);
		}
		
		System.out.println();
		
		//상수 선언 final + 변수 대문자
		//배열이나 오라클 주소, 사이트 주소 등
		
		final double PIE = 3.14;
		//PIE = 2.00; 상수는 값 변경 불가능
	}

}
