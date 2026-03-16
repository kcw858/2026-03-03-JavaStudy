/*
 * 메소드 만들기
 * 	- 필요한 위치에서 호출 -> 메소드를 가지고 온다
 * 	- 필요한 위치가 다른 클래스일 수 있다.
 * 
 *  = 사용자 정의
 *  = 라이브러리 => 반드시 원형(리턴형, 매개변수)
 */
public class 메소드_재사용 {

	public static void main(String[] args) {
		// 다른 클래스에서 재사용
//		메소드_1.sum();// 호출
//		
//		String s ="Hello Java!!";
//		
//		char c = s.charAt(0);
//		//char java.lang.String.charAt(int index)
//		//----                        -----------
//		//리턴형						  	매개변수
//		
//		double d = Math.random();
//		//double java.lang.Math.random()
		
		메소드_2.process();
	}
	/*
	 * 
	 * 1. 매개변수는 상요자가 입력한 값
	 * 2. 입력값을 가공해서 결과값: retunr형
	 * 3. 정해진 것은 없다
	 * -----------------------------
	 * 	어떤 값을 받는지
	 * 	결과값 처리
	 * 	메소드 이름은 식별자 처리만 한면된다.
	 * 		
	 * 		=> 메소드는 호풀 시 반드시 처음부터 시작해 return을 만나면 종료
	 * 
	 * 	static boolean b()
	 *  { 
	 * 		int a = 10;
	 * 
	 * 		if(a%2 == 0)
	 * 			return true;
	 * 		else
	 * 			return false;
	 *  }
	 *  // 중간에 종료 가능
	 *  // return 다음줄에는 코딩 불가능
	 *  // void는 결과값이 없음(자체 처리, return 생략가능)
	 */

}
