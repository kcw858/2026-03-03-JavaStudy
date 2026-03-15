/*
 * 
 *  1차 배열
 *  	1) 기능별 나눠서 저장
 *  	2)데이터형 : 같은 데이터형만 저장
 *  			  --------------- 작은 데이터형도가능
 *  			  int[] arr = {'a;'b','c'};
 *  			  --------------크거나 같다 (작은경우 형변환)
 *  
 *  	3) 선언
 *  		데이터형[] 배열명;
 *  
 *  	4) 초기값
 *  		명시적: int[] arr = {1,2,3,4}
 *  		먼저 선언: 데이터형[] 배열명 = new 데이터형[갯수]
 *  
 *  	5) 값변경
 *  		전체 변경 : for(int i = 0 ; i arr.length; i++)
 *  		한개 변경 : arr[인덱스] = 10
 *  
 *  	6) 출력
 *  		for-each문
 *  
 *  	7) 배열 참조
 *  		얕은 복사 : 별칭 => 참조배열을 동시에 사용이 가능
 *  		깊은 복사 : 배열을 통쨰로 복사 후 새로운 메모리에 저장
 *  
 *  	8) 배열 => 메모리 주소를 이용하는 프로그램 (배열/클래스)
 *  		stack - 주소     heap - 실제 데이터(연속적으로 메모리 할당, 반드시 동일한 크기로)
 *  	
 *  	arr[인덱스] = 일반 변수와 동일
 *  
 *  	String : char[]을 조작하는 클래스
 *  
 *  	인덱스 번호는 0번부터 시작한다
 *  	length는 한개가 많다
 *  	배열의 크기 : 배열명.length
 *  	한번 선언하면 고정(크기를 늘리거나 줄이려면 새로운 배열을 생성해야한다)
 *  
 */

import java.util.Scanner;

public class 배열_정리 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		영화데이터 movie = new 영화데이터();
		while(true)
		{
			System.out.println("========메뉴=======");
			System.out.println("1. 영화 목록");
			System.out.println("2. 영화 상세보기");
			System.out.println("3. 영화명 찾기");
			System.out.println("4. 출연진으로 영화 찾기");
			System.out.println("5. 장르별 찾기");
			System.out.println("6. 종료");
			System.out.println("==================");
			System.out.print("메뉴 선택: ");
			int menu = scan.nextInt();
			if(menu == 6)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu == 1)
			{
				for(int i = 0; i < 영화데이터.title.length; i++)
				{
					System.out.println((i+1) + "." +  movie.title[i]);
				}
			}
			else if(menu == 2)
			{
				System.out.print("상세볼 영화번호(1~1938): ");
				int no = scan.nextInt();
				if(no < 1 || no > 1938)
				{
					System.out.println("없는 영화입니다.");
					continue;
				}
				System.out.println("=====영화 상세=====");
				System.out.println("영화명: "+ movie.title[no-1]);
				System.out.println("장르: "+ movie.genre[no-1]);
				System.out.println("출연: "+ movie.actor[no-1]);
				System.out.println("감독: "+ movie.director[no-1]);
				System.out.println("개봉일: "+ movie.regdate[no-1]);
				System.out.println("등급: "+ movie.grade[no-1]);
			}
			else if(menu == 3)
			{
				System.out.print("검색어 입력: ");
				String fd = scan.next();
				for(String data: movie.title)
				{
					if(data.contains(fd))//contains : 포함된 글자찾기
					{
						System.out.println(data);
					}
				}
			}
			else if(menu == 4)
			{
				System.out.print("배우명 입력: ");
				String fd = scan.next();
				for(int i = 0 ; i < movie.actor.length ; i++)
				{
					if(movie.actor[i].contains(fd))//contains : 포함된 글자찾기
					{
						System.out.println(movie.title[i] +"(" + movie.actor[i] + ")");
					}
				}
			}
			else if(menu == 5)
			{
				System.out.print("장르 입력: ");
				String fd = scan.next();
				for(int i = 0 ; i < movie.genre.length ; i++)
				{
					if(movie.genre[i].contains(fd))//contains : 포함된 글자찾기
					{
						System.out.println(movie.title[i] +"(" + movie.genre[i] + ")");
					}
				}
			}
		}
		
	}

}
