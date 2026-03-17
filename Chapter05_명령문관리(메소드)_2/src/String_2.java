/*
 * 		String은 뱐경할 수 없다 / 있는 그대로 사용
 * 		String의 단점 : final
 * 		-------------------- 표준화 (개발자가 동일하게 사용)
 * 검색
 * 
 * 
 * ------------
 * 	startsWidth : 첫글자가 동일 ======> 오라클은 A% 앞이 A인
 * 	endsWidth : 끝문자열이 같은 경우 ===> 오라클은 %A 뒤가 A인
 * ------------ 서제스트 (자동완성)
 * 	contains : 문자가 포함된  =======> 오라클은 %A% A가 포함된
 * ------------ 검색 
 */

import java.util.Scanner;
public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String[] subject = {
			"혼자 배우는 자바",
			"자바 AND Spring",
			"기본 자바",
			"이것이 자바",
			"Java AND JSP",
			"Oracle AND Java",
			"자바로 시작한 JSP",
			"JSP AND 자바"
		};
		
		// 크롤링 => 노래검색 / 맛집 / 명소
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String fd = scan.next();
		
		System.out.println("시작 문자열 찾기");
		for(String data : subject)
		{
			if(data.startsWith(fd))
			{
				//검색어로 시작하는 교재를 가져오기
				//웹의 쿠키 읽기
				System.out.println(data);
			}
		}
		
		System.out.println("끝나는 문자열 찾기");
		for(String data : subject)
		{
			if(data.endsWith(fd))
			{
				//검색어로 시작하는 교재를 가져오기
				//웹의 쿠키 읽기
				System.out.println(data);
			}
		}
		
		
		System.out.println("포함된 문자열 찾기: 가장 많이 사용");
		for(String data : subject)
		{
			if(data.contains(fd))
			{
				//검색어로 시작하는 교재를 가져오기
				//웹의 쿠키 읽기
				System.out.println(data);
			}
		}
	}

}
