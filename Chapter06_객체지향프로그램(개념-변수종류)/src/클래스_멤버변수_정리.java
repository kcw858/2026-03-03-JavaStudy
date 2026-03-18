/*
 *  관련된 데이터를 모아서 관리 => 클래스
 *  --------- 데이터형이 다른경우
 *  사용자 정의 데이터형 => 일반 변수와 동일
 *  
 *   1.정적 변수
 *   	[접근지정어] static 데이터형 변수명;
 *   2.인스턴스 변수
 *   	[접근지정어] 데이터형 변수명;
 *   3.정적변수 / 인스턴스 변수는 반드시 클래스 블록안에 설정
 *     메소드 블록: 지역변수
 *   4.정적변수 / MethodArea (모든 객체가 데이터를 공유할 수 있께 만든다)
 *   					  (단 한개의 메모리 생성되는 공간)
 *   5.인스턴스변수 / Heap (실제 데이터가 저장)
 *   6.지역변수 / Stack (메모리 자체관리 => {}이 끝나면 자동으로 해제)
 *   			----	return
 *  
 * 	 * 변수 설정 => 데이터가 없는 프로그램은 없다
 *     ------ 가공
 *     데이터베이스
 *     
 *   7.인스턴스 변수와 정적변수 차이점
 *      	   인스턴스 변수             정적변수
 *   ----------------------------------------------
 *   선언방식   클래스블록 선언       클래스블록 선언 => static
 *   ----------------------------------------------
 *   저장시점    new 연산자 이용      컴파일시 자동 저장
 *   		 => 메모리공간이 확보
 *   ----------------------------------------------
 *   저장위치		  Heap				MethodArea
 *   		 개발자가 정하는 메모리공간	  =>메모리 공간 1개 생성
 *   			new/ delete
 *   ----------------------------------------------
 *   공유여부  객체마다 독립적인 메모리 	모든 객체가 하나의 메모리 공유
 *   		 공유하지 않는다
 *   ----------------------------------------------
 *   접근방식		객체.변수명				클래스명.변수명
 *   ----------------------------------------------
 *   생명주기	 객체가 메모리에 있는동안		프로그램 종료시까지
 *   ----------------------------------------------
 *   
 */
//달력만들기
// year, month입력
// 윤년처리
// 요일구하기
// 1일자부터 출력
import java.util.*;
class Diary
{
	int year,month,week,lastday; //클래스 내 모든 영역에서 사용 가능
	
	void init()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		System.out.print("월 입력: ");
		month = scan.nextInt();		
	}
	
	void 요일_마지막날_구하기()
	{
		Calendar cal = Calendar.getInstance();
		//객체 생성 => 추상클래스는 new사용 불가능
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastday = cal.getActualMaximum(Calendar.DATE);
		week -= 1;
	}
	
	void Print()
	{
		System.out.println(year + "년도 " + month + "월\n");
		String[] strWeek = {"일","월","화","수","목","금","토"};
		
		for(String s: strWeek)
		{
			System.out.print(s + "\t");
		}
		System.out.println("\n");
	
		/*
		 *  Calandar => month =0  week = 1
		 */
		for(int i = 1; i <= lastday ; i++)
		{
			if(i == 1)
			{
				for(int j = 0 ; j < week; j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%02d\t",i);
			week++;
			if(week > 6) 
			{
				week = 0;
				System.out.println();
			}
		}
	}
}
public class 클래스_멤버변수_정리 {
	int a = 10;
	void increment()
	{
		System.out.println("a= " + a);
		a--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스_멤버변수_정리 a = new 클래스_멤버변수_정리();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
//		a.increment();
		
		Diary d= new Diary();
		d.init();
		d.요일_마지막날_구하기();
		d.Print();
	}

}
