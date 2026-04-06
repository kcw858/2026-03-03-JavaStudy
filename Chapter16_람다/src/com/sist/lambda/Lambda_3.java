package com.sist.lambda;

import lombok.Getter;
import lombok.Setter;

/*
 *  사용법
 *   인터페이스 사용
 *   ----------
 *   => 조건: 구현이 안된 메소드는 1개만
 *   		 default / static은 여러개 있어도 된다
 *   		 @FunctionalInterface
 *   		 jdk1.8부터
 *   => 라이브러리 활용이 많다
 *   	조건 검색 (if): filter
 *   	화면에 출력 forEach
 *   	=> JWT: 스프링 보안 -> 람다
 *   
 *   람다식 구조
 *   (매개변수) -> 구현
 *   (매개변수) -> {구현}
 *   			---- 살행을 어떻게 할지
 *    ----- 데이터전송
 *    
 *    1) 매개변수 없는 경우
 *    	() -> 실행문장
 *    2) 매개변수가 1개인 경우
 *    	name -> 실행문장
 *    3) 매개변수가 여러개인 경우
 *    	(값, 값 ..) -> {}
 *    4) 리턴형이 있는 경우
 *    	(a,b) -> {
 *    		int c = a+b;
 *    		return c;
 *    	}
 *    
 *    => 소스가 간결
 *    => 실무에서 주로 -> stream을 주로 사용 (17장)
 *    
 *    (x,y) -> x+y
 *    ----  -- ---- 실행내용
 *    입력값  해라
 *    
 *    => 리스트에서 주로 사용
 *    	1. 정렬
 *    	2. 조건 필터링
 *     	3. 값 반환
 *      4. 문자열 처리
 *      5. 최소 / 최대값
 *      6. 합계
 *      7. 평균
 *      
 *      17장 => 형식을 가지고 실제 처리하는 것
 *      ---
 *       생성: list.stream() -> Consumer
 *       가공: 중간 연산 => 필터링 -> Supplier
 *       결과: 최종 결과 => forEach / collect() -> Predicate
 *       							| 모아서 브라우저 전송
 *       				| 출력
 *       
 *       filter(): 조건에 맞는 데이터만 남긴다
 *       map(): 데이터를 다른 형태로 변경
 *       collect(): 해당 데이터 모으기(toList)
 *       forEach(): 화면에 출력
 *       			forEach(System.out::println)
 *       			// 메소드 참조
 */
//C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP

import java.util.*;
import java.io.*;
@Getter
@Setter
class Customer
{
	private String cno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regdate;
	private String grade;
	
}
class CustomerManager
{
	public static List<Customer> cList = new ArrayList<Customer>();
	
	static
	{
		try
		{
			FileReader fr = new FileReader("C:\\JavaDev\\고객.txt");
			String data ="";
			int i = 0;
			while((i = fr.read()) != -1)
			{
				data += (char)i;
			}
			fr.close();
			String[] datas = data.split("\n");
			for(String cust : datas)
			{
				StringTokenizer st = new StringTokenizer(cust,",");
				Customer c = new Customer();
				c.setCno(st.nextToken());
				c.setId(st.nextToken());
				c.setPwd(st.nextToken());
				c.setName(st.nextToken());
				c.setEmail(st.nextToken());
				c.setPhone(st.nextToken());
				c.setLoc(st.nextToken());
				c.setRegdate(st.nextToken());
				c.setGrade(st.nextToken());
				cList.add(c);
			}
		}catch(Exception ex) {}
	}
}
public class Lambda_3 {

	public static void main(String[] args) {
		CustomerManager cm = new CustomerManager();
		//1. 메뉴 생성
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 전체 목록");
			System.out.println("2. VIP 찾기");
			System.out.println("3. 서울 거주자");
			System.out.println("4. 종료");
			System.out.println("===============");
			System.out.print("메뉴입력: ");
			int menu = scan.nextInt();
			
			//람다 사용시 메소드명 , 매개변수 데이터형, return, break 생략
			//=> 분석이 어렵다 (가독성이 떨어짐)
			//즉석사용: 재사용 불가
			switch(menu)
			{
				case 4 -> 
				{
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				case 1 ->
				{
//					for(Customer c : CustomerManager.cList)
//					{
//						System.out.println(c.getId()+"."+c.getName());
//					}
					
					cm.cList.forEach(c->System.out.println(c.getId()+"."+c.getName()));
				}
				//VIP\r\n
				case 2 ->
				{
//					for(Customer c : cm.cList)
//					{
//						if(c.getGrade().contains("VIP")) //equals는 VIP\r
//						{
//							System.out.println(c.getName()+":"+c.getGrade());
//						}
//					}
					//filter 
					cm.cList.stream().filter(c -> c.getGrade().contains("VIP")) //if
						.forEach(c -> System.out.println(c.getName()+": "+c.getGrade())); //for
					
				}
				//반복 처리 => stream() 이용해서 처리
				case 3 ->
				{
					cm.cList.stream().filter(c -> c.getLoc().contains("서울"))
						.forEach(c -> System.out.println(c.getName()+": "+c.getLoc()));
				}
				default -> {System.out.println("없는 메뉴입니다");}
			}
			/*
			 *  stream()
			 *  1. 처리속도가 빠르다
			 *  2. 데이터 처리 가능
			 *     ----------- 통계 / 최소 / 최대
			 *  3. 데이터 자르기 편리 -> 페이징 가능
			 */
		}
	}

}
