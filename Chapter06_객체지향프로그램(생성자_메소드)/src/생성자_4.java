/*
 * 생성자 P
 * 	=> 자신의 생성자를 호출이 가능하다
 *  => this() => 자신의 생성자 => 상속 super()
 *  => this => 객체(자신) => 상속 내린 클래스 : super
 *  
 * 
 *  1. 반복이 많으면 전체적으로 다 수정해야한다
 *  	--------------------------
 *  	공통모듈 : 수정이 편리하다
 *  
 *  
 */

class Member2
{
	//사용이 안되는 곳
	// static {}, static메소드 안에서는 사용이불가능
	// static 변수는 모든곳에서 사용이 가능
	int mno;
	String name;
	String address;
	
	
	Member2()
	{
		mno = 1;
		name = "홍길동";
		address ="서울";
	}
	
	Member2(String n)
	{
		this();//생성자 호출, 생성자 안에서만 사용 가능
			   //중복코딩이 많을때
			   // 반드시 첫번째 줄에 사용
		name = n;
	}
	
	Member2(String n,String a)
	{
		this(n);//현재 클래스 생성자 호출
		name = n;
		address = a;
	}
}
public class 생성자_4 {

	public static void main(String[] args) {
		
		Member2 m1 = new Member2();
		System.out.println("회원번호: " + m1.mno);  //1
		System.out.println("이름: " + m1.name); 	  //홍길동
		System.out.println("주소: " + m1.address); //서울
		
		
		Member2 m2 = new Member2("심청이");
		System.out.println("회원번호: " + m2.mno);  //0
		System.out.println("이름: " + m2.name); 	  //심청이
		System.out.println("주소: " + m2.address); //null
		
		Member2 m3 = new Member2("박문수","부산");
		System.out.println("회원번호: " + m3.mno);  //0
		System.out.println("이름: " + m3.name); 	  //박문수
		System.out.println("주소: " + m3.address); //부산
	}

}
