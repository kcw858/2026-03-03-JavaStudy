/*
 * 메소드 형태 (4가지)
 * 1. 입력값 / 리턴값 모두 있는 메소드
 * 	=> 리턴값 메소드명(매개변수)
 * 	   {
 * 			return 결과값 -> 리턴값과 데이터형이 동일 / 반드시 한개만 설정
 * 						-> 결과값이 여러개 ([],클래스)
 *     }
 * 2. 입력값 / 리턴값 모두 없는 메소드 -> 자체 처리
 * 		void 메소드명()
 * 		{
 * 			return; -> 생략가능
 * 		}
 * 3. 입력값은 업속 리턴값만 있는 메소드
 * 		리턴값 메소드명()
 * 		{
 * 			return 값;
 * 		}
 * 4. 입력값은 있고 리턴값이 없는 메소드
 * 		void 메소드명(매개변수)
 * 		{
 * 			자체처리
 * 		}
 * 
 * 	=> 호출 방법
 * 		1. 리턴형 / 매개변수
 * 			데이터형 변수 = 메소드명(매개변수값)
 * 			----- 리턴형과 동일(데이터형은 리턴형보다 큰 데이터형이면 된다, 가급적 일치)
 * 		2. void
 * 			메소드명(매개변수)
 * 		3. 메소드 즉시 종료 : 필요한 위치 return설정
 * 			단독사용: void
 * 			선택적 사용
 * 		4. 형식
 * 			[접근지정어][옵션] 리턴형 메소드명(매개변수)	-> 선언부
 * 			--------  
 * 			 public / private / protect / default
 * 			{
 *  			-> 구현부
 * 			}
 * 		
 * 			=> 재사용 / 특정 기능을 만드는 경우
 * 			=> 객체지향의 핵심 : 변수 / 메소드
 * 			=> 메소드안에 변수/제어문/연산자
 * 			=> 메소드가 여러개 -> 클래스 (객체지향의 4대특성)
 */
import java.util.*;
public class 메소드_3 {
	// 단을 사용자가 입력시 해당 구구단 출력
	// 리턴, 자체처리출력
	
	static void gugudan(int dan)
	{
		for(int i = 1; i <=9; i++)
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		
		//구구단을 출력하는 메소드를 호출
		int dan = scan.nextInt();
		gugudan(dan);
		System.out.println("=======");
		System.out.print("단을 입력하세요: ");
		dan = scan.nextInt();
		
		gugudan(dan); 
		//메소드는 중복 기능 제거
		//에러잡기나 수정이 편리
	}

}
