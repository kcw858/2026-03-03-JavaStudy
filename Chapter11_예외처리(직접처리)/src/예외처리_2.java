/*
 *  예외처리 종류
 *  ---------
 *  ***직접처리: 에러 복구 => try~catch => 80%
 *  ***간접처리: 에러 회피	=> 19%
 *  		  에러 떠넘기기 => throws 
 *  임의발생: 테스트, 견고한 프로그램 확인: throw
 *  사용자 정의: 지원하지 않는 예외 => 1%
 *  		 class MyException extends Exception
 *  		 {
 *  		 } 
 *  
 *  
 *  1) 예외 복구
 *  	형식)
 *  		try
 *  		{
 *  			정상 수행이 가능한 문장
 *  		}catch(예상되는 예외처리 클래스) => 여러개 사용 가능
 *  		{						  => 순서가 존재 낮은거 부터 쓰기  ex) IOExeption, Exception 중 IOExeption 먼저
 *  			에러가 발생시 에러 복구									Exception 먼저 쓰면 IOExeption이 의미가 없다
 *  			에러가 발생시에 어떤 에러가 발생했는지
 *  		}
 *  		finally
 *  		{
 *  			생략가능
 *  			try절 / catch절 상관없이 무조건 수행하는 문장
 *  			=> 파일 닫기 / DB 연결 해재 / 서버 닫기
 *  		}
 */
public class 예외처리_2 {

	public static void main(String[] args) {

		try 
		{
			System.out.println("1");
			System.out.println("2");
			System.out.println(10/0);// catch 이동
			System.out.println("4");
		}catch(Exception e)
		{
			System.out.println("5");
		}
		finally
		{
			System.out.println("6");
		}
	}

}
