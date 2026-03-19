/*
 *  232p
 *  
 *  모든 프로그램: 데이터(변수) + 메소드
 *  
 * 	메소드
 * 	 역할
 * 		1) 클래스와 클래스의 연결(통신) => 메세지
 * 		   매개변수(주고) 리턴형(받고)
 * 		2) 반복 제거 
 * 		3) 구조적인 프로그램
 * 		   절차적언어 ===> 나열 
 * 		   객체지향  ===>	구조적
 * 		4) 메소드는 호출시마다 {부터 }까지 수행 
 * 			=> 호출한 위치로 원상복귀
 * 		5) 구성요소
 * 			리턴형 
 * 			 사용자 요청에의한 처리 결과값 => 1개만 사용이 가능
 * 								  => 여러개면 배열이나 클래스로 리턴
 * 			매개변수
 * 			 사용자 요청 값 => 여러개, 한개 , 없음
 * 						   --------------
 * 							3개 이상이면 클래스 / 배열 이용		
 * 			메소드명
 * 			 소문자로 시작, 식별자를 따라간다, 약간의 의미는 부여해야한다 (보통 5자~10자 사이)
 * 			구현부
 * 			{
 * 				return 값; -> void인 경우 생략가능(컴파일시 자동추가)
 * 			} 
 * 	
 * 		생략 가능
 * 		- return
 * 		- 생성자
 * 		- import java.lang
 * 		- 모든 클래스 => 상속 Object
 * 
 * 		= 형식
 * 		[접근지정어][제어어] 리턴형 메소드명(매개변수...)
 * 		{
 * 			구현
 * 			return 결과값
 * 		}
 * 
 * 		static 메소드	===> 클래스명.메소드명(값)
 * 			-> 한개의 메모리안에 저장 => 공유
 * 		instance 메소드 ==> 객체명.메소드명(값)
 * 			-> 객체마다 따로 저장 => 독립
 * 			-> new마다 따로 저장
 * 
 * 		//오버로딩
 * 		aaa(int a,char c,int b)
 * 		aaa(int a,int c,float b)
 * 		aaa(double a,char c,char b)
 * 		aaa(char a,char c,char b)
 * 
 * 		aaa(10.5,10,10) => 없으면 가장 근사치인 것을 찾는다
 * 		
 */
class Methods
{
	int a =10;
	String name = "홍길동";
	static int b = 20;// 컴파일시 저장
	
	static void display() // 컴파일시 저장
	{
		System.out.println("Commons Methods");
	}
	//오버로딩
	void display(int a)
	{
		System.out.println("Instance Method");
	}
	
}
public class 메소드_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.메모리에 저장
		//Methods m = new Methods();
		System.out.println("b= " + Methods.b);
		Methods.display();
		// 목록 => 한번 저장 (모든 사람들이 같은 것을 봐야한다)
		
		Methods m = new Methods();
		m.display(100);
		System.out.println("a= " + m.a);
		/*
		 * 
		 * -----m-----
		 * 
		 *    ---a---
		 *    	10
		 *    --name--
		 *     "홍길동"
		 *    --------
		 *  display(int)
		 *    -------
		 * 
		 */
	}

}
