/*
 * 
 *  학생 3명의 성적관리
 *  국어/영어/수학
 *  	=> 총점 / 평균 / 학점
 *  
 *  //배열의 필요성
 *  	-> 데이터 여러개를 한개의 이름으로 처리 : 배열, 클래스
 *  	-> 명령문을 한개의 이름으로 통합해서 관리 : 메소드
 *  	-> 클래스 여러개를 하나의 이름으로 관리 : 인터페이스
 *  
 *   자바
 *   	= 기초문법 => 변수, 연산자, 제어문
 *   	= 데이터 관리기법 => 배열, 클래스, 메소드
 *   	= 객체지향 => 데이터 보호, 재사용, 수정과 추가편리 
 *   	= 견고한 프로그램 => 예외처리
 *   	= 자바에서 제공하는 라이브러리
 *   	= 조립법 : 라이브러리 + 사용자 정의 => 프로그램 제작 
 *   
 */

import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// 배열의 필요성
		Scanner scan = new Scanner(System.in);
		
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;

		
		System.out.print("첫번째 학생의 국어 점수: ");
		kor1 =scan.nextInt();
		
		System.out.print("첫번째 학생의 영어 점수: ");
		eng1 =scan.nextInt();
		
		System.out.print("첫번째 학생의 수학 점수: ");
		math1 =scan.nextInt();
		
		total1 = kor1+eng1+math1;
		avg1= total1/3.0;
		
		System.out.print("두번째 학생의 국어 점수: ");
		kor2 =scan.nextInt();
		
		System.out.print("두번째 학생의 영어 점수: ");
		eng2 =scan.nextInt();
		
		System.out.print("두번째 학생의 수학 점수: ");
		math2 =scan.nextInt();
		
		total2 = kor2+eng2+math2;
		avg2= total2/3.0;
		
		System.out.print("세번째 학생의 국어 점수: ");
		kor3 =scan.nextInt();
		
		System.out.print("세번째 학생의 영어 점수: ");
		eng3 =scan.nextInt();
		
		System.out.print("세번째 학생의 수학 점수: ");
		math3 =scan.nextInt();
		
		total3 = kor3+eng3+math3;
		avg3= total3/3.0;
		
		System.out.printf("%5d%5d%5d%5d%7.2f\n",kor1,eng1,math1,total1,avg1);
		System.out.printf("%5d%5d%5d%5d%7.2f\n",kor2,eng2,math2,total2,avg2);
		System.out.printf("%5d%5d%5d%5d%7.2f\n",kor3,eng3,math3,total3,avg3);
	}
	/*
	 * 	데이터를 모아서 관리 => 배열
	 * 
	 * 	배열
	 * 		같은 데이터형을 여러개 모아서 관리
	 * 		이름 한개를 이용해서 관리가능
	 * 		장점: 변수 여러개를 한개의 이름으로 제어해 반복문 수행하기 편하다
	 * 			연속적으로 메모리에 저장(Index번호 사용 0번부터 시작)
	 * 		단점: 고정적이다.
	 * 			 추가나 삭제가 어렵다
	 * 			 대안(컬렉션- 가변형)
	 * 			 같은 데이터형만 사용가능 
	 * 			 RAM에 저장(프로그램 종료시 사라진다)
	 * 
	 * 
	 */

}
