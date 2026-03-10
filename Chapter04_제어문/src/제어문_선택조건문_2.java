/*
 *  1.형식	 => 벤치마킹
 *  2.결과값   => 출력물(와이어 프레임)
 *  3.흐름	 => 유스케이스 다이어그램, 클래스 다이어그램, 시퀀스 다이어그앰
 *  4.동작순서  => 플로우 차트
 *  
 *  
 *  형식)
 *  	if(조건문)
 *  	{ 
 *  		조건이 true
 *  	}
 *  	else
 *  	{
 *  		조건이 false
 *  	}
 *  
 *  활용 연산자
 *  --------
 *  증감, 산술 => 단독
 *  비교, 논리, 부정 => 조건문, 반복문
 *  대입 => 단독: 결과값 받기
 */
import java.util.Scanner;
public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		//3개의 정수를 받아 평균이 60점 이하면 탈락, 이상이면 합격

		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = scan.nextInt();
		
		System.out.print("영어 점수 입력: ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수 입력: ");
		int math = scan.nextInt();
		
		int avg = (kor+eng+math) / 3;
		 
		//String result = avg >= 60 ? "합격" : "불합격";
		if(avg >= 60)
		{
			System.out.println("합격입니다!!");
		}
		else
		{
			System.out.println("불합격입니다ㅠㅠ");
		}
	}

}
