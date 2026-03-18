/*
 * 클래스
 *  학생 => 한명에 대한 설명
 *  맛집 => 맛집 한군데에 대한 정보
 *  래시피 => 레시피 한개에 대한 정보
 *  
 *  => 1개를 설계하고 new를 사용
 *  => 설계: 사이트의 상세보기
 *  	ex) 영화: CGV/메가박스/롯데시네마
 *  			------------------
 *  			| 공통으로 사용되는 변수
 *  			  ---추상화
 *  -----------------------------------
 *  
 *  학생 => 국어 / 영어 / 수학 / 총점 / 평균 / 학점 / 이름
 *  
 *  class Student
 *  {
 *  	int kor,eng,math,total;
 *  	double avg;
 *  	char score;
 *  	String name;
 *  }
 */
import java.util.*;
class Student
{
	int kor,eng,math,total;
	double avg;
	char score;
	String name;
	
}
/*
 * 학생 한명에 대한 모든 정보를 통합된 메모리에 저장이 된다
 *             ---------------------- 객체(메모리 주소)
 *  => 여러명 - 인스턴스
 *  => 한개  - 정적변수(한번에 변경이 되게 만드는것)
 *  		  ---- 거의 빈도수는 없다
 *  
 *  class ClassNAme
 *  {
 *  	-------------
 *  	변수 => 멤버변수
 *  	-------------
 *  	초기화 => 생성자
 *  			---- 클래스 이름과 동일
 *  			---- 단독으로 호출 불가능 (반드시 new를 사용)
 *  				 생략이 되면 자동으로 컴파일시에 추가
 *  	-------------
 *  	기능 설정 => 메소드
 *  	-------------
 *  }
 */
public class 클래스_변수_장점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[3];
		//데이터형 => 사용자 정의
		Scanner scan = new Scanner(System.in);
		for(int i =0; i < std.length ; i++)
		{
			Student s = new Student();
			System.out.print("이름 입력: ");
			s.name = scan.next();
			
			System.out.print((i+1) + "번째 국어 점수: ");
			s.kor = scan.nextInt();
			
			System.out.print((i+1) + "번째 영어 점수: ");
			s.eng = scan.nextInt();
			
			System.out.print((i+1) + "번째 수학 점수: ");
			s.math = scan.nextInt();
			
			s.total = s.kor+s.eng+s.math;
			s.avg = s.total / 3.0;
			
			std[i] = s;
		}
		
		for(Student ss : std)
		{
			System.out.printf("%5s%5d%5d%5d%7d%7.2f\n",ss.name,ss.kor,ss.eng,ss.math,ss.total,ss.avg);
		}
	}

}
