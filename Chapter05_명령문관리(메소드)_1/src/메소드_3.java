/*
 *  int total = kor+eng+math;
 *  			------------ 매개변수
 *  		
 *  static int totalScore(int kor,int eng, nt math)
 *  {
 *  	return kor+eng+math;
 *  }
 *  
 *  int total = totalScore(90,80,100);
 *  
 *  
 *  - 가급적 매개변수가 적게 만든다.(배열, 클래스)
 *  - 리턴형 메소드명(매개변수...)
 *    {
 *    	리턴형이 void가 아닐경우 => return 값
 *    	리턴형이 void가일 경우 => 메소드 자체 값
 *    }
 *    
 *    프로그램
 *    ---------
 *    	=> 벤치마킹
 *    	=> 메소드 : 기능설정 => 기능에 들어가 있는 데이터 추출
 *    
 *    순위: 메소드 (1) / 변수 (2) / 클래스(3)
 *    -> 유지보수: 메소드 기능 변경    
 *    
 *    static int method(int a, int b)
 *    {
 *    	return a+b;
 *    }
 *    
 *    int add = mrthod(10,20);
 *   			-------호출
 *   			1. 10을 a에 대입
 *   			2. 20을 b에 대입
 *   			3. {}블록 안으로 진입 return값을 add에 전송
 *   
 *   -> 매개변수 / 지역변수
 *   	----------------> 지역변수로 메소드 안에서만 사용되는 변수
 *    
 *    메소드
 *    	1. 형식	
 *    		리턴형 / 매개변수 / 메소드명
 *      2. 호출
 *      	메소드명(실제값) -> 매개변수가 있는 경우
 *      	메소드명() -> 매개변수가 없는 상태
 *      3. 메소드안에 선언된 지역변수의 생명주기
 *      4. 저장위치
 *      ----------------------
 *      		methosarea -> 메소드 저장
 *      ----------------------
 *      		stack -> 매개변수,지역변수
 *      ----------------------
 *      		heap -> 멤버변수
 *      ----------------------
 *      5. 목적
 *      	- 재사용: 다른 클래스와 연결 (소프트웨어 : 메세지)
 *      	- 반복제거: 공통모듈
 *      	- 유지보수가 편리: 수정 및 추가
 *      	- 기능별로 나눠서 작업: 여러명이 동시에 작업 가능(분업화)
 *      	- 가독성이 좋다 -> 에러잡기 
 *      
 *      객체지향프로그램
 *      -> 메소드, 변수
 *    
 */
public class 메소드_3 {
	static void display()
	{
		System.out.println("display() 진입..");
		System.out.println("기능 처리");
		System.out.println("display() 종료..");
	}
	
	static void increment()
	{
		int a = 10; // 블록 안에서만 사용하는 변수(지역변수)
		System.out.println("a= " + a);
		a++;
	}// 블럭이 끝나면 a는 메모라애서 사라짐
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(); //메소드는 호출 후 종료가 되어야 다음문장으로 넘어간다
					// 여기서 문제가 생기면 다음으로 못넘어간다
		display();
		display();
		display();
		display();
		//메소드는 호출시마다 처음부터 실행
		//선언된 변수가 있는 경우에는 종료하면 사라진다
		
		increment();
		increment();
		increment();
	}

}
