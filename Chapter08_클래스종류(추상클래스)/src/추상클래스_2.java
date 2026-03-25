/*
 * 328p : 추상클래스
 * 
 * 	1) 형식 / 구성요소
 * 		public abstract class ClassName
 * 		{	   --------추상적인(공통적인)
 * 			--------------------------
 * 			변수: static / instance
 * 			--------------------------
 * 			생성자 => 초기화
 * 			--------------------------
 * 			메소드
 * 				= 구현된 메소드
 * 					=> 같은 기능이 있는 경우
 * 				= 구현이 안된 메소드
 * 					=> 기능 => 경우의 수가 많은 경우 => 츠로그램에 맞게
 * 					public abstract 리턴형 메소드명();
 * 					-> 선언만
 * 					예) 
 * 						버튼을 클릭 => 로그인 버튼 / 취소 버튼 / 가입 버튼....
 * 						마우스 클릭 => 프로그램에 맞게 사용
 * 						키보드 클릭
 * 			--------------------------
 * 		}
 * 		공통으로 사용되는 메소드를 선언 => 미완성 클래스
 * 		=> 상속을 내려서 상속받은 클래스에서 구현해서 사용
 * 		=> new를 사용할 수 없다 (메모리 할당이 안된다)
 * 		=> 여러개의 클래스를 묶어서 한개의 이름으로 제어가 가능
 * 			변수가 10개 => 배열
 * 			클래스가 여러개 => 추상클래스 / 인터페이스
 * 			---------- 서로 다른 클래스 연결해서 사용
 * 			*** 데이터베이스: Mysql / MariaDB / Oracle.....
 * 				=> 드라이버 등록
 * 				=> 연결
 * 				=> sql문장 전송
 * 				   ----- SELECT / INSERT / UPDATE / DELETE
 * 				=> 결과
 * 				=> 닫기
 * 		=> 같은 클래스 => 묶어서 사용
 * 		   -------------------- 공통된 데이터 / 메소드 => 추상 클래스가 가능
 * 
 * 			서울 여행 / 부산 여행 / 제주 여행
 * 			-------------------------
 * 			- 목록, 상세보기, 예약, 교통편, 결제 ...  (공통점)
 * 			- 찜하기, 좋아요 ...
 * 
 * 		=> 유지 보수가 어려운 경우 => 기능 설정 => 필요시마다 따로 구현
 * 		   ----------------
 * 		   설계(요구사항) => 추상클래스 / 인터페이스
 */

import java.util.Calendar;

abstract class 도형
{
	public abstract void draw();
}

class 사각형 extends 도형
{

	@Override
	public void draw() 
	{
		System.out.println("사각형을 그린다");
	}
	
}

class 삼각형 extends 도형
{

	@Override
	public void draw() 
	{		
		System.out.println("삼각형을 그린다");
	}
	
} 

class 원 extends 도형
{

	@Override
	public void draw() 
	{
		System.out.println("원을 그린다");
	}
	
}

abstract class DBDriver
{
	
	//공통이라서 구현 내용이 똑같으면 선언
	public void  preparedStatement() 
	{
		System.out.println("SELECT문장 전송 => 데이터 검색");
	} //sql 문장 보내기
	
	public void  getResultSet() 
	{
		System.out.println("읽은 데이터 저장: 브라우저 전송");
	} // 결과값 가져오기

	
	public abstract void connection(); // 연결
	public abstract void disConnection(); // 닫기
	
}

class Oracle extends DBDriver
{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("오라클 연결");
	}

	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("오라클 닫기");
	}

	
}

class MySQL extends DBDriver
{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("MYSQL 연결");
	}


	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("MYSQL 닫기");
	}
	
}

class MariaDB
{
	
}

class MSSQL
{
	
}

class DB2
{
	//라이브러리 => 추상 / 일반
	// 객체생성 => new 이용하면 일반, 아니면 추상
	Calendar cal = Calendar.getInstance();
}

public class 추상클래스_2 {

	public static void main(String[] args) {
//		도형 a = new 사각형();
//		a.draw();
//		
//		a = new 삼각형();
//		a.draw();
//		
//		a = new 원();
//		a.draw();
		
		DBDriver db = new Oracle();
		db.connection();
		db.preparedStatement();
		db.getResultSet();
		db.disConnection();
		
		
		db = new MySQL();
		db.connection();
		db.preparedStatement();
		db.getResultSet();
		db.disConnection();
		
	}
}
