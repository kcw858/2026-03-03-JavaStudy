/*
 * 변수: 초기값이 없는 상태애서는 메모리에 저장이 안된다
 * 		=> 지역변수: 명시적, 입력값, 난수...
 * 		=> class에 선언된 변수는 자동 초기화
 * 		=> 프로그램 구동 => 초기값이 필요할때가 있다
 * 			ex) String URL = "오라클 주소";
 * 		=> 파일 읽기 / 쿠키읽기 ...
 * 		   ------------------- 명시적 초기화 불가능
 * 			----> 초기화 블록 / 생성자 이용
 * 
 *  초기값 => 생성자
 *  	생성자
 *  	1.특징: 일반 메소드와 다르다
 *  	 1) 클래스명과 동일
 *  	 2) 리턴형이 존재하지 않는다 -> void는 리턴이 생략된것
 *  	 3) 오버로딩 지원
 *  		-----
 *  			같은 이름의 메소드를 여러개 생성
 *  			**p226
 *  			1)메소드명이 동일해야한다
 *  			2)리턴형은 관계가 없다
 *  				int a()
 *  				double a(int v)
 *  			3)매개변수의 갯수나 데이터형이 다른경우
 *  			4)접근지정어 관계없다
 *  			5)같은 클래스안에서 생성
 *  	2.역할: 멤버변수의 초기화
 *  		   시작과 동시에 처리하는 기능
 *  			=> 네트워크 / 크롤링 / DB / UI
 * 				=> 웹, SpringAI
 * 				=> 클래스를 메모리에 저장하는 경우
 * 					-> new 생성자();
 * 		
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//생성자 자동생성
@AllArgsConstructor//매개변수를 모두 가지고있는 생성자
@NoArgsConstructor //매개변수가 없는 생성자
class A
{
	int a,b;
}
public class 생성자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
	}

}
