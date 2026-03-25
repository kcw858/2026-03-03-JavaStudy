/*
 * 예외처리
 * 
 * 	목적: 비정상 종료를 방지하고 정상수행이 가능하도록 만듦 
 * 	정의: 사전에 에러를 방지하는 프로그램
 * 	예외처리 => 에러가 발생하면 부분을 제외하고 수행
 * 						 ------- 건너뛴다 (에러를 처리 x)
 * 	에러의 일종(예외)
 * 		사용자: 입력 => 잘못 입력된 경우
 * 				id 중복 체크없이 id입력 후 회원가입 버튼 클릭
 * 
 * 		개발자: 실수 => 인덱스 번호 / 변환 (윈도우,웹 => 문자열)
 * 		 => page = "123".... 
 * 		-----------------------------------------------
 * 		에러: 수정이 불가능
 *  	예외: 소스상에서 수정이 가능한 에러
 *  
 *	상속 과정
 *	------
 *					Object
 *					------
 *					  |
 *				  Throwable: 에러처리
 *					  |
 *			---------------------
 *			|					 |
 *		  Error				  Exception
 *								 |
 *						   -----------------
 *						   |			    |
 *					 CheckException			UnCheckException
 *					| 컴파일시					| 실행시
 *					| 반드시 예외처리			| 상황에따라	
 *					| IOException: file 	
 *						=> java.io
 *					| SQLException: DB
 *						=> java.sql
 *					| MalformedURLException: 네트워크
 *						=> java.net , URL
 *					| ClassNotFoundException: 메모리할당
 *						=> java.lang
 *					| InterruptedException: 쓰레드
 *						=> java.lang
 *
 *			UnCheckException
 *					|
 *			RuntimeException
 *					|
 *			NumberFormatException: 정수변환
 *				=> Integer.ParseInt("A")
 *				   Integer.ParseInt("10 ")
 *				웹에서 다른파일로 데이터 전송
 *				--------------------
 *				list.jsp
 *					|
 *				detail.jsp>no= 100 -> 공백 에러
 *			ArrayIndexOutOfBoundsException
 *				=> 인덱스 번호 초과
 *			NullPointException
 *				=> 객체 주소가 없을 때
 *			ClassCastException
 *
 *			...
 *
 *
 *			=> 메소드 -> if -> 예외처리
 *
 *		=> 에러 확인
 *		   ------
 *			catch절에서 주로 사용
 *			getMessage() / printStackTrace()
 *						  ------------------
 *							몇번째 줄에 에러가 있는지 확인
 *
 */
class A
{
	
}

class B extends A
{
	
}
public class 예외처리_1 {
	String msg;
	public static void main(String[] args) {
		try 
		{
			A a = new A();
			B b = (B)a;
		}
		catch (ClassCastException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//예외처리_1 a = new 예외처리_1();
//		예외처리_1 a = null;
//		a.msg.substring(2);
		
		//Integer.parseInt("100 ".trim());
		
		
//		int[] arr = new int[2];
//		try 
//		{
//			arr[0] = 10;
//			arr[2] = 20;
//		}catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println(ex.getMessage());
//		}

	}

}
