class Member{
	int mno;
	String name;
    static String compony = "Daum"; //화사명이 바뀌면 다같이 바꿔줘야한다
    //클래스는 한명에 대한 데이터
}
public class 클래스변수_설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회원 저장
		Member m1= new Member();
		System.out.println("m1= " + m1);
		m1.mno = 100;
		m1.name = "홍길동";
		
		Member m2= new Member();
		System.out.println("m2= " + m2);
		m2.mno = 200;
		m2.name = "심청이";
				
		Member m3= new Member();
		System.out.println("m3= " + m3);
		m3.mno = 300;
		m3.name = "박문수";
		
		System.out.println("회원 1 회원번호: " + m1.mno);
		System.out.println("회원 1 이름: " + m1.name);
		
		System.out.println("회원 2 회원번호: " + m2.mno);
		System.out.println("회원 2 이름: " + m2.name);
		
		System.out.println("회원 3 회원번호: " + m3.mno);
		System.out.println("회원 3 이름: " + m3.name);
		
		//변경
		m1.name = "홍길수";
		System.out.println("회원 1 이름: " + m1.name);
		System.out.println("회원 2 이름: " + m2.name);
		System.out.println("회원 3 이름: " + m3.name);
		
		m1.compony = "KaKao";
		System.out.println("회원 1 회사명 " + m1.compony);
		System.out.println("회원 2 회사명 " + m2.compony);
		System.out.println("회원 3 회사명 " + m3.compony);
		
		Member.compony = "Naver";
		System.out.println("회원 1 회사명 " + m1.compony);
		System.out.println("회원 2 회사명 " + m2.compony);
		System.out.println("회원 3 회사명 " + m3.compony);
		/*
		 * 인스턴스변수
		 * 	-> 객체.변수명 => 객체변수 (new 사용시마다 따로 저장)
		 * 정적변수
		 * 	-> 객체.변수명
		 * 	-> 클래스명.변수명 => 클래스변수 (자동 저장 변수)
		 * 
		 */
	}

}
