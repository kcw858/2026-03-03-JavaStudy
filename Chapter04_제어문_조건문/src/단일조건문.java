/*
 * 	재어문 : 프로그램을 제어
 * 		1) 제어문의 종류
 * 			1. 조건문
 * 				단일조건문
 * 					형식) if(조건)   => 조건은 무조건 true/false만 사용가능
 * 						{ 
 * 							명령문;
 * 							명령문;
 * 						}
 * 					1)조건 결과가 false면 건너뛴다
 * 					2)조건 결과가 true일때만 {}안에 있는 명령문을 수행
 * 					3)독립적으로되어있어 모든 if문의 조건을 검색 (속도가 느려짐)
 * 				선택조건문
 * 				다중조건문
 * 			2. 선택문
 * 				선택문 : 다중조건문을 단순화
 * 			3. 반복문
 * 				for문 : 반복횟수 지정
 * 				while문 : 반복횟수 미지정 (선 조건검색)
 * 				do-while문 : 반복횟수 지정이 없는 경우 (반드시 한 번 이상 수행)
 * 			4. 반복제어문
 * 				 break : 반복 문장 중단
 * 				 continue : 특정 부분을 제외
 * 			5. 혼합
 * 	----------------------------------기본문법
 * 
 * 
 */
public class 단일조건문 {

	public static void main(String[] args) {

		//단일조건문
		int num = 15;
		
		if(num % 3 == 0) //조건 => 비교/논리/부정연산자
		{
			System.out.println(num + "는 3의 배수입니다.");
		}
		if(num % 5 == 0)
		{
			System.out.println(num + "는 5의 배수입니다.");
		}
		if(num % 7 == 0)
		{
			System.out.println(num + "는 7의 배수입니다.");
		}
		
		//================================================

		char c = '8';
		
		if(c >= 'A' && c <= 'Z')
		{
			System.out.println(c + "는 대문자입니다.");
		}
		if(c >= 'a' && c <= 'z')
		{
			System.out.println(c + "는 소문자입니다.");
		}
		if(c >= '0' && c <= '9')
		{
			System.out.println(c + "는 숫자입니다.");
		}
		
		
		String id = "admin";
		String pwd = "1234";
		
//		if(id.equals("admin") && pwd.equals("1234"))
//		{
//			System.out.println("로그인되었습니다.");
//		}
//		if(!(id.equals("admin") && pwd.equals("1234")))
//		{
//			System.out.println("아이디나 비밀번호가 틀립니다");
//		}
		
//		if(id == "admin" && pwd == "1234")
//		{
//			System.out.println("로그인되었습니다.");
//		}
		//문자열 비교는 .equals를 사용한다
		
		int a = 10;
		int b = 3;
	
		if(b == 0)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		if(b != 0)
		{
			System.out.println(a/(double)b);
		}
	}

}
