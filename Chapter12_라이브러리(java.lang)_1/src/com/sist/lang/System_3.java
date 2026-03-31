package com.sist.lang;
// GC
// => 멀티미디어(스트리밍 서버) => 화상채팅
// 네트워크: 자바 네트워크는 속도가 느리다 -> 인트라넷(사내메신저)
// 흐림 (CLient / Server)
// => 웹 (서버 / 클라이언트)
//       -->톰캣,레진
// 객체 메모리해제
//			new		 객체.메소드			 	System.gc()
// 클래스 --- 객체 ---- 객체활용 -----객체=null ---- GC호출
class Sawon
{
	public Sawon()
	{
		System.out.println("객체 생성");
	}
	public void print()
	{
		System.out.println("사원 정보 출력!! (객체 활용)");
	}
	
	//소멸자
	@Override
	protected void finalize() throws Throwable {	
		System.out.println("객체 소멸");
	}
	
}
public class System_3 {

	public static void main(String[] args) {
			Sawon s = new Sawon();
			s.print();
			s = null;
			System.gc(); // 바로 회수
	}

}
