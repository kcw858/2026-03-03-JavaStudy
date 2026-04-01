package com.sist.anno;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 *  어노테이션
 *   => 다른 프로그램에 정보를 제공
 *   => 책의 목차 (엔덱스)처럼 쉽게 찾을 수 있게 만들어 준다
 *   => 구분자
 *   	= 멤버변수
 *   	= ***클래스
 *   	= ***메소드
 *   	= 생성자
 *   
 *   1. 구분은 어떤 것을 할 것인지
 *   	@Target
 *   		TYPE ===> 클래스
 *   		METHOD ===> 메소드
 *   		CONSTRUCTOR ===> 생성자
 *   		FIELD ===> 멤버변수
 *   
 *   2. 저장기간
 *     SOURCE ==> 클래스 파일(.class)이 존재시까지
 *     CLASS ==> 컴파일시만 유지 -> 실행시 사라진다
 *     ***RUNTIME ==> 파일존재, 프로그램 종료시까지
 *     
 *     //기능은 없고 찾기 기능만 가지고 있다
 *   3. public @ interface 어노테이션
 *   	{
 *   		메소드;
 *   	}
 *   
 *   4. 배치 : 어노테이션은 항상 위에 배치 (옆은 가능) @ name
 *   	@=>TYPE
 *   	class ClassName
 *   	{
 *   		@=>FIELD
 *   		변수
 *   		@=>CONSTRUCTOR
 *   		생성자
 *   		@=>METHOD
 *   		메소드
 *   	}
 *   
 *     
 */

class Controller
{
	@RequestMapping("1") // GetMapping / PostMapping
	public void main_page()
	{
		System.out.println("Main page 이동");
	}
	@RequestMapping("2")
	public void member_join()
	{
		System.out.println("회원가입 이동");
	}
	@RequestMapping("3")
	public void login()
	{
		System.out.println("로그인 이동");
	}
	@RequestMapping("4")
	public void board_list()
	{
		System.out.println("게시판 이동");
	}
	@RequestMapping("5")
	public void food_list()
	{
		System.out.println("맛집 목록 이동");
	}
	@RequestMapping("6")
	public void food_detail()
	{
		System.out.println("맛집 상세보기 이동");
	}
	@RequestMapping("7")
	public void food_jjim()
	{
		System.out.println("맛집 찜하기 이동");
	}
	@RequestMapping("8")
	public void food_like()
	{
		System.out.println("맛집 좋아요 이동");
	}
}
public class 어노테이션_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=======메뉴=======");
		System.out.println("1. Main");
		System.out.println("2. 회원가입");
		System.out.println("3. 로그인");
		System.out.println("4. 게시판");
		System.out.println("5. 맛집 목록");
		System.out.println("6. 맛집 상세보기");
		
		System.out.print("메뉴 입력: ");
		int menu = scan.nextInt();
		
//		Controller c = new Controller();
//		if(menu == 1)
//			c.main_page();
//		else if(menu == 2)
//			c.member_join();
//		else if(menu == 3)
//			c.login();
//		else if(menu == 4)
//			c.board_list();
//		else if(menu == 5)
//			c.food_list();
//		else if(menu == 6)
//			c.food_detail();
		
		try 
		{
			//클래스 정보 얻기
			Class clsName = Class.forName("com.sist.anno.Controller");
			
			//객체 생성
			Object obj = clsName.getDeclaredConstructor().newInstance();
			
			//메소드 정보 가져오기
			Method[] methods = clsName.getDeclaredMethods();
			
			
			for(Method m : methods)
			{
				//메소드 위에있는 어노테이션 찾기
				RequestMapping rm = m.getAnnotation(RequestMapping.class); //메소드에 이 어노테이션이 있는것을 가져와라
				if(rm.value().equals(String.valueOf(menu)))
				{	//어노테이션에 있는 문자열과 사용자가 보낸 값이 같은경우
					
					//해당 메소드를 호출 => invoke(객체명,매개변수)
					m.invoke(obj, null);
				}
			}
		}catch(Exception ex) {}
	}
}
